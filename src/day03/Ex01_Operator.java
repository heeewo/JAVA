package day03;

public class Ex01_Operator {

	public static void main(String[] args) {
	
		// ������ : �ҽ� �ڵ忡�� ���� �����ϰų�, �����ϴµ� ����ϴ� ��ȣ
		
		// ��� ������ : ����, ����, ����, ������(��, ������)
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		// 1. ���� ���� ������ ���� ����� �����Ѵ�
		// 2. ���꿡 �Ǽ��� ���ԵǸ� �Ǽ����� ����� �����Ѵ�
		
		System.out.println("n1 / (double)n2 = " + (n1 / (double)n2));

		int kor = 100, eng = 99, mat = 87;
		int sum = kor + eng + mat;
		double avg = sum / 3.0;		//.0 �� ���̴� �͸����ε� �Ǽ��� ���� ��ȯ�� �����ϴ�
		System.out.println("��� : " + avg);
		/* �ڸ��� ���� */
		System.out.printf("��� (��°�ڸ�����) : %.2f\n", avg);
		String avg2 = String.format("%.2f", avg); //������ ��ȯ�Ͽ� ���ڿ��� ����
		System.out.println("��� : " + avg2);
		
		// % ���� �뵵(������)
		// 1. ���� Ȧ¦, ���, ����� �Ǻ��Ѵ� -> �Ҽ�
		// 2. 10, 100, 1000 ������ ����� ������ �ڸ����� ������ ��
		int num = 930516;
		int date = num % 100;
		num = num / 100;
		int month = num % 100;
		int year = num / 100;
		System.out.printf("%d�� %d�� %d��\n", year, month, date);
		
		// 3. ������ ������ ������ ��
		// ��� ���̵� n���� ������ �� �������� n���� ���� �����̴�
		
		// ���� ������ (����������)
		n1 = 10;
		System.out.println("n1++ : " + n1++);
		System.out.println("++n1 : " + ++n1);
		System.out.println("n1-- : " + n1--);
		System.out.println("--n1 : " + --n1);
		

	}

}
