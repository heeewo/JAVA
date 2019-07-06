package day12;

class Humen{
	String name;
	// 1. �����ڸ� ���ڿ��� ���޹޾Ƽ�, this.name�� �����ϴ� �����ڸ� �ۼ�
	Humen(String name) 	{ this.name = name; }
}
class Actor extends Humen{
	Actor(String name){
		super(name);
	}
	final String job = "���";
}
class Singer extends Humen{
	Singer(String name){	// �θ�Ŭ������ �⺻�����ڸ� ����� ������ �Ű������� �����ؼ� ����
		super(name);
	}
	final String job = "����";
}
public class Ex04_Polymorphism {
	static Humen [] arr = new Humen[3];
	
	public static void Enter(Humen h) {		// up-casting�� �ϸ� ���� �ٸ� �ڷ����� �ϳ��� ó���� �� �ִ�
		// ������ ������� �Ű������� ���޹��� ��ü�� �迭�� �� ����� �ִ� �ڵ�
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = h;
				return;
			}
		}
		System.out.println("���� �� á���ϴ�");
	}
	public static void ShowMember() {
		// 2. arr �迭�� �� ����� �̸��� ����ϴ� �ڵ带 �ۼ� 
		// �θ�Ŭ������ ������ �ʵ�(name)�� ���븸 ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ". " + arr[i].name);
			// name �ʵ�� �θ�Ŭ���� Human�� ���ǵǾ� �־ ĳ������ �ʿ� ���� !!
			// 3. ������ ������ ���� ����ϵ��� �ڵ带 �߰��ϼ���
			if(arr[i] instanceof Actor)
				System.out.println("���� : " + ((Actor)arr[i]).job);
			if(arr[i] instanceof Singer)
				System.out.println("���� : " + ((Singer)arr[i]).job);
			System.out.println();
			// �ڽ�Ŭ�������� �߰��� ������ down-casting���� ����ȯ�� ��ģ ���Ŀ� ������ �����ϴ�
		}
	}
	
	public static void main(String[] args) {
		Actor a1 = new Actor("�̼���");		
		Singer s1 = new Singer("����ö");
		Actor a2 = new Actor("�̺���");
		Singer s2 = new Singer("������");
		
		Enter(a1);	Enter(a2); Enter(s1); Enter(s2);
		
		ShowMember();
	}
}



