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
	 * �û�ע��
	 */
	@Override
	public void register(User user) throws Exception {
		//ע���û�
		user.setUserType("100001");
		user.setCreatTs(new Date());
		user.setUpass(StringUtil.encodeMd5(user.getUpass()));
		
		userMapper.register(user);
		
		//�����쳣
//		int a=1/0;
		
		//�����û�ע��ɹ�
//		EmailUtils.newInstance().sendHtmlEmail("��ӭ��������ũҩ", user.getUname()+"ע��ɹ�", user.getEmail());
	}

	/**
	 * �һ������ѯ
	 */
	@Override
	public List<User> queryBackUpass(User user) {
		List<User> list=userMapper.queryBackUpass(user);
		return list;
	}

	//�����û����޸�����
	@Override
	public Integer updateUpass(User user) {
		//���������MD5ת��
		user.setUpass(StringUtil.encodeMd5(user.getUpass()));
		Integer row=userMapper.updateUpass(user);
		return row;
	}

	/**
	 * �û���¼
	 */
	@Override
	public User queryLogin(User user) {
		
		User u=userMapper.queryLogin(user);
		
		return u;
	}

	//�����û����޸�����
	@Override
	public Integer updateEmail(User user) {
		Integer row=userMapper.updateEmail(user);
		return row;
	}

	
	/**
	 * �ϴ�����
	 */
	public Integer uploading(Jd jd){
		Integer row=userMapper.uploading(jd);
		return row;
	}

	/**
	 * ��ѯ��Ӵ����
	 */
	@Override
	public Jd queryJd(Jd jd) {
		Jd j=userMapper.queryJd(jd);
		return j;
	}
	

	
	
	
}
