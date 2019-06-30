package day09_2;

import day09_1.A;

public class C {
	void test() {
		A a = new A();	//public 접근가능(내 패키지, 외부 패키지)
//		a.field = 5;	//private 접근불가능(내 클래스 내부가 아님)
//		a.method();		//defualt 접근불가능(내 패키지 내부 아님)
	}
}
