package day06;

public class Ex01_Function {	// �ҽ��ڵ忡�� public class�� �ϳ��� �����Ѵ�

		static int Add(int n1 , int n2) {	// �Լ��� ����(definition)
		// [��ȯ�ڷ���] [�Լ��̸�](�Ű������ڷ��� �Ű������̸�, �Ű�����2, �Ű�����3 ...)
		//	 	y	=	f	(x)
			return n1 + n2;
		}
		// ��ȯ�ڷ����� �μ������� ū��� �ڵ����� ����ȯ�� �����Ѵ� 
		// �ݴ��� ��� ���� ����ȯ�� �ؾ��ϰ� ���ڿ����� ����ȯ�� �������� �ʴ´�. >>format.String(�ڷ���, �μ�);�� ���°� �� ����
		static double Multi(double n1, double n2) { // promotion
			return n1 * n2;
		}
//		static String Multi(double n1, double n2) { // can not convert
//			return n1 * n2;
//		}
		
		public static void main(String[] args) {	// main�Լ��� public class���� ����
			// �Լ� (Function) : '�ҽ� �ڵ忡�� Ư���� �۾��� �����ϴ� �ڵ��� ����'
			/*
			 * 		class ������ �Լ��� �޼���(Method)��� �Ѵ�
			 * 		�ڹٿ����� ��� �Լ��� class ���ο� ���� �ֱ� ������
			 * 		(�ڹٴ� �ڵ��� �⺻������ class�̴�)
			 * 		�Ϲ�������, �ڹٿ����� �Լ���� ��Ī ��� �޼����� ���� �θ���
			 */
			
			Add(10, 20);	// �Լ��� ȣ��  = 30;
							// y = f(X)
			System.out.println(Add(10,20));
//			�Լ��� ȣ���� �Լ��� ��ȯ������ ��ü�ȴ�
			int result = Add(100, 200);
			System.out.println(result);
			
			System.out.println(Multi(10,20));
			
			
		}

}
