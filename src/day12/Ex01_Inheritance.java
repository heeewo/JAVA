package day12;

//super class
//상위클래스, 수퍼클래스, 부모클래스
class Human {
	String name;
	
	void Show() { System.out.println("이름 : " + name); }
}
//sub class
//하위클래스, 서브클래스, 자식클래스
//extends 명령어를 이용하여 Tv클래스를 상속
class Teacher extends Human {	// 오버라이딩 : 부모클래스에게 물려받은 메서드를 재 정의
	String subject;
	// 상속관계에서 [공통의 기능은 부모클래스]에 작성한다
	// 상속관계에서 [고유 기능은 자식클래스]에서 작성한다
	// 부모클래스의 기능을 재 정의해서 [공통된 기능이지만 서로 다른 내용]을 만들어 낼 수 있다
	@Override 	// 어노테이션 : 작성자가 아래의 함수를 오버라이딩한다라고 명시하여, 규칙에 어긋나면 경고
	//오버로딩 : 매개변수의 타입과 개수에 따라 다른 메소드 호출
	//오버라이딩 : 기존의 메소드를 다른 기능으로 사용
	void Show() { 	// 반환형, 매개변수, 함수이름 모두 동일해야 한다. (내용은 변경 가능)
		System.out.println("이름 : " + name);
		System.out.println("담당 과목 : " + subject);
	}
//	@Override
//	void Test() {}
//	The method Test() of type Teacher must override or implement a supertype method
}

class Student extends Human {
	int age;
	@Override
	void Show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class Ex01_Inheritance {
/*
상위(부모) 클래스로부터 하위(자식) 클래스가 그 기능을 그대로 물려받는다.
이미 개발된 클래스를 재사용하여 새로운 클래스를 작성할 수 있다.
개발시간을 단축할 수 있고 코드의 중복을 피할 수 있다.
상속을 하여도 상위(부모)클래스의 private 필드 & 메소드 & 생성자는 상속대상에서 제외된다.
하위(자식) 클래스가 상위(부모) 클래스를 상속할 인지를 결정한다.
자바는 다른 객체지향 프로그래밍 언어와 다르게 다중 상속을 허용하지 않는다.
TV => IPTV(TV + IP관련된 기능들 추가)

class 하위클래스 extends 상위클래스
 */
	
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "사람1";
		
		Teacher t1 = new Teacher();
		t1.name = "heeewo";
		t1.subject = "컴퓨터";
		
		Student s1 = new Student();
		s1.name = "이지은";
		s1.age = 27;
		
		h1.Show(); System.out.println();	// 부모클래스는 부모클래스의 Show()
		t1.Show(); System.out.println();	// 자식 클래스는 자기에 맞는 Show() 를 호출
		s1.Show(); System.out.println();
		
		
	}
}

