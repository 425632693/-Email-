package cn.cuiboshi.service;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import cn.cuiboshi.entity.Jd;
import cn.cuiboshi.entity.User;

/**
 * 用户业务逻辑层
 * @author Administrator
 *
 */
public interface IUserService {
	//注册用户
	public void register(User user) throws Exception;
	//找回密码查询
	public List<User> queryBackUpass(User user);
	//根据用户名修改密码
	public Integer updateUpass(User user);
	//用户登录
	public User queryLogin(User user);
	
	//根据用户名修改邮箱
	public Integer updateEmail(User user);
	
	//上传景点
	public Integer uploading(Jd jd);
	
	//查询所有景点
	public Jd queryJd(Jd jd);
}
