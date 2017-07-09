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
 * ��¼������
 * 
 * @author Administrator
 * 
 */
@Controller
public class LoginController {

	@Resource(name = "userServiceImpl")
	private IUserService userService;

	/**
	 * �û���¼
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("login")
	public String userLogin(HttpServletRequest request,User user, ModelMap map) {
		System.out.println(user.getUname()+""+user.getUpass());
		// ���������MD5ת��
		user.setUpass(StringUtil.encodeMd5(user.getUpass()));
		User u = userService.queryLogin(user);
		System.out.println(u);
		if (u!=null) {
			System.out.println("��¼�ɹ�");
			request.getSession().setAttribute("loginUser", u);
			return "/WEB-INF/jsp/user_centent/user_centent_edit";
		} else {
			map.addAttribute("errors", "��¼ʧ�ܣ������û����������Ƿ���ȷ");
			System.out.println("��¼ʧ��");
			return "login";
		}
	}

}
