package day09_1;


public class A {
	//private�ʵ�
	private int field;
	
	//public �޼ҵ�(������)
	public A() {}
	
	//default �޼ҵ�
	void method() {}
	void test() {
		A a = new A();	//public ���ٰ���(�� ��Ű��, �ܺ� ��Ű��)
		a.field = 5;	//private ���ٰ���(�� Ŭ���� ����)
		a.method();		//defualt ���ٰ���(�� ��Ű�� ����)
	}
}
