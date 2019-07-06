package day11;

class Member {
	String name;
	int age;
	static int all;	//정적 필드

	Member(String name, int age) {
		this.name = name;//인스턴스 필드
		this.age = age;
		System.out.println(name + " 객체 생성!!");
		all += 1;
	}

	public void ShowInfo() {//인스턴스 메소드
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "살\n");
	}
	//Instance멤버는 무조건 객체를 생성해야된다.
	public static void PrintAll() {//정적 메소드
		// static 속성을 가지면 일반 멤버 구성 요소보다 먼저 생성되므로, 일반 요소를 참조할 수 없을 수도 있다
//		System.out.println("나이 : " + age);
		// Cannot make a static reference to the non-static field age
//		age = 9; static 메소드는 instance를 건들 수 없어요
		System.out.println("생성된총객체수: " + all + "\n");
		//인스턴스를 생성하지 않고 클래스의 이름.필드, 메소드 방식으로 접근가능
		//static : 클래스이름으로 접근할거야~ (정적변수)
	}
}

public class Ex01_static {
	
	public void Func() {
		System.out.println("AAAA");
	}
	
	public static void main(String[] args) {
		Member.PrintAll();
		
		Member ob1 = new Member("이지은", 27);//인스턴스 생성
		Member ob2 = new Member("민경훈", 34);
		System.out.println();
		
		ob1.ShowInfo();	//인스턴스 메소드 사용
		ob2.ShowInfo();
		
		Member.PrintAll();
		ob1.PrintAll();
		// The static method PrintAll() from the type Member should be accessed in a static way
		ob2.PrintAll();
	
		//Func();
		// Cannot make a static reference to the non-static method Func() from the type Ex01_Static
	}
}


