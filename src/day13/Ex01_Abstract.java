package day13;
/*
 *  �߻� �޼��� (Abstract Method) : �޼����� �� ������ ���ǵ��� �ʰ�, ���ĸ� ���ǵ� �޼���. �������̵��ؾ� ��밡��
 *  �߻� Ŭ���� (Abstract Class) : �߻� �޼��带 �����ϴ� Ŭ����, �߻� Ŭ������ ��ü�� ������ �� ����
 */

abstract class A {
	abstract int func(int a, int b);
}

class B extends A{ // The type B must implement the inherited abstract method A.func(int, int)
	@Override
	int func(int a, int b) {
		return a + b;
	}
}

class C extends A{

	@Override
	int func(int a, int b) {
		return a * b;
	}
}

public class Ex01_Abstract {
	public static void main(String[] args) {
//		A ob1 = new A();		//Cannot instantiate the type A
		B ob2 = new B();
		C ob3 = new C();
		
		System.out.println(ob2.func(2,3));
		System.out.println(ob3.func(2,3));
		// ���� �θ�Ŭ�������Լ� ��ӹ޾�����, ȣ�� ������ ����, ���� ������ �ٸ���
		// A�� ��ӹ��� � Ŭ������, �ݵ�� func() �޼��带 �ʼ��� ������ �ȴ� (���δٸ� �ڷ����� ���ϼ��� �ټ�����)
	}
}