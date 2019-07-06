package day12;


class AA extends Object {
	// Object : 자바에 존재하는 모든 클래스의 최상위 클래스
	@Override
	public boolean equals(Object obj) {	// Object의 메서드를 오버라이딩
		return true;
	}
	@Override
	public String toString() {
		return "객체 자신의 정보";
	}
	
//	@Override
//	public Class getClass() {
//		// Cannot override the [final] method from Object
//	}
}
public class Ex03_Object_Method {
	public static void main(String[] args) {
		AA ob1 = new AA();
		boolean bo = ob1.equals("B");
		System.out.println(bo);	// 실제로 같은 객체가 아니고, 오버라이딩 되어서 무조건 true를 반환
		System.out.println("ob1".equals(ob1));
		System.out.println();
		
		System.out.println(ob1.toString());
		System.out.println(ob1);
		
		Object [] arr = new Object[3];
		
		arr[0] = new String("Hello, world !!");
		arr[1] = new Integer(300);
		arr[2] = new AA();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			if(arr[i] instanceof AA) {
				AA tmp = (AA)arr[i];
				System.out.println(tmp.equals("BBB"));	// 오버라이딩 아니라면 false가 나옴
			}
		}
	}
}


