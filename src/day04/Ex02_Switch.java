package day04;

import java.util.Scanner;

public class Ex02_Switch {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 ������ ���� �Է� : ");
		num = Integer.parseInt(sc.nextLine());
		
		switch(num) { // num�� ���� [����ġ] �� �����Ͽ�
		// �Ʒ� ��ġ�ϴ� [���̽�]�� ������ �ش� ���̽����� �ڵ带 �����Ѵ�
		case 1: System.out.println("�Է°� : 1"); break; //�ڵ尡 �����Ǵ��� break�� ������ ��ɾ �帧��� �귯���⶧����
		case 2: System.out.println("�Է°� : 2"); break; //������ ���� ����Ǽ� case 2�� ����ȴ�
		case 3: System.out.println("�Է°� : 3"); break; //�� ���������� default�� ������ break�� �Ƚᵵ �ȴ�
		default:	// ��ġ�ϴ� ���̽��� ���ٸ� default ���� ������ �����Ѵ�(��������)
			System.out.println("�Է°��� 1,2,3 �� �ϳ��� �ƴ�");
		}
		
		// �ڹ��� switch ~ case�� (C���� �޸�) ���ڿ����� switch�� ���� ����
		System.out.println("�Է� : ");
		String str = sc.nextLine();
		
		switch(str) {  // switch�� ���� �ɼ� �ִ� �ڷ����� ����(char), ���ڿ�
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
