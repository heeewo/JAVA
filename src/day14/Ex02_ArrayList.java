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
		System.out.println(name + " : " + age + "살");
	}
}

public class Ex02_ArrayList {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();	// 모든 객체를 선형으로 저장하는 ArrayList 객체
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
		// 1. 순번이 있다
		// 2. 중복을 허용
		
		for(Object ob : al) {
			System.out.println(ob);
		}
		Person p1 = new Person("마리오", 65);
		Person p2 = new Person("루이지", 64);
		Person p3 = new Person("피오라", 66);
		
		al.add(p1); al.add(p2); al.add(p3);
		
		for(int i = 0; i<al.size(); i++) {
//			al.get(i).Show();	// Object에는 Show()가 정의되어 있지 않다
			if(al.get(i) instanceof Person) {
				((Person)al.get(i)).Show();
			}
		}
		
		ArrayList <Person> al2 = new ArrayList<Person>();
//		al2.add("ITBANK"); Person이 아닌 객체는 추가할 수 없다
		al2.add(p1); al2.add(p2); al2.add(p3);
		
		for(int i = 0; i<al2.size();i++) {
			al2.get(i).Show();
		}
		al2.remove(2);	//index 2번째에 있는 객체를 삭제하고 길이를 자동으로 조정한다
		for(Person p : al2) {
			p.Show();
		}
		
	}
}
