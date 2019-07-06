package day11;

class Test {	// Final : 값을 변경할 수 없다 (상수화)
	// Final은 초기화를 제외하고 값을 변경할 수 없기 때문에, 반드시 초기값을 지정해야 함
	/* 변수 : 변하는 수
	 * 상수 : 항'상' 변하지 않는 '수'
	 * final(상수) 필드 : 한 번 초기화 되면 프로그램 종료까지 그 값을 유지
	 * final필드는 이름을 관례상 대문자로 표시
	 */
int a;
static int b;
final int c;	// The blank final field c may not have been initialized
static final int d = 10;	// 필드에 고정 초기값
//static final 필드 : 수정은 안되는 전부 공유할 수 있는 필드
private static final Integer e = 123;

Test(int c){
this.c = c;	// 생성자를 통해서 값을 입력할 수 있다
}
// Final이 메서드에 작용하면, 메서드를 오버라이딩(재정의)할 수 없도록 만든다
}
public class Ex02_final {
	public static void main(String[] args) {
		Test ob = new Test(30);
		
		ob.a = 10;	// 인스턴스 필드는 대입이 가능
//		ob.b = 20;	// static은 Class로 접근해야 정상적인 접근
		Test.b = 20;
//		ob.c = 30;	// Final은 값을 변경할 수 없다
//		ob.d = 40;
//		Test.d = 40;	
		
	}
}
