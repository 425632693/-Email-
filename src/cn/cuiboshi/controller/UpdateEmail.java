package cn.cuiboshi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import cn.cuiboshi.entity.User;
import cn.cuiboshi.service.IUserService;
import cn.cuiboshi.utils.EmailUtils;
import cn.cuiboshi.utils.ImageCodeUtil;
import cn.cuiboshi.utils.StringUtil;

/**
 * 修改Email
 * @author Administrator
 *
 */
@Controller
public class UpdateEmail {
	
	@Resource(name = "userServiceImpl")
	private IUserService userService;

	//页面跳转到修改Email页面，并从session中获取到原来的邮箱
	@RequestMapping("xgemail")
	public String xgemail(HttpServletRequest request,ModelMap map){
		
		User user2=(User) request.getSession().getAttribute("loginUser");
		System.out.println("session是:"+user2);
		if(user2==null){
			System.out.println("User对象已销毁");
			return "/WEB-INF/jsp/email_centent/update_email_error";
		}else{
			User user=(User) request.getSession().getAttribute("loginUser");
			System.out.println("从session中获取的邮箱是："+user.getEmail());
			map.addAttribute("email", user.getEmail());
			return "/WEB-INF/jsp/email_centent/email_updateemail";
		}
		
		
		
	}
	
	
	/**
	 * 发送Email获取认证码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getEmailCode")
	public String getEmailUpass(@RequestParam(name="upass") String upass,
			@RequestParam(name="xemail") String xemail,
			HttpServletRequest request, User user,ModelMap map)
			throws Exception {
		//获取登录的时候存在Session里的User对象
		User u=(User) request.getSession().getAttribute("loginUser");
		System.out.println("获取session里的密码是："+u.getUpass());
		
		System.out.println("获取输入框里的密码是："+upass);
		System.out.println("获取输入框里输入的新邮箱："+xemail);
		
		// 认证邮箱是否存在
		List<User> list = userService.queryBackUpass(u);
		System.out.println(list.size());
		
		if(list.size()>0){
			// 获取工具类
			ImageCodeUtil utils = ImageCodeUtil.getInstance();
			// 生成随机数
			utils.getRandcode();
			// 获取随机数
			String code = utils.getCode();
			// 将随机数存到session中，用来进行对用户输入的值进行对比
			request.getSession().setAttribute("loginVCode", code);
			System.out.println("认证码是：" + code);
			// 发送认证码到邮箱
			EmailUtils.newInstance().sendHtmlEmail("找回密码认证码", "认证码是：" + code,u.getEmail());
			
			Map<String, Object> maps=new HashMap<String, Object>();
			maps.put("email", u.getEmail());
			maps.put("upass", upass);
			maps.put("xemail", xemail);
			map.addAllAttributes(maps);
			
			request.getSession().setAttribute("upass", upass);
			request.getSession().setAttribute("xemail", xemail);
			return "/WEB-INF/jsp/email_centent/email_updateemail";
		}else{
			System.out.println("认证码发送失败");
			return "/WEB-INF/jsp/email_centent/email_updateemail";
		}
		

	}
	
	
	/**
	 * 修改密码
	 * @param request
	 * @param response
	 * @param user
	 * @param map
	 * @return
	 */
	@RequestMapping("updateEmail")
	public String stepTwo(
			HttpServletRequest request,HttpServletResponse response,User user,
			ModelMap map,SessionStatus session) {
		//获取登录的时候存在Session里的User对象
		User u=(User) request.getSession().getAttribute("loginUser");
		//获取session里的密码
		String upass=u.getUpass();
		
		//用户输入的密码
		String upass1=(String) request.getSession().getAttribute("upass");
		String xemail=(String) request.getSession().getAttribute("xemail");
//		User user1=(User) request.getSession().getAttribute("loginUser");
		
		//认证用户填写的认证码是否和发送到的认证码一致
		String emailCode=(String) request.getSession().getAttribute("loginVCode");
		System.out.println("存放在session中的认证码是："+emailCode);
		String userCode=user.getEmailCode();
		System.out.println("用户输入的认证码是："+userCode);
		System.out.println("用户输入的邮箱是："+u.getEmail());
		
		System.out.println("session里得到的密码是："+upass);
		
		System.out.println("用户输入的密码是："+upass1);
		user.setUpass(StringUtil.encodeMd5(upass1));
		
		System.out.println("加密以后的输入的密码"+user.getUpass());
		
		if(emailCode.equals(userCode)&&user.getUpass().equals(upass)){
			//根据用户邮箱修改密码
			//把新密码存到实体类里
			user.setUname(u.getUname());
			System.out.println("获取到的用户名是："+u.getUname());
			user.setEmail(xemail);
			System.out.println("修改的条件之密码"+user.getUpass());
			System.out.println("修改条件之邮箱"+xemail);
			
			Integer row=userService.updateEmail(user);
			System.out.println("修改的行数是："+row);
			if(row>0){
				//发送修改成功信息到邮箱
				try {
					EmailUtils.newInstance().sendHtmlEmail("修改邮箱成功", "修改邮箱成功", xemail);
					map.addAttribute("success", "修改邮箱成功,请重新登录！");
					
					//彻底销毁Session
					request.getSession().invalidate();
					
					System.out.println("修改邮箱成功");
					System.out.println("修改后的邮箱是："+user.getEmail());
					
				} catch (Exception e) {
					map.addAttribute("error", "网络不给力,请稍后重试");
//					e.printStackTrace();
				}
				return "/WEB-INF/jsp/email_centent/update_email_success";
			}
		}
		map.addAttribute("error", "修改邮箱失败");
		return "/WEB-INF/jsp/email_centent/email_updateemail";
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
