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
	
	//����һ������ģʽ
	public static EmailUtils newInstance(){
		return utils;
	}
	
	//javaMail��һ��ʵ����
	private JavaMailSenderImpl mailSenderImpl;
	
	/**
	 * ʹ��ע��ѷ��������ģ��ע�뵽��������
	 * utils=this;  ��ʾ�� EmailUtils �൱�����࣬�����ڱ����������÷��������sendHtmlEmail����
	 * @param mailSenderImpl
	 */
	@Resource(name = "javaMailSender")
	public void setMailSenderImpl(JavaMailSenderImpl mailSenderImpl) {
		this.mailSenderImpl = mailSenderImpl;
		utils=this;
	}

	/**
	 * �����ʼ�
	 * 
	 * @param subject  ����
	 * @param content  ����
	 * @param to  Ҫ���͵Ķ���
	 * @throws Exception 
	 */
	
	public void sendHtmlEmail(String subject, String content,String to) throws Exception {
		// ʹ�÷����ߴ�����Ϣ����
		MimeMessage message = mailSenderImpl.createMimeMessage();
		// ������Ϣ���������� ���ñ����ʽ Ҫ��������
		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
				"utf-8");
		// ���÷�����
		messageHelper.setFrom("bsedutest@sohu.com");
		// ���ý�����
		messageHelper.setTo(to);
		// ������Ϣ����
		messageHelper.setSubject(subject);
		// ���÷��͵����� ,�ڶ���������ʾ�Ƿ�ΪHTML���ݸ�ʽ
		messageHelper.setText(content,true);

		// messageHelper.addInline("����ͼƬ", new File("J:/ͼƬ\1455279342042"));

		// ����Email
		mailSenderImpl.send(message);

	}

	public static void main(String[] args) throws Exception {
		// // ������������
		// Properties props = new Properties();
		// // ������������
		// props.put("mail.smtp.port", "25");
		// // ����Э��-����Э��
		// props.setProperty("mail.transport.protocol", "smtp");
		// // �Ƿ�����֤
		// props.setProperty("mail.smtp.auth", "true");
		// // �����ỰSession
		// Session msession = Session.getDefaultInstance(props);
		// // ��������ģʽ���鿴��ϸ���������
		// msession.setDebug(true);
		//
		// // ��ȡ���Ͷ���
		// Transport mtp = msession.getTransport();
		// // ���ӷ�����
		// mtp.connect("smtp.sohu.com", "bsedutest@sohu.com", "0123456789.");
		//
		// // ���������ʼ�
		// MimeMessage ms = new MimeMessage(msession);
		// // ���÷�����
		// ms.setFrom(new InternetAddress("bsedutest@sohu.com"));
		// // ���ý�����
		// ms.setRecipient(Message.RecipientType.TO, new InternetAddress(
		// "425632693@qq.com"));
		// // �����ʼ�����
		// ms.setSubject("��˼������֤����ʾ��Ϣ");
		// // ms.setText("��֤�룺������֤��");
		// ms.setContent("��֤�룺��ӭ��������ũҩ��<a href='http://www.china-bs.com'>��˼����</a>","text/html");
		//
		//
		// // �����ʼ�
		// mtp.sendMessage(ms, ms.getAllRecipients());
		// // �ر�����
		// mtp.close();

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context-email.xml");
		JavaMailSenderImpl sender = (JavaMailSenderImpl) ctx
				.getBean("javaMailSender");

		// SimpleMailMessage message=new SimpleMailMessage();
		// message.setFrom("bsedutest@sohu.com");
		// message.setTo("425632693@qq.com");
		// message.setSubject("��������");
		// message.setText("gffgd");
		// //����Email
		// sender.send(message);

		// ʹ�÷����ߴ�����Ϣ����
//		MimeMessage message = sender.createMimeMessage();
//		// ������Ϣ���������� ���ñ����ʽ Ҫ��������
//		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
//				"utf-8");
//		// ���÷�����
//		messageHelper.setFrom("bsedutest@sohu.com");
//		// ���ý�����
//		messageHelper.setTo("425632693@qq.com");
//		// ������Ϣ����
//		messageHelper.setSubject("������ҫ��");
//		// ���÷��͵����� �ڶ���������ʾ�Ƿ�ΪHTML���ݸ�ʽ
//		messageHelper.setText(
//				"�о��������뵽��ս��,������ַ<a href='http://www.china-bs.com'>��˼����</a>",
//				true);
//
//		// messageHelper.addInline("����ͼƬ", new File("J:/ͼƬ\1455279342042"));
//
//		// ����Email
//		sender.send(message);

	}
}
