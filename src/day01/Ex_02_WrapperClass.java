package day01;

public class Ex_02_WrapperClass {

	public static void main(String[] args) {
		/*
		 * Ŭ���� �����͸� �����ϴ� �뵵 �ܿ� �Լ��� ȣ���� ���� �ִ�
		 * primitive�� ������ ���常 �����ϴ�
		 * primitive�� ������ �����͸� Class������ ��ü�� �����Ͽ�
		 * �پ��� ����� Ȱ���ϰų�, ������ ������ �������� ����ϴ� Ŭ������
		 * Wrapper Class��� �Ѵ�
		 */
		
		boolean bo = true;
		byte by = 12;
		short sh = 34;
		char ch = 'A';
		int num = 56;
		long ln = 781;
		float fl = 1.2f;
		double db = 3.4;
		
		Boolean bo2 = false;		// �⺻ �ڷ����� 1:1 �����ȴ�
		Byte by2 = 13;
		Short sh2 = 35;
		Character ch2 = 'B';
		Integer num2 = 123;
		Long ln2 = 123L;
		Float f12 = 12.2f;
		Double db2 = db;
		
		num2 = 11;	// (Integer)num2 = (int)11;
		num = by;	// (int)num = (byte)by;
//		num2 = sh2	// (Integer)num2 = (Short)sh2 X
//		num2 = by;	// (Integer)num2 = (byte)by; X
		// Wrabber Ŭ������ �ڷ�� �����Ǵ� primitive�� ���ؼ��� ����ȯ�� �ʿ� ����

	}

}
