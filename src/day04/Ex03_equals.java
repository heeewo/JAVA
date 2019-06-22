package day04;

import java.util.Scanner;

public class Ex03_equals {

	public static void main(String[] args) {
		//primitive는 값의 일치 여부를 비교할 때 == 연산자를 활용할 수 있다
		//String 은 클래스 타입이므로, == 으로 비교할 수 없다
		Scanner sc = new Scanner(System.in);
		int num1 = 7;
		int num2;
		
		System.out.print("정수 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.println(num1 + "==" + num2 + " : " + (num1 == num2));

		String v1 = "itbank";	// Data 메모리 영역의 상수의 참조값을 저장
		String v2;				// main함수의 지역 변수(stack or Heap)
		
		System.out.print("문자열 입력 : ");
		v2 = sc.nextLine();
		System.out.println(v1 + " == " + v2 + " : " + (v1 == v2));
		// 클래스 자료형의 객체는 내용의 일치여부를 비교해줘야 한다
		
		System.out.println("v1.equals(v2) : " + v1.equals(v2));
		// 문자열의 비교는 클래스.equals() 

	}

}
