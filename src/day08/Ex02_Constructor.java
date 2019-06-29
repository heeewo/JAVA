package day08;

class Pos {
	Pos() {				// ������(Constructor) : Ŭ������ �̸��� ���� �̸��� ��ȯ���� �������� �ʴ� �Լ�
		System.out.println("�⺻ ������ ȣ�� !!");
	}
	Pos(int x, int y) {	// �⺻ �����ڿ� �Ű����� ������ �ٸ��� (Method Overloading)
//		x = a;			// ���޹��� �Ű������� ��� �ʵ忡 �����Ѵ�
//		y = b;			// �Լ��̹Ƿ� �����ε��� ������
		this.x = x;
		this.y = y;
	}
	int x, y;			// JVM���� ���� �ʵ��� �ʱⰪ�� 0���� �����Ѵ�
	// ���� �ٽ� �����ϴ� ��ɾ ���°�� �ʱⰪ�� ������ �ʴ´�
	// ���� ������ �����ڿ� ���Ե� ���� ���� ��ȭ�ϴ��� ���� ���� ��ȭ���� ����

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
		// ���� �ڷ����� ���� �����͸� ��� �����ϴ� ���� : �迭
		// ���� Ŭ������ ���� ��ü�� �迭�� ��� ������ �� �ִ�
	
		Pos [] arr = new Pos[] {ob1, ob2};
		for (Pos ob : arr) {			// ������ ��ü�� ������ ��� �Լ��� ȣ��
			ob.ShowPos();
		}
		
		ob1.ShowPos();
		ob2.ShowPos();

	}

}
