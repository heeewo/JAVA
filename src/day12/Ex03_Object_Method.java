package day12;


class AA extends Object {
	// Object : �ڹٿ� �����ϴ� ��� Ŭ������ �ֻ��� Ŭ����
	@Override
	public boolean equals(Object obj) {	// Object�� �޼��带 �������̵�
		return true;
	}
	@Override
	public String toString() {
		return "��ü �ڽ��� ����";
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
		System.out.println(bo);	// ������ ���� ��ü�� �ƴϰ�, �������̵� �Ǿ ������ true�� ��ȯ
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
				System.out.println(tmp.equals("BBB"));	// �������̵� �ƴ϶�� false�� ����
			}
		}
	}
}


