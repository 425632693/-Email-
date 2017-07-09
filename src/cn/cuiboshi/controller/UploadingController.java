package cn.cuiboshi.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.cuiboshi.entity.Jd;
import cn.cuiboshi.service.IUserService;

/**
 * �ϴ�������
 * 
 * @author Administrator
 * 
 */
@Controller
public class UploadingController {
	@Resource(name = "userServiceImpl")
	private IUserService userService;

	@RequestMapping("upload")
	public String uploading(HttpServletRequest request,
			@RequestParam(name="jdImage1") MultipartFile file,
			Jd jd,ModelMap map) {

		System.out.println("---------"+file);
		// ��ȡ��Ŀ����ʵ����·��
		String realPath = request.getSession().getServletContext()
				.getRealPath("/");
		// �ж��Ƿ��Ѵ��ڣ��������������Ŀ�ﴴ��һ���ļ���Ŀ¼��
		String jdUpload = realPath + "/jdupload";
		File jdUploadPath = new File(jdUpload);
		if (!jdUploadPath.exists()) {
			jdUploadPath.mkdirs();
		}
		// ��ȡ�ļ�������
		String fileName = file.getOriginalFilename();
		// ��ȡ�ϴ����ļ���·��
		String filePath = jdUploadPath + "/" + fileName;
		
		System.out.println("�ļ��ϴ���·��"+filePath);
		
		jd.setJdImage(fileName);
		try {
			file.transferTo(new File(filePath));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		Integer row = userService.uploading(jd);
		System.out.println("�ϴ���������" + row);
		if (row > 0) {
			System.out.println("�ϴ�����ɹ�");
			return "forward:/refresh.htmlx";
		} else {
			System.out.println("�ϴ�����ʧ��");
			return "forward:/WEB-INF/jsp/upload/jdUploading";
		}

	}
	
	/**
	 * ��ѯ��ˢ��ҳ��
	 * @return
	 */
	@RequestMapping("refresh")
	public String refresh(){
		
		return "";
	}
	
	

	/**
	 * �ϴ�ҳ����ת
	 * 
	 * @return
	 */
	@RequestMapping("sctz")
	public String sctz() {
		return "/WEB-INF/jsp/upload/jdUploading";
	}
	
	@RequestMapping("testUp")
	public String testUp(HttpServletRequest request,
			@RequestParam(name="jdImage") MultipartFile file,
			Jd jd, ModelMap map){
		System.out.println("---------"+file);
		System.out.println("---------"+request);
		System.out.println("---------"+jd);
		return "login";
	}

}
