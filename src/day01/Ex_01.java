package day01;

public class Ex_01 {

	public static void main(String[] args) {

		/*
		 * 1. �ҽ� ���ϴ� public class�� �ݵ�� �ϳ��� �����Ѵ� 2. public class �� �̸���, �ҽ� ������ �̸��� ���ƾ� �Ѵ�
		 * 3. ��� Ŭ������ �̸��� ù���ڸ� ���� �빮�ڷ� ó���Ѵ�
		 * 
		 * - ����ü(Clang) + �Լ� => Ŭ���� - ����ü : ����� ���� '�ڷ���' - Ŭ������ �ڷ������� ����� �� �ִ� => �ڷ���
		 * �߿��� ù ���ڰ� �빮���� ��� �ڷ����� Ŭ���� �ڷ����̴�
		 * 
		 */

		boolean bo = true;	// 1 Byte �� �ڷ��� : true / false �� �����Ѵ�

		byte by = 127;		// 1 Byte ũ���� ���� �ڷ��� : -128 ~ 127
		short sh = 32767;	// 2 Byte ũ���� ���� �ڷ��� : -32768 ~ 32767
		char ch = 65535; 	// 2 Byte ũ���� ���� �ڷ���, ���ڸ� ǥ���� �� ���
							// ���ڴ� ������ �����Ƿ�, 0 ~ 65535
		int num = 1234; 	// 4 Byte ũ���� ���� ��ǥ �ڷ��� : �� -21��~ +21��

		long ln = 23451; 	// 8 Byte ũ���� ���� �ڷ��� : int ���� ŭ
		float fl = 1.2f; 	// 4 Byte ũ���� �Ǽ� �ڷ���

		double db = 3.14; 	// 8 Byte ũ���� �Ǽ� ��ǥ �ڷ���

		String str = "������";// ���ڿ��� �����ϴ� 4 Byte ũ���� ���� ����
							// (���ڿ��� ����Ű�� ������ ������ ������)
							// ù ���ڰ� �빮�� => Ŭ���� �ڷ���

		System.out.println("bo : " + bo);
		// + �����ڰ� ���ڿ��� �����ϸ� ������ ������ �ƴ϶�, ���� ������ �����Ѵ�
		System.out.println(num + db);
		// ���� ���� ���� : ���� ���Ѵ�
		System.out.println(str + num);
		// ���ڿ��� ���� ���� ���� : ���� �̾� ���δ�
		char ch1 = 65; // ASCII Code
		System.out.println("ch1 : " + ch1);

		char ch2 = '\u0041';
		System.out.println("ch2 : " + ch2);

		char ch3 = '��';		// ���� ���� : Ȭ����ǥ
		System.out.println("ch3 : " + ch3);

		String str2 = "��";	// ���ڿ� : �ֵ���ǥ
		System.out.println("str2 : " + str2);

		char arr[] = str2.toCharArray();
		// ���� �巡�� -> Ctrl + Shift + F : ����
		for (int i = 0; i < arr.length; i++) {
			// �迭�� ���̴� arr.length ���� �ڵ����� ����Ͽ� �˷��ش�
		}
	}

}
