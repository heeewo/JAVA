package day10;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

class Phone {
	private String model, company;
	private int price;
	private static double promotion; //������
	private String [] arr = new String[] {"SAMSUNG", "APPLE", "LG", "HWAWAY"};
	private boolean match = true;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		/* c���orPython������ ASCII�ڵ�� �������� �ƴ���, �ҹ���, �빮������������ ���а���
		 * ����ǥ���� : ^, [], a-z, A-z, 0-9, ��-��, ��-�R, * &
		 * ^ : ����~
		 * & : ~����
		 * [] : ����  >> [abc]�� �ѱ���
		 * ? : ���� �Ǵ� �ѱ���
		 * * : ���� �Ǵ� ��������
		 */
		if(Pattern.matches("^[0-9A-z]*$", model))
		this.model = model;
		else
			System.err.println("�𵨸��� ������ ���ڷθ� �����մϴ�.");
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		for(int i = 0 ; i < arr.length; i++) {
			//gb�� �Ѿ�ߵǿ�
			//toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ
			//indexOF("ã�� ���ڿ�") : ã�� ���ڿ��� �ε�����ȣ�� ��ȯ, �� ã���� -1�� ��ȯ
		if(company.toUpperCase().indexOf(arr[i]) == -1)
			match = false;
		else {  match = true; break;}
		}
		if (match)
			this.company = company;
		else System.err.println("ȸ�簡 �߸� �Ǿ����ϴ�");
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 2000000)
			System.err.println("�ݾ��� 200������ ���� �� �����");
		else
		this.price = price;
	}
	public static double getPromotion() {
		return promotion;
	}
	public static void setPromotion(double promotion) {
		if(promotion > 20.0)
			System.err.println("�������� 20%�� �ʰ��� �� �����");
		else
		Phone.promotion = promotion;
	}
	
	public void info() {
		System.out.println("ȸ�� : " + company);
		System.out.println("�𵨸� : " + model);
		DecimalFormat df = new DecimalFormat("#,###");
		String priceDF = df.format(price);
		System.out.println("���� : " + priceDF);
		System.out.println("���ΰ� : " + df.format(price-price*promotion/100));
		
	}
	
}

public class Ex02_API {
	public static void main(String[] args) {
		//�̹����� ��� �ڵ����� 10%����
		
		//�������� 20.0%�� ��������
		//
		Phone.setPromotion(20.5); 	//���� �߻�
		Phone.setPromotion(10.0);
		
		Phone hp1 = new Phone();
		hp1.setCompany("Sam");
		hp1.setCompany("Samsung");	//�ƹ� �������
		
		//�𵨸�(���� + ���ڸ� �����ϵ���)
		hp1.setModel("�Ƹ���");		//���� �߻�
		hp1.setModel("galexyS8");
		
		//����(�����̰ų� 200������ �ʰ��� �� ����.) => õ �������б�ȣ�� �ٵ���
		hp1.setPrice(999999999);
		hp1.setPrice(1200000);
		
		hp1.info();
		
		/*
		 *  �������� 20%�� �ʰ��� �� �����
		 * 	�𵨸��� ������ ���ڷθ� �����մϴ�.
		 *  �ݾ��� 200������ ���� �� �����
		 *  
		 *  ȸ�� : samsung
		 *  �𵨸� : galexyS8
		 *  ���� : 1,200,000
		 *  ���ΰ� : 108,000
		 */
		
	}
}
