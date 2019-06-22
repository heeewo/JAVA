package day04;

public class Ex01_If {

	public static void main(String[] args) {
		// 제어문 (Control Statement) : 프로그램의 흐름이나 분기를 제어하는 구문
		int num = 10;
		
		if(num > 5) {
			System.out.println(++num);
		}
		else/*if(!(num > 5))*/ {
			System.out.println(--num);
		}
		// 양수, 음수, 0을 판별하는 식
		if(num > 0)
			System.out.println("num은 양의 정수입니다");
		else if(num < 0)
			System.out.println("num은 음의 정수입니다");
		else 
			System.out.println("num은 0입니다");
		}
	

	}

