package cn.cuiboshi.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cuiboshi.entity.User;
import cn.cuiboshi.service.IUserService;

/**
 * ע�������
 * @author Administrator
 *
 */
@Controller
public class RegistController {

	@Resource(name="userServiceImpl")
	private IUserService userService;
	
	/**
	 * ע���û�
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("register")
	public String register(User user,ModelMap map){
		
		try {
			userService.register(user);
		} catch (Exception e) {
			map.addAttribute("error", "ע��ʧ�ܣ����Ժ����ԣ�����");
			return "regist";
//			e.printStackTrace();
		}
		
		return "forward:/login.jsp";
	}
	
}
