package day08;


class Kid {
	Kid(String name) {	this.name = name;	}
	
	String name;
	Ball b;			//Ball Ÿ���� ��ü�� ������ �� �ִ� b �������
	
	void getBall(Ball b) {
		this.b = b;		// ���� �������� ����ִ� b���� ����
		System.out.println(name + "�� " + b.name +"�� ������ �ִ� !!\n");
	}
	void throwBall(Kid other) {	// Kid Ÿ���� ������ �� �ִ� �Ű����� other
		System.out.println(name + "�� " + other.name + "���� " + b.name + "�� ������");
		other.getBall(b);
		this.b = null;			// ���δٸ� �ΰ��� b�� ���� �ߺ����� ���°� ����
	}
}
class Ball { String name = "��"; }

public class Ex03_Reference {

	public static void main(String[] args) {

		Kid minho = new Kid("��ȣ");
		Kid chanhyuk = new Kid("������");
		Ball b = new Ball();
		
		minho.getBall(b);
		minho.throwBall(chanhyuk);
		chanhyuk.throwBall(minho);
	}

}
