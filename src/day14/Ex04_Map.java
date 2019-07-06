package day14;
import java.util.Enumeration;
import java.util.Hashtable;	//Map을 구현한 클래스
import java.util.Scanner;

class Request {
	private Hashtable<String, String> ht = new Hashtable<String, String>();
	
	public void setParameter(String name, String value) {
		ht.put(name, value);
	}
	public String getParameter(String name) {
		return ht.get(name);
	}
}
public class Ex04_Map {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		// Hashtable : key와 value를 한 쌍으로 묶어서 자료를 저장한다
		// Map에서의 key는 Array에서의 index에 해당한다
		// key의 자료형도 제한이 없고, value의 자료형도 제한이 없다
		// key를 이용하여 value를 구할수 있으나, value를 알아도 key를 구할 수 없다
		// Python의 Dictionary와 유사한 구조이다
		
		ht.put("바늘", "실");
		ht.put(1, 100);
		ht.put("apple", "사과");
		ht.put(1, 200);
		ht.put(2, 100);
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get("apple"));
		System.out.println(ht.get("사과"));
		
		Enumeration enu = ht.keys();	// key 만 묶어서 전달
		
		while(enu.hasMoreElements()) {	// 사용하지 않은 키가 있다면
			Object key = enu.nextElement();	// 키를 저장하고
			Object value = ht.get(key);		// 저장된 키를 이용하여 value를 구함
			System.out.println(key + " : " + value);
		}
		System.out.println("----------------------------------");
		Request request = new Request();
		
		Scanner sc = new Scanner(System.in);
		
		String [] field = {"name", "age", "gender"};
		
		for (int i = 0; i < field.length; i++) {
			System.out.print(field[i] + " : ");
			String value = sc.nextLine();
			request.setParameter(field[i], value);
		}
		
		System.out.println("===입력 완료===");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}

}