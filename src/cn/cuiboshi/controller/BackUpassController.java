package cn.cuiboshi.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cuiboshi.entity.User;
import cn.cuiboshi.service.IUserService;
import cn.cuiboshi.utils.EmailUtils;
import cn.cuiboshi.utils.ImageCodeUtil;
/**
 * 找回密码控制器
 * @author Administrator
 *
 */

@Controller
public class BackUpassController {
	private String queryEmail;//存放查询出来的邮箱

	@Resource(name="userServiceImpl")
	private IUserService userService;
	
	//跳转到找回密码页面
	@RequestMapping("back")
	public String back(){
		return "/WEB-INF/jsp/backupass";
	}
	
	//跳转到用户中心页面
	@RequestMapping("user_content")
	public String user_content(){
		return "/WEB-INF/jsp/user_centent/user_centent_edit";
	}
	
	//用户中心的修改登录密码
//	@RequestMapping("updatepass")
//	public String updatepass(User user,ModelMap map){
//		List<User> list=userService.queryBackUpass(user);
//		
//		for(User item:list){
//			System.out.println(item);
//			String queryEmail=item.getEmail();
//			map.addAttribute("email", queryEmail);
//		}
//		return "/WEB-INF/jsp/updateupass";
//	}
	
	/**
	 * 找回密码第一步骤
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("backupassOne")
	public String stepOne(HttpServletRequest request,HttpServletResponse response,User user,
			ModelMap map) throws Exception{
		//认证邮箱是否存在
		List<User> list=userService.queryBackUpass(user);
		System.out.println(list.size());
		
		for(User item:list){
			System.out.println(item);
			String queryEmail=item.getEmail();
			request.getSession().setAttribute("email", queryEmail);
			map.addAttribute("email", queryEmail);
		}
		
		if(list.size()>0){
			//获取工具类
			ImageCodeUtil utils=ImageCodeUtil.getInstance();
			//生成随机数
			utils.getRandcode();
			//获取随机数
			String code=utils.getCode();
			//将随机数存到session中，用来进行对用户输入的值进行对比
			request.getSession().setAttribute("loginVCode", code);
			System.out.println("认证码是："+code);
			//发送认证码到邮箱
			EmailUtils.newInstance().sendHtmlEmail("找回密码认证码", "认证码是："+code, user.getEmail());
//			System.out.println("随机数是："+code);
		}
		
		//跳转页面到找回密码第二步骤
		return "/WEB-INF/jsp/updateupass";
	}
	
	/**
	 * 找回密码第二步骤
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("backupassTwo")
	public String stepTwo(HttpServletRequest request,HttpServletResponse response,User user,ModelMap map) {
		//认证用户填写的认证码是否和发送到的认证码一致
		String emailCode=(String) request.getSession().getAttribute("loginVCode");
		System.out.println("存放在session中的认证码是："+emailCode);
		String userCode=user.getEmailCode();
		System.out.println("用户输入的认证码是："+userCode);
		String userEmail=user.getEmail();
		System.out.println("用户输入的邮箱是："+userEmail);
		
		if(emailCode.equals(userCode)){
			//根据用户邮箱修改密码
			System.out.println("修改的密码是："+user.getUpass());
			Integer row=userService.updateUpass(user);
			System.out.println("修改的行数是："+row);
			if(row>0){
				//发送修改成功信息到邮箱
				try {
					EmailUtils.newInstance().sendHtmlEmail("修改密码成功", "新密码是："+user.getUpass(), user.getEmail());
					map.addAttribute("success", "修改密码成功");
					System.out.println("修改密码成功");
					System.out.println("修改后的密码是："+user.getUpass());
				} catch (Exception e) {
					map.addAttribute("error", "网络不给力,请稍后重试");
//					e.printStackTrace();
				}
				return "login";
			}
		}
		map.addAttribute("error", "修改密码失败!请检查认证码是否正确");
		return "/WEB-INF/jsp/updateupass";
		
		
		
		//如果一致则修改密码并且发送Email到邮箱提示用户密码修改完成
		//修改完成以后跳转到登录页面并且提示用户密码修改成功
		
	}
	
}
