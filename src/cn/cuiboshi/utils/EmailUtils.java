package cn.cuiboshi.utils;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtils {

	private static EmailUtils utils;
	
	private EmailUtils(){}
	
	//创建一个单例模式
	public static EmailUtils newInstance(){
		return utils;
	}
	
	//javaMail的一个实现类
	private JavaMailSenderImpl mailSenderImpl;
	
	/**
	 * 使用注解把发送邮箱的模块注入到本方法里
	 * utils=this;  表示把 EmailUtils 类当做本类，可以在别的类里面调用发送邮箱的sendHtmlEmail方法
	 * @param mailSenderImpl
	 */
	@Resource(name = "javaMailSender")
	public void setMailSenderImpl(JavaMailSenderImpl mailSenderImpl) {
		this.mailSenderImpl = mailSenderImpl;
		utils=this;
	}

	/**
	 * 发送邮件
	 * 
	 * @param subject  主题
	 * @param content  内容
	 * @param to  要发送的对象
	 * @throws Exception 
	 */
	
	public void sendHtmlEmail(String subject, String content,String to) throws Exception {
		// 使用发送者创建消息对象
		MimeMessage message = mailSenderImpl.createMimeMessage();
		// 创建消息创建帮助类 设置编码格式 要不会乱码
		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
				"utf-8");
		// 设置发送人
		messageHelper.setFrom("bsedutest@sohu.com");
		// 设置接收人
		messageHelper.setTo(to);
		// 设置消息主题
		messageHelper.setSubject(subject);
		// 设置发送的内容 ,第二个参数表示是否为HTML内容格式
		messageHelper.setText(content,true);

		// messageHelper.addInline("附件图片", new File("J:/图片\1455279342042"));

		// 发送Email
		mailSenderImpl.send(message);

	}

	public static void main(String[] args) throws Exception {
		// // 创建链接配置
		// Properties props = new Properties();
		// // 设置连接主机
		// props.put("mail.smtp.port", "25");
		// // 链接协议-发送协议
		// props.setProperty("mail.transport.protocol", "smtp");
		// // 是否开启认证
		// props.setProperty("mail.smtp.auth", "true");
		// // 创建会话Session
		// Session msession = Session.getDefaultInstance(props);
		// // 开启调试模式，查看详细的链接输出
		// msession.setDebug(true);
		//
		// // 获取发送对象
		// Transport mtp = msession.getTransport();
		// // 链接服务器
		// mtp.connect("smtp.sohu.com", "bsedutest@sohu.com", "0123456789.");
		//
		// // 创建发送邮件
		// MimeMessage ms = new MimeMessage(msession);
		// // 设置发送人
		// ms.setFrom(new InternetAddress("bsedutest@sohu.com"));
		// // 设置接收人
		// ms.setRecipient(Message.RecipientType.TO, new InternetAddress(
		// "425632693@qq.com"));
		// // 设置邮件标题
		// ms.setSubject("百思教育认证码提示信息");
		// // ms.setText("认证码：测试认证。");
		// ms.setContent("认证码：欢迎来到亡者农药。<a href='http://www.china-bs.com'>百思教育</a>","text/html");
		//
		//
		// // 发送邮件
		// mtp.sendMessage(ms, ms.getAllRecipients());
		// // 关闭链接
		// mtp.close();

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context-email.xml");
		JavaMailSenderImpl sender = (JavaMailSenderImpl) ctx
				.getBean("javaMailSender");

		// SimpleMailMessage message=new SimpleMailMessage();
		// message.setFrom("bsedutest@sohu.com");
		// message.setTo("425632693@qq.com");
		// message.setSubject("及第三方");
		// message.setText("gffgd");
		// //发送Email
		// sender.send(message);

		// 使用发送者创建消息对象
//		MimeMessage message = sender.createMimeMessage();
//		// 创建消息创建帮助类 设置编码格式 要不会乱码
//		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
//				"utf-8");
//		// 设置发送人
//		messageHelper.setFrom("bsedutest@sohu.com");
//		// 设置接收人
//		messageHelper.setTo("425632693@qq.com");
//		// 设置消息主题
//		messageHelper.setSubject("亡者荣耀！");
//		// 设置发送的内容 第二个参数表示是否为HTML内容格式
//		messageHelper.setText(
//				"敌军还有五秒到达战场,官网地址<a href='http://www.china-bs.com'>百思官网</a>",
//				true);
//
//		// messageHelper.addInline("附件图片", new File("J:/图片\1455279342042"));
//
//		// 发送Email
//		sender.send(message);

	}
}
