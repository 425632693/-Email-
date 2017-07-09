package cn.cuiboshi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Administrator
 * 
 */
public class User implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String id;
	private String uname;
	private String upass;
	private String xpass;//新密码
	private String userType;
	private Date creatTs;
	private String email;//用户邮箱
	
	private String emailCode;//邮箱认证码
	
	private Integer provice;//省
	private Integer city;//市
	private Integer area;//区县
	private String address;//详细地址
	
	
	
	public User(){
		super();
	}
	
	public User(String id, String uname, String upass) {
		this.id=id;
		this.uname=uname;
		this.upass=upass;
		
	}

	public User(String uname,String upass){
		this.uname=uname;
		this.upass=upass;
	}
	
	

	public User(String id, String uname, String upass, String userType,
			Date creatTs) {
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.userType = userType;
		this.creatTs = creatTs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getCreatTs() {
		return creatTs;
	}

	public void setCreatTs(Date creatTs) {
		this.creatTs = creatTs;
	}

	public Integer getProvice() {
		return provice;
	}

	public void setProvice(Integer provice) {
		this.provice = provice;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailCode() {
		return emailCode;
	}

	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}

	public String getXpass() {
		return xpass;
	}

	public void setXpass(String xpass) {
		this.xpass = xpass;
	}
	
	

}
