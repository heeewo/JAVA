package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// !! �� ���Ͽ��� �����帮�� �Է��� ������ �����ϱ� ���� ��������
		//    ��� �ϱ��ؾ� �ϴ� ������ �ƴմϴ�
		
		int num;
		System.out.print("1 Byte�� ���� �빮�� �Է� : ");
		num = System.in.read();		// A, ���� (\r, \n) (13, 10)
		System.out.println("num : " + num);
		char ch = (char)num;
		System.out.println("ch :" + ch);
		System.in.read();
		System.in.read();
		
		InputStreamReader ins = new InputStreamReader(System.in);
		System.out.print("2 Byte�� �ѱ� �Է�: ");
		num = ins.read();
		ch = (char)num;
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڿ� �Է� : ");
		String str = br.readLine();
		System.out.println("str : " + str);
		
		// Java 1.5 ���� Scanner ��� �Է±⸦ �̿�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		num = sc.nextInt();	// �Է¹��� �����͸� ���� ���·� ��ȯ
		
		System.out.print("�Ǽ� �Է� : ");
		double db = sc.nextDouble();	//�Է¹��� �����͸� �Ǽ����·� ��ȯ
		sc.nextLine();
		
		System.out.print("���ڿ� �Է� : ");
		str = sc.nextLine();	// �Է¹��� ���ڿ��� �ٹٲ޹���(\n)���� �о�鿩�� ��ȯ
		
		System.out.println("�ѱ��� �Է� : ");
		ch = sc.nextLine().charAt(0);
		
		System.out.println("num : " + num);
		System.out.println("db : " + db);
		System.out.println("str : " + str);
		System.out.println("ch : " + ch);
		sc.close();
		
	}

}
