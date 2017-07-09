package cn.cuiboshi.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * ͼƬ��֤�빤����
 * 
 * @author Administrator
 *
 */
public class ImageCodeUtil {

	private static ImageCodeUtil imageCodeUtil;

	private ImageCodeUtil() {}

	/**
	 * ��������
	 * 
	 * @return
	 */
	public static ImageCodeUtil getInstance() {
		if (imageCodeUtil == null) {
			imageCodeUtil = new ImageCodeUtil();
		}
		return imageCodeUtil;
	}

	private Random random = new Random();
	private String randString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";// ����������ַ���

	private int width = 80;// ͼƬ��
	private int height = 26;// ͼƬ��
	private int lineSize = 20;// ����������
	private int stringNum = 4;// ��������ַ�����
	private String code;// ��֤��Code

	/**
	 * �������ͼƬ
	 */
	public BufferedImage getRandcode() {
		
		//RGB 			red green blue 
		
		// BufferedImage���Ǿ��л�������Image��,Image������������ͼ����Ϣ����
		/**
		 * BufferedImage()���������������ֱ��ǣ������Ŀ������ĸߣ����Ƶ�ͼƬ����
		 */
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		//��ȡһ������
		Graphics g = image.getGraphics();// ����Image�����Graphics����,�Ķ��������ͼ���Ͻ��и��ֻ��Ʋ���
		//����һ�������Ĵ�С��fillRect()�����ĸ������ֱ��ǣ���Ŀ�ʼ���ߵĿ�ʼ����Ľ������ߵĽ���
		g.fillRect(0, 0, width, height); //��ʼ�趨����һ������
		//setFont()���������������ֱ��ǣ�����ķ����������ͣ�����Ĵ�С
		g.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18)); //���û�������ʹ�С
		//setColor()�������ǻ�ȡ�������ɫ
		g.setColor(getRandColor(110, 133));
		
		// ���Ƹ�����
		for (int i = 0; i <= lineSize; i++) {
			drowLine(g);
		}
		
		// ��������ַ�
		String randomString = "";
		for (int i = 1; i <= stringNum; i++) {
			randomString = drowString(g, randomString, i);
		}
		//�ѻ�ȡ���ĸ��������ŵ�code������
		code = randomString;
		g.dispose();
		return image;
	}

	/*
	 * �������
	 */
	private Font getFont() {
		return new Font("Fixedsys", Font.CENTER_BASELINE, 18);
	}

	/*
	 * �����ɫ
	 */
	private Color getRandColor(int fc, int bc) {
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc - 16);
		int g = fc + random.nextInt(bc - fc - 14);
		int b = fc + random.nextInt(bc - fc - 18);
		
		return new Color(r, g, b);
	}

	/*
	 * �����ַ���
	 */
	private String drowString(Graphics g, String randomString, int i) {
		
		//���û�������
		g.setFont(getFont());
		
		//���������RGB��ɫ
		g.setColor(new Color(random.nextInt(101), random.nextInt(111), random.nextInt(121)));
		//RGB red grren blue 
		//new COlor(random.nextInt(101),random.nextInt(101),random.nextInt(101));
		//��ȡ����ַ�
		String rand = String.valueOf(getRandomString(random.nextInt(randString.length())));
		
		randomString += rand;
		
		g.translate(random.nextInt(3), random.nextInt(3));
		
		g.drawString(rand, 13 * i, 16);
		
		return randomString;
	}

	/*
	 * ���Ƹ�����
	 */
	private void drowLine(Graphics g) {
		
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(13);
		int yl = random.nextInt(15);
		
		g.drawLine(x, y, x + xl, y + yl);
	}

	/*
	 * ��ȡ������ַ�
	 */
	private String getRandomString(int num) {
		return String.valueOf(randString.charAt(num));
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getCode() {
		return code;
	}

}
