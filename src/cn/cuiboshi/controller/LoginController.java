package cn.cuiboshi.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cuiboshi.entity.User;
import cn.cuiboshi.service.IUserService;
import cn.cuiboshi.utils.StringUtil;

/**
 * 登录控制器
 * 
 * @author Administrator
 * 
 */
@Controller
public class LoginController {

	@Resource(name = "userServiceImpl")
	private IUserService userService;

	/**
	 * 用户登录
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("login")
	public String userLogin(HttpServletRequest request,User user, ModelMap map) {
		System.out.println(user.getUname()+""+user.getUpass());
		// 给密码进行MD5转换
		user.setUpass(StringUtil.encodeMd5(user.getUpass()));
		User u = userService.queryLogin(user);
		System.out.println(u);
		if (u!=null) {
			System.out.println("登录成功");
			request.getSession().setAttribute("loginUser", u);
			return "/WEB-INF/jsp/user_centent/user_centent_edit";
		} else {
			map.addAttribute("errors", "登录失败！请检查用户名或密码是否正确");
			System.out.println("登录失败");
			return "login";
		}
	}

}
