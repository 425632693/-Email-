package cn.cuiboshi.utils;

import java.util.UUID;

import org.springframework.util.DigestUtils;

/**
 * String ������
 * 
 * @author guyw
 *
 */
public class StringUtil {
	
	public static String uuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
		
	}
	
	/**
	 * Md5�����ַ���
	 * 
	 * @param ��Ҫ���ܵ�md5�ַ���
	 * @return
	 */
	public static String encodeMd5(String md5) {
		return DigestUtils.md5DigestAsHex(md5.getBytes());
	}
	
}
