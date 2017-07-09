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
 * �һ����������
 * @author Administrator
 *
 */

@Controller
public class BackUpassController {
	private String queryEmail;//��Ų�ѯ����������

	@Resource(name="userServiceImpl")
	private IUserService userService;
	
	//��ת���һ�����ҳ��
	@RequestMapping("back")
	public String back(){
		return "/WEB-INF/jsp/backupass";
	}
	
	//��ת���û�����ҳ��
	@RequestMapping("user_content")
	public String user_content(){
		return "/WEB-INF/jsp/user_centent/user_centent_edit";
	}
	
	//�û����ĵ��޸ĵ�¼����
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
	 * �һ������һ����
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("backupassOne")
	public String stepOne(HttpServletRequest request,HttpServletResponse response,User user,
			ModelMap map) throws Exception{
		//��֤�����Ƿ����
		List<User> list=userService.queryBackUpass(user);
		System.out.println(list.size());
		
		for(User item:list){
			System.out.println(item);
			String queryEmail=item.getEmail();
			request.getSession().setAttribute("email", queryEmail);
			map.addAttribute("email", queryEmail);
		}
		
		if(list.size()>0){
			//��ȡ������
			ImageCodeUtil utils=ImageCodeUtil.getInstance();
			//���������
			utils.getRandcode();
			//��ȡ�����
			String code=utils.getCode();
			//��������浽session�У��������ж��û������ֵ���жԱ�
			request.getSession().setAttribute("loginVCode", code);
			System.out.println("��֤���ǣ�"+code);
			//������֤�뵽����
			EmailUtils.newInstance().sendHtmlEmail("�һ�������֤��", "��֤���ǣ�"+code, user.getEmail());
//			System.out.println("������ǣ�"+code);
		}
		
		//��תҳ�浽�һ�����ڶ�����
		return "/WEB-INF/jsp/updateupass";
	}
	
	/**
	 * �һ�����ڶ�����
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("backupassTwo")
	public String stepTwo(HttpServletRequest request,HttpServletResponse response,User user,ModelMap map) {
		//��֤�û���д����֤���Ƿ�ͷ��͵�����֤��һ��
		String emailCode=(String) request.getSession().getAttribute("loginVCode");
		System.out.println("�����session�е���֤���ǣ�"+emailCode);
		String userCode=user.getEmailCode();
		System.out.println("�û��������֤���ǣ�"+userCode);
		String userEmail=user.getEmail();
		System.out.println("�û�����������ǣ�"+userEmail);
		
		if(emailCode.equals(userCode)){
			//�����û������޸�����
			System.out.println("�޸ĵ������ǣ�"+user.getUpass());
			Integer row=userService.updateUpass(user);
			System.out.println("�޸ĵ������ǣ�"+row);
			if(row>0){
				//�����޸ĳɹ���Ϣ������
				try {
					EmailUtils.newInstance().sendHtmlEmail("�޸�����ɹ�", "�������ǣ�"+user.getUpass(), user.getEmail());
					map.addAttribute("success", "�޸�����ɹ�");
					System.out.println("�޸�����ɹ�");
					System.out.println("�޸ĺ�������ǣ�"+user.getUpass());
				} catch (Exception e) {
					map.addAttribute("error", "���粻����,���Ժ�����");
//					e.printStackTrace();
				}
				return "login";
			}
		}
		map.addAttribute("error", "�޸�����ʧ��!������֤���Ƿ���ȷ");
		return "/WEB-INF/jsp/updateupass";
		
		
		
		//���һ�����޸����벢�ҷ���Email��������ʾ�û������޸����
		//�޸�����Ժ���ת����¼ҳ�沢����ʾ�û������޸ĳɹ�
		
	}
	
}
