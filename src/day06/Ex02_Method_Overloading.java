package day06;

public class Ex02_Method_Overloading {
	// 1. �� ������ ���� ��ȯ�ϴ� �Լ� Add()
	static int Add(int n1, int n2) { return n1 + n2; }
	// 2. �� ������ ���� ��ȯ�ϴ� �Լ� Add()
	static int Add(int n1, int n2, int n3) { return n1 + n2 +n3; }
	// 3. �� �Ǽ��� ���� ���������� ��ȯ�ϴ� �Լ� Add()
	static int Add(double d1, double d2) { return (int) (d1 + d2); }
	// 4. �������� ���� ���ڿ��� ��ȯ�ϴ� �Լ� Add()
//	static String Add(int n1, int n2) { return String.format("%d", n1 + n2); }
	
	public static void main(String[] args) {
		/*
		 *  �޼��� �����ε� :	�ϳ��� �Լ� �̸����� �� �� �̻��� �ߺ� �����ϴ� ���
		 *  				�Լ��� �Ű����� �ڷ����̳� ������ �������� �����Ѵ�(�߿�)
		 *  
		 *  ������ �����ε� : + ��ȣ�� ���ʿ� ��ġ�� ���� �ڷ����� ����
		 *  				���� Ȥ�� �Ǽ��̸� ������ �����ϰ�
		 *  				���ڿ��� ������, ��ü�� ���ڿ��� ����Ͽ� �̾���̴� ���� �����
		 *  		=>	+ ��ȣ�� �ϳ��� ��ȣ��, �ΰ� �̻��� ����� ������ �ִ�
		 */
		/*
		 * 	������ % ������ Ȱ���Ͽ� ���̸� ���Ѵ�
		 * 	���ڿ��� substring()�Լ��� Ȱ���Ͽ� �ڸ����� �����ϰ� ������ ��ȯ�� �� �ִ�
		 */
		String ex = "JAVA";
		System.out.println(ex.substring(0, 2));
		System.out.println(ex.substring(2, 4));
		System.out.println(ex.length());
		
	}

}
