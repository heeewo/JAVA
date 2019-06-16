package day01;

public class Ex_02_WrapperClass {

	public static void main(String[] args) {
		/*
		 * 클래스 데이터를 저장하는 용도 외에 함수를 호출할 수도 있다
		 * primitive는 데이터 저장만 가능하다
		 * primitive에 저장할 데이터를 Class형식의 객체에 저장하여
		 * 다양한 기능을 활용하거나, 데이터 은닉의 목적으로 사용하는 클래스를
		 * Wrapper Class라고 한다
		 */
		
		boolean bo = true;
		byte by = 12;
		short sh = 34;
		char ch = 'A';
		int num = 56;
		long ln = 781;
		float fl = 1.2f;
		double db = 3.4;
		
		Boolean bo2 = false;		// 기본 자료형과 1:1 대응된다
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
		// Wrabber 클래스의 자료는 대응되는 primitive에 대해서만 형변환이 필요 없다

	}

}
