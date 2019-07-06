package day12;

//super class
//����Ŭ����, ����Ŭ����, �θ�Ŭ����
class Human {
	String name;
	
	void Show() { System.out.println("�̸� : " + name); }
}
//sub class
//����Ŭ����, ����Ŭ����, �ڽ�Ŭ����
//extends ��ɾ �̿��Ͽ� TvŬ������ ���
class Teacher extends Human {	// �������̵� : �θ�Ŭ�������� �������� �޼��带 �� ����
	String subject;
	// ��Ӱ��迡�� [������ ����� �θ�Ŭ����]�� �ۼ��Ѵ�
	// ��Ӱ��迡�� [���� ����� �ڽ�Ŭ����]���� �ۼ��Ѵ�
	// �θ�Ŭ������ ����� �� �����ؼ� [����� ��������� ���� �ٸ� ����]�� ����� �� �� �ִ�
	@Override 	// ������̼� : �ۼ��ڰ� �Ʒ��� �Լ��� �������̵��Ѵٶ�� ����Ͽ�, ��Ģ�� ��߳��� ���
	//�����ε� : �Ű������� Ÿ�԰� ������ ���� �ٸ� �޼ҵ� ȣ��
	//�������̵� : ������ �޼ҵ带 �ٸ� ������� ���
	void Show() { 	// ��ȯ��, �Ű�����, �Լ��̸� ��� �����ؾ� �Ѵ�. (������ ���� ����)
		System.out.println("�̸� : " + name);
		System.out.println("��� ���� : " + subject);
	}
//	@Override
//	void Test() {}
//	The method Test() of type Teacher must override or implement a supertype method
}

class Student extends Human {
	int age;
	@Override
	void Show() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
public class Ex01_Inheritance {
/*
����(�θ�) Ŭ�����κ��� ����(�ڽ�) Ŭ������ �� ����� �״�� �����޴´�.
�̹� ���ߵ� Ŭ������ �����Ͽ� ���ο� Ŭ������ �ۼ��� �� �ִ�.
���߽ð��� ������ �� �ְ� �ڵ��� �ߺ��� ���� �� �ִ�.
����� �Ͽ��� ����(�θ�)Ŭ������ private �ʵ� & �޼ҵ� & �����ڴ� ��Ӵ�󿡼� ���ܵȴ�.
����(�ڽ�) Ŭ������ ����(�θ�) Ŭ������ ����� ������ �����Ѵ�.
�ڹٴ� �ٸ� ��ü���� ���α׷��� ���� �ٸ��� ���� ����� ������� �ʴ´�.
TV => IPTV(TV + IP���õ� ��ɵ� �߰�)

class ����Ŭ���� extends ����Ŭ����
 */
	
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "���1";
		
		Teacher t1 = new Teacher();
		t1.name = "heeewo";
		t1.subject = "��ǻ��";
		
		Student s1 = new Student();
		s1.name = "������";
		s1.age = 27;
		
		h1.Show(); System.out.println();	// �θ�Ŭ������ �θ�Ŭ������ Show()
		t1.Show(); System.out.println();	// �ڽ� Ŭ������ �ڱ⿡ �´� Show() �� ȣ��
		s1.Show(); System.out.println();
		
		
	}
}

