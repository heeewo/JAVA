package day09_1;


public class A {
	//private필드
	private int field;
	
	//public 메소드(생성자)
	public A() {}
	
	//default 메소드
	void method() {}
	void test() {
		A a = new A();	//public 접근가능(내 패키지, 외부 패키지)
		a.field = 5;	//private 접근가능(내 클래스 내부)
		a.method();		//defualt 접근가능(내 패키지 내부)
	}
}
