package cn.cuiboshi.utils;

import java.util.UUID;

import org.springframework.util.DigestUtils;

/**
 * String 工具类
 * 
 * @author guyw
 *
 */
public class StringUtil {
	
	public static String uuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
		
	}
	
	/**
	 * Md5加密字符串
	 * 
	 * @param 需要加密的md5字符串
	 * @return
	 */
	public static String encodeMd5(String md5) {
		return DigestUtils.md5DigestAsHex(md5.getBytes());
	}
	
}
