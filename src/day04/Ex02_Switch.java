package day04;

import java.util.Scanner;

public class Ex02_Switch {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		switch(num) { // num의 값을 [스위치] 로 지정하여
		// 아래 일치하는 [케이스]가 있으면 해당 케이스부터 코드를 진행한다
		case 1: System.out.println("입력값 : 1"); break; //코드가 생략되더라도 break가 없으면 명령어가 흐름대로 흘러가기때문에
		case 2: System.out.println("입력값 : 2"); break; //위에서 부터 실행되서 case 2가 실행된다
		case 3: System.out.println("입력값 : 3"); break; //맨 마지막줄은 default가 있으면 break를 안써도 된다
		default:	// 일치하는 케이스가 없다면 default 이하 구문을 실행한다(생략가능)
			System.out.println("입력값이 1,2,3 중 하나가 아님");
		}
		
		// 자바의 switch ~ case는 (C언어와 달리) 문자열값도 switch로 지정 가능
		System.out.println("입력 : ");
		String str = sc.nextLine();
		
		switch(str) {  // switch의 값이 될수 있는 자료형은 정수(char), 문자열
		case "Java" : 
			System.out.println("System.out.println();");
			break;
		case "C" : 
			System.out.println("printf();");
			break;
		case "Python" : 
			System.out.println("print()");
			break;
		}
		
		
		sc.close();

	}

}
