package day11;

class Member {
	String name;
	int age;
	static int all;	//���� �ʵ�

	Member(String name, int age) {
		this.name = name;//�ν��Ͻ� �ʵ�
		this.age = age;
		System.out.println(name + " ��ü ����!!");
		all += 1;
	}

	public void ShowInfo() {//�ν��Ͻ� �޼ҵ�
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age + "��\n");
	}
	//Instance����� ������ ��ü�� �����ؾߵȴ�.
	public static void PrintAll() {//���� �޼ҵ�
		// static �Ӽ��� ������ �Ϲ� ��� ���� ��Һ��� ���� �����ǹǷ�, �Ϲ� ��Ҹ� ������ �� ���� ���� �ִ�
//		System.out.println("���� : " + age);
		// Cannot make a static reference to the non-static field age
//		age = 9; static �޼ҵ�� instance�� �ǵ� �� �����
		System.out.println("�������Ѱ�ü��: " + all + "\n");
		//�ν��Ͻ��� �������� �ʰ� Ŭ������ �̸�.�ʵ�, �޼ҵ� ������� ���ٰ���
		//static : Ŭ�����̸����� �����Ұž�~ (��������)
	}
}

public class Ex01_static {
	
	public void Func() {
		System.out.println("AAAA");
	}
	
	public static void main(String[] args) {
		Member.PrintAll();
		
		Member ob1 = new Member("������", 27);//�ν��Ͻ� ����
		Member ob2 = new Member("�ΰ���", 34);
		System.out.println();
		
		ob1.ShowInfo();	//�ν��Ͻ� �޼ҵ� ���
		ob2.ShowInfo();
		
		Member.PrintAll();
		ob1.PrintAll();
		// The static method PrintAll() from the type Member should be accessed in a static way
		ob2.PrintAll();
	
		//Func();
		// Cannot make a static reference to the non-static method Func() from the type Ex01_Static
	}
}


