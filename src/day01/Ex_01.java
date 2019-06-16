package day01;

public class Ex_01 {

	public static void main(String[] args) {

		/*
		 * 1. 소스 파일당 public class는 반드시 하나만 존재한다 2. public class 의 이름과, 소스 파일의 이름은 같아야 한다
		 * 3. 모든 클래스의 이름은 첫글자를 영어 대문자로 처리한다
		 * 
		 * - 구조체(Clang) + 함수 => 클래스 - 구조체 : 사용자 정의 '자료형' - 클래스도 자료형으로 사용할 수 있다 => 자료형
		 * 중에서 첫 글자가 대문자인 모든 자료형은 클래스 자료형이다
		 * 
		 */

		boolean bo = true;	// 1 Byte 논리 자료형 : true / false 를 저장한다

		byte by = 127;		// 1 Byte 크기의 정수 자료형 : -128 ~ 127
		short sh = 32767;	// 2 Byte 크기의 정수 자료형 : -32768 ~ 32767
		char ch = 65535; 	// 2 Byte 크기의 정수 자료형, 문자를 표현할 때 사용
							// 문자는 음수가 없으므로, 0 ~ 65535
		int num = 1234; 	// 4 Byte 크기의 정수 대표 자료형 : 약 -21억~ +21억

		long ln = 23451; 	// 8 Byte 크기의 정수 자료형 : int 보다 큼
		float fl = 1.2f; 	// 4 Byte 크기의 실수 자료형

		double db = 3.14; 	// 8 Byte 크기의 실수 대표 자료형

		String str = "아이유";// 문자열을 저장하는 4 Byte 크기의 참조 변수
							// (문자열을 가리키는 포인터 변수와 유사함)
							// 첫 글자가 대문자 => 클래스 자료형

		System.out.println("bo : " + bo);
		// + 연산자가 문자열과 연산하면 정수의 덧셈이 아니라, 값의 나열을 수행한다
		System.out.println(num + db);
		// 숫자 간의 덧셈 : 값을 더한다
		System.out.println(str + num);
		// 문자열과 숫자 간의 덧셈 : 값을 이어 붙인다
		char ch1 = 65; // ASCII Code
		System.out.println("ch1 : " + ch1);

		char ch2 = '\u0041';
		System.out.println("ch2 : " + ch2);

		char ch3 = '가';		// 단일 문자 : 홑따옴표
		System.out.println("ch3 : " + ch3);

		String str2 = "가";	// 문자열 : 쌍따옴표
		System.out.println("str2 : " + str2);

		char arr[] = str2.toCharArray();
		// 범위 드래그 -> Ctrl + Shift + F : 정렬
		for (int i = 0; i < arr.length; i++) {
			// 배열의 길이는 arr.length 값이 자동으로 계산하여 알려준다
		}
	}

}
