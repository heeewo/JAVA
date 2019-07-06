package day14;

import java.util.ArrayList;

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void Show() {
		System.out.println(name + " : " + age + "��");
	}
}

public class Ex02_ArrayList {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();	// ��� ��ü�� �������� �����ϴ� ArrayList ��ü
//		ArrayList is a raw type
//		References to generic type ArrayList<E> should be permenant
		System.out.println("al.size() : " + al.size());

		al.add(10);			// Object arr[0] = 10;
		al.add(20);			
		al.add("ITBANK");	// Object arr[2] = "ITBANK";
		al.add(20);
		
		System.out.println("al.size() : " + al.size());
		for(int i = 0;i<al.size(); i++) {
			System.out.println("al.get(" + i +") : " + al.get(i));
			//System.out.println(arr[i])
		}
		// 1. ������ �ִ�
		// 2. �ߺ��� ���
		
		for(Object ob : al) {
			System.out.println(ob);
		}
		Person p1 = new Person("������", 65);
		Person p2 = new Person("������", 64);
		Person p3 = new Person("�ǿ���", 66);
		
		al.add(p1); al.add(p2); al.add(p3);
		
		for(int i = 0; i<al.size(); i++) {
//			al.get(i).Show();	// Object���� Show()�� ���ǵǾ� ���� �ʴ�
			if(al.get(i) instanceof Person) {
				((Person)al.get(i)).Show();
			}
		}
		
		ArrayList <Person> al2 = new ArrayList<Person>();
//		al2.add("ITBANK"); Person�� �ƴ� ��ü�� �߰��� �� ����
		al2.add(p1); al2.add(p2); al2.add(p3);
		
		for(int i = 0; i<al2.size();i++) {
			al2.get(i).Show();
		}
		al2.remove(2);	//index 2��°�� �ִ� ��ü�� �����ϰ� ���̸� �ڵ����� �����Ѵ�
		for(Person p : al2) {
			p.Show();
		}
		
	}
}
