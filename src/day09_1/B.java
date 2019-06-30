package day09_1;

public class B {
	void test() {
		A a = new A();	//public 접근가능(내 패키지, 외부 패키지)
//		a.field = 5;	//private 접근불가능(내 클래스 내부가 아니니까)
		a.method();		//defualt 접근가능(내 패키지 내부)
	}
}
