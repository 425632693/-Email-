package cn.cuiboshi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import cn.cuiboshi.entity.Jd;
import cn.cuiboshi.entity.User;

/**
 * 数据访问层
 * IUserMapper	的接口类
 * @author Administrator
 *
 */
public interface IUserMapper{
	
	//用户注册
	public void register(User user);
	
	//找回密码查询
	public List<User> queryBackUpass(User user);
	
	//根据用户邮箱修改密码
	@Update("update user set upass=#{upass} where email=#{email}")
	public Integer updateUpass(User user);
	
	//用户登录
	public User queryLogin(User user);
	
	//根据用户名修改邮箱
	@Update("update user set email=#{email} where uname=#{uname}")
	public Integer updateEmail(User user);
	
	//上传景点
	public Integer uploading(Jd jd);
	
	//查询所有景点
	public Jd queryJd(Jd jd);
	
}
