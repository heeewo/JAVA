package day12;

class Empty extends Object{
	// 아무 내용도 없음
	// .toString()	: 클래스의 정의나 주요 내용을 문자열로 반환한다
	// .equals()	: 객체와 매개변수가 같은 내용인지 비교하여 true/false를 반환한다
}

class Super /* extends Object */{
	Super(String field1){
		System.out.println("부모 클래스 생성자 호출 !!");
		this.field1 = field1;
	}
	String field1;
	
	public final void Func() {
		System.out.println("이 메서드는 오버라이딩 할 수 없습니다 !!");
	}
	public void Func2() {
		System.out.println("이 메서드는 부모클래스의 메서드입니다 !!");
	}
	
}
class Sub extends Super {
	Sub(String field1, String field2){	// 상속받은 필드와 고유 필드에 각각 초기화를 하려면
		super(field1);				// 부모클래스의 생성자를 호출하기위해 super()
//		this.field1 = field1;
		super.field1 = field1;
		this.filed2 = field2;		// 자식클래스의 필드는 자신이 직접 처리
		System.out.println("자식 클래스 생성자 호출 !!");
	}
	String filed2;
	
	@Override
	public String toString() {
		return "내가 오버라이딩한 메서드";
		// 부모클래스가 가지는 내용을 상속받은 자식클래스에서 자유롭게 재 정의가 가능하다
	}
	
//	@Override
//	public void Func() {}
	// Cannot override the final method from Super
	// 부모클래스의 final 메서드는 오버라이딩 할 수 없습니다
	@Override
	public void Func2() { System.out.println("이 클래스는 자식클래스의 메서드입니다 !!"); }
}
public class Ex02_Super {
	public static void main(String[] args) {
		Sub ob1 = new Sub("필드1", "필드2");
		ob1.field1 = "부모클래스의 필드";
		System.out.println(ob1.field1 + ", " + ob1.filed2);
		System.out.println(ob1.toString());
		
		Empty ob2 = new Empty();
		
		System.out.println(ob2.toString());
		System.out.println(ob2.hashCode());
		System.out.println(ob2.equals("A"));
		System.out.println(ob2.getClass());
		System.out.println(ob2.getClass().getSimpleName());
		
		ob1.Func();
		ob1.Func2();
		
	}
}
