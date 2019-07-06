package day14;

import java.util.HashSet;	//java.util.Set�� ������ Ŭ���� HashSet
import java.util.Iterator;
import java.util.Scanner;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(20);
		hs.add("ITBANK");
		hs.add(20);
		hs.add(new Integer(20));
		
		System.out.println("hs.size() : " + hs.size());
		
		for(Object ob : hs) {	// index(����)�� ����
			System.out.println(ob);
		}
		System.out.println("--------------------");
		Iterator it = hs.iterator(); // HashSet ������ ������� ��ȯ������ ���·� ��� ��ȯ
		
		while(it.hasNext()) {	// ���� �������� ���� ���� �����ִٸ� true
			System.out.println(it.next());// �������� ���� �� �� �ϳ��� ��ȯ
		}
		
		HashSet <String> hs2 = new HashSet<String>();
		
		Scanner sc =new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("�����ϴ� ������ �Է� : ");
			hs2.add(sc.nextLine());
		}
		for(String str : hs2) {
			System.out.println(str);
		}
	}
}