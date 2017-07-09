package cn.cuiboshi.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cuiboshi.entity.Jd;
import cn.cuiboshi.entity.User;
import cn.cuiboshi.mapper.IUserMapper;
import cn.cuiboshi.service.IUserService;
import cn.cuiboshi.utils.EmailUtils;
import cn.cuiboshi.utils.StringUtil;

@Service
public class UserServiceImpl implements IUserService{

	@Resource(name="IUserMapper")
	private IUserMapper userMapper;
	
	/**
	 * 用户注册
	 */
	@Override
	public void register(User user) throws Exception {
		//注册用户
		user.setUserType("100001");
		user.setCreatTs(new Date());
		user.setUpass(StringUtil.encodeMd5(user.getUpass()));
		
		userMapper.register(user);
		
		//测试异常
//		int a=1/0;
		
		//提醒用户注册成功
//		EmailUtils.newInstance().sendHtmlEmail("欢迎来到亡者农药", user.getUname()+"注册成功", user.getEmail());
	}

	/**
	 * 找回密码查询
	 */
	@Override
	public List<User> queryBackUpass(User user) {
		List<User> list=userMapper.queryBackUpass(user);
		return list;
	}

	//根据用户名修改密码
	@Override
	public Integer updateUpass(User user) {
		//给密码进行MD5转换
		user.setUpass(StringUtil.encodeMd5(user.getUpass()));
		Integer row=userMapper.updateUpass(user);
		return row;
	}

	/**
	 * 用户登录
	 */
	@Override
	public User queryLogin(User user) {
		
		User u=userMapper.queryLogin(user);
		
		return u;
	}

	//根据用户名修改邮箱
	@Override
	public Integer updateEmail(User user) {
		Integer row=userMapper.updateEmail(user);
		return row;
	}

	
	/**
	 * 上传景点
	 */
	public Integer uploading(Jd jd){
		Integer row=userMapper.uploading(jd);
		return row;
	}

	/**
	 * 查询所哟景点
	 */
	@Override
	public Jd queryJd(Jd jd) {
		Jd j=userMapper.queryJd(jd);
		return j;
	}
	

	
	
	
}
