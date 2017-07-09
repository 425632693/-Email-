package cn.cuiboshi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import cn.cuiboshi.entity.Jd;
import cn.cuiboshi.entity.User;

/**
 * ���ݷ��ʲ�
 * IUserMapper	�Ľӿ���
 * @author Administrator
 *
 */
public interface IUserMapper{
	
	//�û�ע��
	public void register(User user);
	
	//�һ������ѯ
	public List<User> queryBackUpass(User user);
	
	//�����û������޸�����
	@Update("update user set upass=#{upass} where email=#{email}")
	public Integer updateUpass(User user);
	
	//�û���¼
	public User queryLogin(User user);
	
	//�����û����޸�����
	@Update("update user set email=#{email} where uname=#{uname}")
	public Integer updateEmail(User user);
	
	//�ϴ�����
	public Integer uploading(Jd jd);
	
	//��ѯ���о���
	public Jd queryJd(Jd jd);
	
}
