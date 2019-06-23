package day06;

public class Ex02_Method_Overloading {
	// 1. 두 정수의 합을 반환하는 함수 Add()
	static int Add(int n1, int n2) { return n1 + n2; }
	// 2. 세 정수의 합을 반환하는 함수 Add()
	static int Add(int n1, int n2, int n3) { return n1 + n2 +n3; }
	// 3. 두 실수의 합을 정수형으로 반환하는 함수 Add()
	static int Add(double d1, double d2) { return (int) (d1 + d2); }
	// 4. 두정수의 합을 문자열로 반환하는 함수 Add()
//	static String Add(int n1, int n2) { return String.format("%d", n1 + n2); }
	
	public static void main(String[] args) {
		/*
		 *  메서드 오버로딩 :	하나의 함수 이름으로 두 개 이상의 중복 정의하는 기능
		 *  				함수의 매개변수 자료형이나 개수를 기준으로 구분한다(중요)
		 *  
		 *  연산자 오버로딩 : + 기호는 양쪽에 위치한 값의 자료형에 따라서
		 *  				정수 혹은 실수이면 덧셈을 수행하고
		 *  				문자열이 있으면, 전체를 문자열로 취급하여 이어붙이는 값을 만든다
		 *  		=>	+ 기호가 하나의 기호로, 두개 이상의 기능을 가지고 있다
		 */
		/*
		 * 	정수는 % 연산을 활용하여 나이를 구한다
		 * 	문자열은 substring()함수를 활용하여 자릿수를 구분하고 정수로 변환할 수 있다
		 */
		String ex = "JAVA";
		System.out.println(ex.substring(0, 2));
		System.out.println(ex.substring(2, 4));
		System.out.println(ex.length());
		
	}

}
