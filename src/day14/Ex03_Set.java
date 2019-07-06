package day14;

import java.util.HashSet;	//java.util.Set을 구현한 클래스 HashSet
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
		
		for(Object ob : hs) {	// index(순번)이 없다
			System.out.println(ob);
		}
		System.out.println("--------------------");
		Iterator it = hs.iterator(); // HashSet 내부의 멤버들을 순환가능한 형태로 묶어서 반환
		
		while(it.hasNext()) {	// 내가 접근하지 않은 값이 남아있다면 true
			System.out.println(it.next());// 접근하지 않은 값 중 하나를 반환
		}
		
		HashSet <String> hs2 = new HashSet<String>();
		
		Scanner sc =new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("좋아하는 음식을 입력 : ");
			hs2.add(sc.nextLine());
		}
		for(String str : hs2) {
			System.out.println(str);
		}
	}
}