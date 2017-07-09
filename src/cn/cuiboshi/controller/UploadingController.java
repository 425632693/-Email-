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
 * 上传控制器
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
		// 获取项目的真实部署路径
		String realPath = request.getSession().getServletContext()
				.getRealPath("/");
		// 判断是否已存在，如果不存在在项目里创建一个文件的目录，
		String jdUpload = realPath + "/jdupload";
		File jdUploadPath = new File(jdUpload);
		if (!jdUploadPath.exists()) {
			jdUploadPath.mkdirs();
		}
		// 获取文件的名称
		String fileName = file.getOriginalFilename();
		// 获取上传的文件的路径
		String filePath = jdUploadPath + "/" + fileName;
		
		System.out.println("文件上传的路径"+filePath);
		
		jd.setJdImage(fileName);
		try {
			file.transferTo(new File(filePath));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		Integer row = userService.uploading(jd);
		System.out.println("上传的行数：" + row);
		if (row > 0) {
			System.out.println("上传景点成功");
			return "forward:/refresh.htmlx";
		} else {
			System.out.println("上传景点失败");
			return "forward:/WEB-INF/jsp/upload/jdUploading";
		}

	}
	
	/**
	 * 查询并刷新页面
	 * @return
	 */
	@RequestMapping("refresh")
	public String refresh(){
		
		return "";
	}
	
	

	/**
	 * 上传页面跳转
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
