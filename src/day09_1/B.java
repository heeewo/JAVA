package day09_1;

public class B {
	void test() {
		A a = new A();	//public ���ٰ���(�� ��Ű��, �ܺ� ��Ű��)
//		a.field = 5;	//private ���ٺҰ���(�� Ŭ���� ���ΰ� �ƴϴϱ�)
		a.method();		//defualt ���ٰ���(�� ��Ű�� ����)
	}
}
