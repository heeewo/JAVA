package day14;
import java.util.Enumeration;
import java.util.Hashtable;	//Map�� ������ Ŭ����
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
		// Hashtable : key�� value�� �� ������ ��� �ڷḦ �����Ѵ�
		// Map������ key�� Array������ index�� �ش��Ѵ�
		// key�� �ڷ����� ������ ����, value�� �ڷ����� ������ ����
		// key�� �̿��Ͽ� value�� ���Ҽ� ������, value�� �˾Ƶ� key�� ���� �� ����
		// Python�� Dictionary�� ������ �����̴�
		
		ht.put("�ٴ�", "��");
		ht.put(1, 100);
		ht.put("apple", "���");
		ht.put(1, 200);
		ht.put(2, 100);
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get("apple"));
		System.out.println(ht.get("���"));
		
		Enumeration enu = ht.keys();	// key �� ��� ����
		
		while(enu.hasMoreElements()) {	// ������� ���� Ű�� �ִٸ�
			Object key = enu.nextElement();	// Ű�� �����ϰ�
			Object value = ht.get(key);		// ����� Ű�� �̿��Ͽ� value�� ����
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
		
		System.out.println("===�Է� �Ϸ�===");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
	}

}