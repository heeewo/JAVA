package day03;

import java.util.Scanner;

public class Ex02_Operator {

	public static void main(String[] args) {
		// 논리 연산자 + boolean 변수를 제어문의 조건에 사용하는 예시
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("몇 살입니까: ");
		age = Integer.parseInt(sc.nextLine()); //nextLine이 \n까지 읽고 그 문자열에서 정수를 뽑아냄
		boolean flag1 = age >= 20;
			
		int gender;
		System.out.print("성별 (1. 남성 / 2. 여성) :");
		gender = Integer.parseInt(sc.nextLine());
		boolean flag2 = gender == 1;
//		if(age >= 20 && gender == 1)
		if(flag1 && flag2)
			System.out.println("현역 입영 대상입니다");
		else
			System.out.println("입영 대상이 아닙니다");
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println("bo1 && bo2 : " + (bo1 && bo2));
		// A && B : A도 참이고, B도 참인 경우에만 true를 도출
		System.out.println("bo1 || bo2 : " + (bo1 || bo2));
		// A || B : A나 B 둘중 하나라도 참이면 true를 도출(or)
		System.out.println("!bo1 : " + !bo1);
		// !A : A의 반대 결과를 도출(not)
		
		int a = 10, b = 7, c = 3, d = 4;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		boolean Bo1 = a++ + ++b != 0 && c++ > --d ; // 우선순위에 의해 c++을 실행되지 않는다
		boolean Bo2 = a - b == 0 || c >= d + 1;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("Bo1 : " + Bo1);
		System.out.println("Bo2 : " + Bo2);
		
		
		// 삼항 연산자 : 논리결과에 따라서 [두개]의 값중 하나를 처리할 때 사용
		int n1 = 10;
		int n2 = 20;
		int n3 = (n1 > n2) ? n1 : n2;
		// (조건문) ? 참 : 거짓 ;
		System.out.println("n3 : " + n3);
		
		int age2 = 19;
		System.out.println((age2 >= 20) ? "성인" : "미성년자");

		n1 = 8;
		System.out.println(~n1);
		System.out.println(n1 << 1); // == *2
		System.out.println(n1 >> 1); // == /2
		

	}

}
