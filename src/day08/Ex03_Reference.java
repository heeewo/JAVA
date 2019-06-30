package day08;


class Kid {
	Kid(String name) {	this.name = name;	}
	
	String name;
	Ball b;			//Ball 타입의 객체를 참조할 수 있는 b 비어있음
	
	void getBall(Ball b) {
		this.b = b;		// 받은 참조값을 비어있는 b에다 저장
		System.out.println(name + "가 " + b.name +"을 가지고 있다 !!\n");
	}
	void throwBall(Kid other) {	// Kid 타입을 참조할 수 있는 매개변수 other
		System.out.println(name + "가 " + other.name + "에게 " + b.name + "을 던졌다");
		other.getBall(b);
		this.b = null;			// 서로다른 두개의 b가 값을 중복으로 갖는걸 방지
	}
}
class Ball { String name = "공"; }

public class Ex03_Reference {

	public static void main(String[] args) {

		Kid minho = new Kid("민호");
		Kid chanhyuk = new Kid("찬혁이");
		Ball b = new Ball();
		
		minho.getBall(b);
		minho.throwBall(chanhyuk);
		chanhyuk.throwBall(minho);
	}

}
