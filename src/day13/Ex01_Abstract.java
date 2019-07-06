package day13;
/*
 *  추상 메서드 (Abstract Method) : 메서드의 상세 내용이 정의되지 않고, 형식만 정의된 메서드. 오버라이딩해야 사용가능
 *  추상 클래스 (Abstract Class) : 추상 메서드를 포함하는 클래스, 추상 클래스는 객체를 생성할 수 없다
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
		// 같은 부모클래스에게서 상속받았으나, 호출 형식은 같고, 세부 내용은 다르다
		// A를 상속받은 어떤 클래스든, 반드시 func() 메서드를 필수로 가지게 된다 (서로다른 자료형을 통일성을 줄수있음)
	}
}