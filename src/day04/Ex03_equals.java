package day04;

import java.util.Scanner;

public class Ex03_equals {

	public static void main(String[] args) {
		//primitive�� ���� ��ġ ���θ� ���� �� == �����ڸ� Ȱ���� �� �ִ�
		//String �� Ŭ���� Ÿ���̹Ƿ�, == ���� ���� �� ����
		Scanner sc = new Scanner(System.in);
		int num1 = 7;
		int num2;
		
		System.out.print("���� �Է� : ");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.println(num1 + "==" + num2 + " : " + (num1 == num2));

		String v1 = "itbank";	// Data �޸� ������ ����� �������� ����
		String v2;				// main�Լ��� ���� ����(stack or Heap)
		
		System.out.print("���ڿ� �Է� : ");
		v2 = sc.nextLine();
		System.out.println(v1 + " == " + v2 + " : " + (v1 == v2));
		// Ŭ���� �ڷ����� ��ü�� ������ ��ġ���θ� ������� �Ѵ�
		
		System.out.println("v1.equals(v2) : " + v1.equals(v2));
		// ���ڿ��� �񱳴� Ŭ����.equals() 

	}

}
