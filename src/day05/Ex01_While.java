package day05;

import java.util.Scanner;

public class Ex01_While {

	public static void main(String[] args) {
		
		int i = 0;
		while (i < 5) { // ������ �Ǻ��ؼ�, ������ ���̸� ���๮�� �����ϰ� �ٽ� ������ �Ǻ�
			System.out.println("Hello !!");
			i++;
		}
		int num = 10;
		while(num < 20)
			System.out.println("while : " + ++num);
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		while(!"exit".equals(str)) {	// Ƚ���� �� ��?
			System.out.println("exit ��� �Է� : ");
			str = sc.nextLine();
		}
		
		str = null;		// * str = 0;
		while(true) {	// while�� ������ �ݺ��� ������ ����
			System.out.println("exit ��� �Է� : ");
			str = sc.nextLine();
			if("exit".equals(str))	// �ݺ��� Ż���� ����
				break;				// break : ���� ����� {} �� Ż��(if����)
		}
		
		sc.close();
		
		
	}

}
