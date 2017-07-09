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
 * �޸�Email
 * @author Administrator
 *
 */
@Controller
public class UpdateEmail {
	
	@Resource(name = "userServiceImpl")
	private IUserService userService;

	//ҳ����ת���޸�Emailҳ�棬����session�л�ȡ��ԭ��������
	@RequestMapping("xgemail")
	public String xgemail(HttpServletRequest request,ModelMap map){
		
		User user2=(User) request.getSession().getAttribute("loginUser");
		System.out.println("session��:"+user2);
		if(user2==null){
			System.out.println("User����������");
			return "/WEB-INF/jsp/email_centent/update_email_error";
		}else{
			User user=(User) request.getSession().getAttribute("loginUser");
			System.out.println("��session�л�ȡ�������ǣ�"+user.getEmail());
			map.addAttribute("email", user.getEmail());
			return "/WEB-INF/jsp/email_centent/email_updateemail";
		}
		
		
		
	}
	
	
	/**
	 * ����Email��ȡ��֤��
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getEmailCode")
	public String getEmailUpass(@RequestParam(name="upass") String upass,
			@RequestParam(name="xemail") String xemail,
			HttpServletRequest request, User user,ModelMap map)
			throws Exception {
		//��ȡ��¼��ʱ�����Session���User����
		User u=(User) request.getSession().getAttribute("loginUser");
		System.out.println("��ȡsession��������ǣ�"+u.getUpass());
		
		System.out.println("��ȡ�������������ǣ�"+upass);
		System.out.println("��ȡ�����������������䣺"+xemail);
		
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
			maps.put("xemail", xemail);
			map.addAllAttributes(maps);
			
			request.getSession().setAttribute("upass", upass);
			request.getSession().setAttribute("xemail", xemail);
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
	@RequestMapping("updateEmail")
	public String stepTwo(
			HttpServletRequest request,HttpServletResponse response,User user,
			ModelMap map,SessionStatus session) {
		//��ȡ��¼��ʱ�����Session���User����
		User u=(User) request.getSession().getAttribute("loginUser");
		//��ȡsession�������
		String upass=u.getUpass();
		
		//�û����������
		String upass1=(String) request.getSession().getAttribute("upass");
		String xemail=(String) request.getSession().getAttribute("xemail");
//		User user1=(User) request.getSession().getAttribute("loginUser");
		
		//��֤�û���д����֤���Ƿ�ͷ��͵�����֤��һ��
		String emailCode=(String) request.getSession().getAttribute("loginVCode");
		System.out.println("�����session�е���֤���ǣ�"+emailCode);
		String userCode=user.getEmailCode();
		System.out.println("�û��������֤���ǣ�"+userCode);
		System.out.println("�û�����������ǣ�"+u.getEmail());
		
		System.out.println("session��õ��������ǣ�"+upass);
		
		System.out.println("�û�����������ǣ�"+upass1);
		user.setUpass(StringUtil.encodeMd5(upass1));
		
		System.out.println("�����Ժ�����������"+user.getUpass());
		
		if(emailCode.equals(userCode)&&user.getUpass().equals(upass)){
			//�����û������޸�����
			//��������浽ʵ������
			user.setUname(u.getUname());
			System.out.println("��ȡ�����û����ǣ�"+u.getUname());
			user.setEmail(xemail);
			System.out.println("�޸ĵ�����֮����"+user.getUpass());
			System.out.println("�޸�����֮����"+xemail);
			
			Integer row=userService.updateEmail(user);
			System.out.println("�޸ĵ������ǣ�"+row);
			if(row>0){
				//�����޸ĳɹ���Ϣ������
				try {
					EmailUtils.newInstance().sendHtmlEmail("�޸�����ɹ�", "�޸�����ɹ�", xemail);
					map.addAttribute("success", "�޸�����ɹ�,�����µ�¼��");
					
					//��������Session
					request.getSession().invalidate();
					
					System.out.println("�޸�����ɹ�");
					System.out.println("�޸ĺ�������ǣ�"+user.getEmail());
					
				} catch (Exception e) {
					map.addAttribute("error", "���粻����,���Ժ�����");
//					e.printStackTrace();
				}
				return "/WEB-INF/jsp/email_centent/update_email_success";
			}
		}
		map.addAttribute("error", "�޸�����ʧ��");
		return "/WEB-INF/jsp/email_centent/email_updateemail";
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
