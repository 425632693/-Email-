package cn.cuiboshi.service;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import cn.cuiboshi.entity.Jd;
import cn.cuiboshi.entity.User;

/**
 * �û�ҵ���߼���
 * @author Administrator
 *
 */
public interface IUserService {
	//ע���û�
	public void register(User user) throws Exception;
	//�һ������ѯ
	public List<User> queryBackUpass(User user);
	//�����û����޸�����
	public Integer updateUpass(User user);
	//�û���¼
	public User queryLogin(User user);
	
	//�����û����޸�����
	public Integer updateEmail(User user);
	
	//�ϴ�����
	public Integer uploading(Jd jd);
	
	//��ѯ���о���
	public Jd queryJd(Jd jd);
}
