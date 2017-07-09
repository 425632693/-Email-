package cn.cuiboshi.entity;

/**
 * 景点实体类
 * 
 * @author Administrator
 * 
 */
public class Jd {

	private String jdId;// 景点id
	private String jdName;// 景点名称
	private String jdContent;// 景点介绍
	private String jsProvince;// 景点所在省
	private String jdImage;// 景点图片

	public String getJdId() {
		return jdId;
	}

	public void setJdId(String jdId) {
		this.jdId = jdId;
	}

	public String getJdName() {
		return jdName;
	}

	public void setJdName(String jdName) {
		this.jdName = jdName;
	}

	public String getJdContent() {
		return jdContent;
	}

	public void setJdContent(String jdContent) {
		this.jdContent = jdContent;
	}

	public String getJsProvince() {
		return jsProvince;
	}

	public void setJsProvince(String jsProvince) {
		this.jsProvince = jsProvince;
	}

	public String getJdImage() {
		return jdImage;
	}

	public void setJdImage(String jdImage) {
		this.jdImage = jdImage;
	}

}
