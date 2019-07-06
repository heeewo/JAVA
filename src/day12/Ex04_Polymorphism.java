package day12;

class Humen{
	String name;
	// 1. 생성자를 문자열로 전달받아서, this.name에 저장하는 생성자를 작성
	Humen(String name) 	{ this.name = name; }
}
class Actor extends Humen{
	Actor(String name){
		super(name);
	}
	final String job = "배우";
}
class Singer extends Humen{
	Singer(String name){	// 부모클래스의 기본생성자를 만들수 없으면 매개변수를 전달해서 대입
		super(name);
	}
	final String job = "가수";
}
public class Ex04_Polymorphism {
	static Humen [] arr = new Humen[3];
	
	public static void Enter(Humen h) {		// up-casting을 하면 서로 다른 자료형을 하나로 처리할 수 있다
		// 직업에 상관없이 매개변수로 전달받은 객체를 배열의 빈 멤버에 넣는 코드
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = h;
				return;
			}
		}
		System.out.println("방이 꽉 찼습니다");
	}
	public static void ShowMember() {
		// 2. arr 배열에 들어간 사람의 이름만 출력하는 코드를 작성 
		// 부모클래스가 가지는 필드(name)의 내용만 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ". " + arr[i].name);
			// name 필드는 부모클래스 Human에 정의되어 있어서 캐스팅이 필요 없다 !!
			// 3. 각각의 직업도 같이 출력하도록 코드를 추가하세요
			if(arr[i] instanceof Actor)
				System.out.println("직업 : " + ((Actor)arr[i]).job);
			if(arr[i] instanceof Singer)
				System.out.println("직업 : " + ((Singer)arr[i]).job);
			System.out.println();
			// 자식클래스에서 추가된 내용은 down-casting으로 형변환을 거친 이후에 접근이 가능하다
		}
	}
	
	public static void main(String[] args) {
		Actor a1 = new Actor("이순재");		
		Singer s1 = new Singer("김희철");
		Actor a2 = new Actor("이병헌");
		Singer s2 = new Singer("이지은");
		
		Enter(a1);	Enter(a2); Enter(s1); Enter(s2);
		
		ShowMember();
	}
}



