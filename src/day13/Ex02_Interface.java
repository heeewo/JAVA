package day13;
/*
 * 	인터페이스  : 추상 클래스의 한 종류, 자바에서 유일하게 다중 상속을 허용하는 타입이다
 * 	코드의 통일(형식을 같게 함으로)
 * 	다른 자료형 다른 부모클래스가 있어도 묶어줄수 있음
 * 
 * 	1. 객체 생성이 불가능 (추상 클래스이므로)
 * 	2. 멤버 필드는 자동으로 static final 속성을 가진다
 * 	3. 멤버 메서드는 public abstract 속성을 가진다
 * 	4. 일반 클래스와 구분하기 위하여, 인터페이스를 상속(구현)하는 키워드는 implements 이다
 */
interface USB{
	// USB 장치가 가져야하는 필수적인 메서드를 선언만 하기
	void react();	// public abstract
}

class USB_Stick extends Object implements USB{	//implements만 다중상속을 지원한다
	public void react() {						//강제로 오버라이딩을 해야한다 @Override를 적어도되고 안해도된다
		System.out.println("새로운 USB 저장장치 발견!!");//오버라이드 일때 더 하위의 접근 제한자를 쓰지 않아도 된다
	}
}
class USB_Cable extends Object implements USB{
	public void react() {
		System.out.println("충전충...99%");
	}
}
class USB_Fan extends Object implements USB{
	public void react() {
		System.out.println("전원공급");
	}
}
class PC {
	public static void Connect(USB ob) {	// 서로 다른 클래스를 인터페이스로 묶을 수 있다
		ob.react();		// 모든 USB는 react() 메서드를 반드시 가진다
	}
}
public class Ex02_Interface {
	public static void main(String[] args) {
		USB_Cable ob1 = new USB_Cable();
		USB_Fan ob2 = new USB_Fan();
		USB_Stick ob3 = new USB_Stick();
		
		PC.Connect(ob1);
		PC.Connect(ob2);
		PC.Connect(ob3);
		
//		USB ob4 = new USB(); // 생성불가
		USB ob4 = ()->System.out.println("마우스 연결 !!");
		PC.Connect(ob4);
		
		// 자바 1.8부터 함수형 인터페이스의 람다식 객체 생성이 가능하다
		// 다른 내용 없이 하나의 메서드만 가지는 인터페이스를 함수형 인터페이스라고 한다
	}
}
