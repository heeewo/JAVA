package day03;

import java.util.Scanner;

public class Ex02_Operator {

	public static void main(String[] args) {
		// �� ������ + boolean ������ ����� ���ǿ� ����ϴ� ����
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("�� ���Դϱ�: ");
		age = Integer.parseInt(sc.nextLine()); //nextLine�� \n���� �а� �� ���ڿ����� ������ �̾Ƴ�
		boolean flag1 = age >= 20;
			
		int gender;
		System.out.print("���� (1. ���� / 2. ����) :");
		gender = Integer.parseInt(sc.nextLine());
		boolean flag2 = gender == 1;
//		if(age >= 20 && gender == 1)
		if(flag1 && flag2)
			System.out.println("���� �Կ� ����Դϴ�");
		else
			System.out.println("�Կ� ����� �ƴմϴ�");
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println("bo1 && bo2 : " + (bo1 && bo2));
		// A && B : A�� ���̰�, B�� ���� ��쿡�� true�� ����
		System.out.println("bo1 || bo2 : " + (bo1 || bo2));
		// A || B : A�� B ���� �ϳ��� ���̸� true�� ����(or)
		System.out.println("!bo1 : " + !bo1);
		// !A : A�� �ݴ� ����� ����(not)
		
		int a = 10, b = 7, c = 3, d = 4;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		boolean Bo1 = a++ + ++b != 0 && c++ > --d ; // �켱������ ���� c++�� ������� �ʴ´�
		boolean Bo2 = a - b == 0 || c >= d + 1;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("Bo1 : " + Bo1);
		System.out.println("Bo2 : " + Bo2);
		
		
		// ���� ������ : ������� ���� [�ΰ�]�� ���� �ϳ��� ó���� �� ���
		int n1 = 10;
		int n2 = 20;
		int n3 = (n1 > n2) ? n1 : n2;
		// (���ǹ�) ? �� : ���� ;
		System.out.println("n3 : " + n3);
		
		int age2 = 19;
		System.out.println((age2 >= 20) ? "����" : "�̼�����");

		n1 = 8;
		System.out.println(~n1);
		System.out.println(n1 << 1); // == *2
		System.out.println(n1 >> 1); // == /2
		

	}

}
