package day08;

class Pos {
	Pos() {				// 생성자(Constructor) : 클래스의 이름과 같은 이름의 반환형이 존재하지 않는 함수
		System.out.println("기본 생성자 호출 !!");
	}
	Pos(int x, int y) {	// 기본 생성자와 매개변수 개수가 다르다 (Method Overloading)
//		x = a;			// 전달받은 매개변수를 멤버 필드에 대입한다
//		y = b;			// 함수이므로 오버로딩이 가능함
		this.x = x;
		this.y = y;
	}
	int x, y;			// JVM에서 정수 필드의 초기값을 0으로 설정한다
	// 값을 다시 설정하는 명령어가 없는경우 초기값은 변하지 않는다
	// 식을 적을시 생성자에 포함된 인자 값을 변화하더라도 식의 값은 변화하지 않음

	void ShowPos() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println();
	}
}
public class Ex02_Constructor {

	public static void main(String[] args) {

		Pos ob1 = new Pos();
		Pos ob2 = new Pos(2, 3);
		// 같은 자료형의 여러 데이터를 묶어서 관리하는 형식 : 배열
		// 같은 클래스의 여러 객체를 배열에 묶어서 관리할 수 있다
	
		Pos [] arr = new Pos[] {ob1, ob2};
		for (Pos ob : arr) {			// 각각의 객체가 가지는 출력 함수를 호출
			ob.ShowPos();
		}
		
		ob1.ShowPos();
		ob2.ShowPos();

	}

}
