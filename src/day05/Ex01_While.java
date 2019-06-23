package day05;

import java.util.Scanner;

public class Ex01_While {

	public static void main(String[] args) {
		
		int i = 0;
		while (i < 5) { // 조건을 판별해서, 조건이 참이면 실행문을 수행하고 다시 조건을 판별
			System.out.println("Hello !!");
			i++;
		}
		int num = 10;
		while(num < 20)
			System.out.println("while : " + ++num);
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		while(!"exit".equals(str)) {	// 횟수를 몇 번?
			System.out.println("exit 라고 입력 : ");
			str = sc.nextLine();
		}
		
		str = null;		// * str = 0;
		while(true) {	// while의 조건은 반복을 유지할 조건
			System.out.println("exit 라고 입력 : ");
			str = sc.nextLine();
			if("exit".equals(str))	// 반복을 탈출할 조건
				break;				// break : 가장 가까운 {} 블럭 탈출(if제외)
		}
		
		sc.close();
		
		
	}

}
