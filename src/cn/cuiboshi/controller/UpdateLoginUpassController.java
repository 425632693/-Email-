package cn.cuiboshi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
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
 * 使用layer层修改登录密码
 * 
 * @author Administrator
 * 
 */
@Controller
public class UpdateLoginUpassController {
	@Resource(name = "userServiceImpl")
	private IUserService userService;
	
	

	/**
	 * 获取Session里面的邮箱
	 * @param request
	 * @param user
	 * @param map
	 * @return
	 */
	@RequestMapping("xgupass")
	public String xgupass(HttpServletRequest request,User user,
			ModelMap map) {
			
		//判断session是否已经注销 ，如果没有注销就设置让session注销
//		if(session.isComplete()){
//			System.out.println("判断session是否存在");
//			return "redirect:/login";
//		}
		System.out.println("第一次进来修改密码页面");
		User user2=(User) request.getSession().getAttribute("loginUser");
		System.out.println("session是:"+user2);
		if(user2==null){
			System.out.println("User对象已销毁");
			return "/WEB-INF/jsp/user_centent/update_upass_error";
		}else{
			System.out.println("User对象已创建");
			User u = (User) request.getSession().getAttribute("loginUser");
			System.out.println(u.getUname() + "===" + u.getEmail());
			map.addAttribute("email", u.getEmail());
		}

		return "/WEB-INF/jsp/user_centent/user_updateupass";
	}

	/**
	 * 修改登录密码
	 * @param request
	 * @param user
	 * @param map
	 * @return
	 */
//	@RequestMapping("updateUpass")
//	public String updateUpass(HttpServletRequest request, User user,
//			ModelMap map) {
//		
//		Integer row = userService.updateUpass(user);
//		if (row > 0) {
//			System.out.println("修改密码成功");
//			// map.addAttribute("success", "用户"+u.getUname()+"修改密码成功");
//			return "/WEB-INF/jsp/user_centent/update_upass_success";
//		} else {
//			System.out.println("修改密码失败");
//			map.addAttribute("error", "修改密码失败");
//			return "/WEB-INF/jsp/updateupass";
//		}
//
//	}

	/**
	 * 发送Email获取认证码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getEmailUpass")
	public String getEmailUpass(@RequestParam(name="upass") String upass,
			@RequestParam(name="xpass") String xpass,
			HttpServletRequest request, User user,ModelMap map)
			throws Exception {
		//获取登录的时候存在Session里的User对象
		User u=(User) request.getSession().getAttribute("loginUser");
		System.out.println("获取session里的密码是："+u.getUpass());
		
		
		System.out.println("获取输入框里的密码是："+upass);
		System.out.println("获取输入框里输入的新密码："+xpass);
		
		
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
			maps.put("xpass", xpass);
			map.addAllAttributes(maps);
			
			request.getSession().setAttribute("upass", upass);
			request.getSession().setAttribute("xpass", xpass);
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
	@RequestMapping("updateUpassTwo")
	public String stepTwo(
			HttpServletRequest request,HttpServletResponse response,User user,
			ModelMap map,SessionStatus session) {
		//获取登录的时候存在Session里的User对象
		User u=(User) request.getSession().getAttribute("loginUser");
		String upass=(String) request.getSession().getAttribute("upass");
		String xpass=(String) request.getSession().getAttribute("xpass");
		User user1=(User) request.getSession().getAttribute("loginUser");
		
		//认证用户填写的认证码是否和发送到的认证码一致
		String emailCode=(String) request.getSession().getAttribute("loginVCode");
		System.out.println("存放在session中的认证码是："+emailCode);
		String userCode=user.getEmailCode();
		System.out.println("用户输入的认证码是："+userCode);
		System.out.println("用户输入的邮箱是："+u.getEmail());
		
		System.out.println("用户输入的原密码是："+upass);
		System.out.println("原密码是："+u.getUpass());
		
		user.setUpass(StringUtil.encodeMd5(upass));
		
		System.out.println("加密以后的输入的密码"+user.getUpass());
		
		if(emailCode.equals(userCode)&&user.getUpass().equals(u.getUpass())){
			//根据用户邮箱修改密码
			//把新密码存到实体类里
			user.setUpass(xpass);
			user.setEmail(user1.getEmail());
			System.out.println(user.getUpass());
			System.out.println(user.getEmail());
			
			Integer row=userService.updateUpass(user);
			System.out.println("修改的行数是："+row);
			if(row>0){
				//发送修改成功信息到邮箱
				try {
//					EmailUtils.newInstance().sendHtmlEmail("修改密码成功", "新密码是："+user.getUpass(), user.getEmail());
					map.addAttribute("success", "修改密码成功,请重新登录！");
					
					//彻底销毁Session
					request.getSession().invalidate();
					
					System.out.println("修改密码成功");
					System.out.println("修改后的密码是："+user.getUpass());
					
				} catch (Exception e) {
					map.addAttribute("error", "网络不给力,请稍后重试");
//					e.printStackTrace();
				}
				return "/WEB-INF/jsp/user_centent/update_upass_success";
			}
		}
		map.addAttribute("error", "修改密码失败");
		return "/WEB-INF/jsp/user_centent/user_updateupass";
	
	
	
	
	}
	
	
	

}
