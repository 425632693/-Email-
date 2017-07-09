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
 * ʹ��layer���޸ĵ�¼����
 * 
 * @author Administrator
 * 
 */
@Controller
public class UpdateLoginUpassController {
	@Resource(name = "userServiceImpl")
	private IUserService userService;
	
	

	/**
	 * ��ȡSession���������
	 * @param request
	 * @param user
	 * @param map
	 * @return
	 */
	@RequestMapping("xgupass")
	public String xgupass(HttpServletRequest request,User user,
			ModelMap map) {
			
		//�ж�session�Ƿ��Ѿ�ע�� �����û��ע����������sessionע��
//		if(session.isComplete()){
//			System.out.println("�ж�session�Ƿ����");
//			return "redirect:/login";
//		}
		System.out.println("��һ�ν����޸�����ҳ��");
		User user2=(User) request.getSession().getAttribute("loginUser");
		System.out.println("session��:"+user2);
		if(user2==null){
			System.out.println("User����������");
			return "/WEB-INF/jsp/user_centent/update_upass_error";
		}else{
			System.out.println("User�����Ѵ���");
			User u = (User) request.getSession().getAttribute("loginUser");
			System.out.println(u.getUname() + "===" + u.getEmail());
			map.addAttribute("email", u.getEmail());
		}

		return "/WEB-INF/jsp/user_centent/user_updateupass";
	}

	/**
	 * �޸ĵ�¼����
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
//			System.out.println("�޸�����ɹ�");
//			// map.addAttribute("success", "�û�"+u.getUname()+"�޸�����ɹ�");
//			return "/WEB-INF/jsp/user_centent/update_upass_success";
//		} else {
//			System.out.println("�޸�����ʧ��");
//			map.addAttribute("error", "�޸�����ʧ��");
//			return "/WEB-INF/jsp/updateupass";
//		}
//
//	}

	/**
	 * ����Email��ȡ��֤��
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getEmailUpass")
	public String getEmailUpass(@RequestParam(name="upass") String upass,
			@RequestParam(name="xpass") String xpass,
			HttpServletRequest request, User user,ModelMap map)
			throws Exception {
		//��ȡ��¼��ʱ�����Session���User����
		User u=(User) request.getSession().getAttribute("loginUser");
		System.out.println("��ȡsession��������ǣ�"+u.getUpass());
		
		
		System.out.println("��ȡ�������������ǣ�"+upass);
		System.out.println("��ȡ�����������������룺"+xpass);
		
		
		// ��֤�����Ƿ����
		List<User> list = userService.queryBackUpass(u);
		System.out.println(list.size());
		
		if(list.size()>0){
			// ��ȡ������
			ImageCodeUtil utils = ImageCodeUtil.getInstance();
			// ���������
			utils.getRandcode();
			// ��ȡ�����
			String code = utils.getCode();
			// ��������浽session�У��������ж��û������ֵ���жԱ�
			request.getSession().setAttribute("loginVCode", code);
			System.out.println("��֤���ǣ�" + code);
			// ������֤�뵽����
			EmailUtils.newInstance().sendHtmlEmail("�һ�������֤��", "��֤���ǣ�" + code,u.getEmail());
			
			Map<String, Object> maps=new HashMap<String, Object>();
			maps.put("email", u.getEmail());
			maps.put("upass", upass);
			maps.put("xpass", xpass);
			map.addAllAttributes(maps);
			
			request.getSession().setAttribute("upass", upass);
			request.getSession().setAttribute("xpass", xpass);
			return "/WEB-INF/jsp/email_centent/email_updateemail";
		}else{
			System.out.println("��֤�뷢��ʧ��");
			return "/WEB-INF/jsp/email_centent/email_updateemail";
		}
		

	}
	
	
	/**
	 * �޸�����
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
		//��ȡ��¼��ʱ�����Session���User����
		User u=(User) request.getSession().getAttribute("loginUser");
		String upass=(String) request.getSession().getAttribute("upass");
		String xpass=(String) request.getSession().getAttribute("xpass");
		User user1=(User) request.getSession().getAttribute("loginUser");
		
		//��֤�û���д����֤���Ƿ�ͷ��͵�����֤��һ��
		String emailCode=(String) request.getSession().getAttribute("loginVCode");
		System.out.println("�����session�е���֤���ǣ�"+emailCode);
		String userCode=user.getEmailCode();
		System.out.println("�û��������֤���ǣ�"+userCode);
		System.out.println("�û�����������ǣ�"+u.getEmail());
		
		System.out.println("�û������ԭ�����ǣ�"+upass);
		System.out.println("ԭ�����ǣ�"+u.getUpass());
		
		user.setUpass(StringUtil.encodeMd5(upass));
		
		System.out.println("�����Ժ�����������"+user.getUpass());
		
		if(emailCode.equals(userCode)&&user.getUpass().equals(u.getUpass())){
			//�����û������޸�����
			//��������浽ʵ������
			user.setUpass(xpass);
			user.setEmail(user1.getEmail());
			System.out.println(user.getUpass());
			System.out.println(user.getEmail());
			
			Integer row=userService.updateUpass(user);
			System.out.println("�޸ĵ������ǣ�"+row);
			if(row>0){
				//�����޸ĳɹ���Ϣ������
				try {
//					EmailUtils.newInstance().sendHtmlEmail("�޸�����ɹ�", "�������ǣ�"+user.getUpass(), user.getEmail());
					map.addAttribute("success", "�޸�����ɹ�,�����µ�¼��");
					
					//��������Session
					request.getSession().invalidate();
					
					System.out.println("�޸�����ɹ�");
					System.out.println("�޸ĺ�������ǣ�"+user.getUpass());
					
				} catch (Exception e) {
					map.addAttribute("error", "���粻����,���Ժ�����");
//					e.printStackTrace();
				}
				return "/WEB-INF/jsp/user_centent/update_upass_success";
			}
		}
		map.addAttribute("error", "�޸�����ʧ��");
		return "/WEB-INF/jsp/user_centent/user_updateupass";
	
	
	
	
	}
	
	
	

}
