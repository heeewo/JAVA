package day08;


class Human{			// 클래스의 이름은 첫글자 대문자로 만들고 _를 제외한 특수문자를 사용할 수 없다
						// 사용자 정의 자료형 Human
	// 값, 속성-> 멤버 필드
	String name;		// Member Field 선언		
	int age;			// 멤버 필드는 첫글자는 소문자로 쓰는 것이 좋다

	// 기능 -> 멤버 메서드
	void Show() {		// 멤버 메서드는 첫 글자를 대문자로 보통 처리하지만
		// 이름과 나이를 출력하는 기능
		System.out.println(name + "의 나이는" + age + "살입니다");
	}
	String getName() {	// 두 단어 이상의 복합단어인 경우, 각 단어의 첫글자를 대문자로 처리
		return name;	// 단, is, can, has, get, set의 경우에는 소문자로 처리한다
		// 자신의 이름을 반환하는 메서드
	}
}
public class Ex01_Class {

	public static void main(String[] args) {
		// 변수 : 단일 데이터를 저장하는 변수
		// 배열 : 같은 자료형의 서로 다른 데이터를 묶어서 저장하는 변수
		// 구조체 : 서로 다른 자료형을 묶어서 관리할 수 있는 사용자 정의 자료형
		// 클래스 : 구조체(서로 다른 자료형의 변수) + 함수(자료형에 대응되는 기능) [자료형]
		
		// 구조체 자료형으로 만들어진 변수 : 구조체 변수
		// 클래스 자료형으로 만들어진 변수 : 객체(Object) -> OOP (Object Oriented Programming)
		
		// 객체 생성
		Human h1 = new Human();	// Human() : 클래스의 이름과 동일한 이름의 함수 - 생성자
		Human h2 = new Human();	// 객체를 생성하기 위해서 반드시 호출해야 하는 함수
		Human h3;				// h3 참조변수는 객체를 가리키고 있지 않아서 멤버를 참조하면 예외가 발생한다
		// 클래스를 만들어 두면 똑같은 데이터를 저장할 수 있는 서로 다른 객체를 찍어낼 수 있다
		
		h1.name = "박민성";		// Member Field에 값 대입
		h2.name = "이천수";
//		h3.name = "장원준";

		h1.age = 25;
		h2.age = 37;
		
		// 멤버 필드도 일반 변수와 똑같이 취급하면 된다
		System.out.println(h1.name);
		System.out.println(h2.name);
		
		h1.Show();				// Member Method 호출
		h2.Show();
		

	}

}
