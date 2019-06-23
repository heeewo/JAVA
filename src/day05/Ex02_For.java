package day05;

public class Ex02_For {

	public static void main(String[] args) {
		int i = 0;							//1
		while(i<5) {						//2
			System.out.println("while");	//3
			i++;							//4
		}
		// while�� Ƚ���� ������� �ݺ��� ó���� �� �ַ� ���
		
		for (int j = 0; j < 5; j++) {		//1 2 4
			
			System.out.println("for");		//3
		}
		// for���� ��Ȯ�ϰ� Ƚ���� ������ �ִ� �ݺ������� �ַ� ���
		// 1. main�Լ��� for���� ����Ǵ� �Լ����� ������ ����� ������ �ߺ� ������ �� ����
		
		// 2. for���� ������ ���� �����ϴ� (while(true) �� �����ϰ� ���)
		
		PROGRAM : for(int k = 0;; k++) {
			System.out.println("���ѷ���");
			break PROGRAM; // label : break�� continue�� ����� �Ǿ� �����Ҽ� �ְ� �Ѵ�
			// return; // return�� ������ ���� �Լ��� ����ȴ�
			// break; // ���� ��ġ���� ���� ����� switch, for, while, do �� Ż��
		}

		// 3. Java������ ���̰� �������� ���� ������ for���� �����ϴ�
		// (���̰� ������ �ݺ� ������ ������ ��ü���� �Ѵ�)
		int arr[] = {2,7,4,8,6};
		
		for(int k=0;k < arr.length; k++) {
			System.out.printf("%d%s", arr[k], (k == arr.length - 1) ? "\n" : ", ");
		}
		
		for(int num : arr) {	// ���̿� ������� ������ ��� ����� �����ϱ� ���� for��
			System.out.print(num + " ");
		}System.out.println();
		// arr ���ο� �ִ� �� ���� �ϳ��� int num�̶�� ������ ��
		// ó������ ������ ��� num�� �������� �����Ͽ� ��� (foreach, ���� for��)
		
		// ��) 1���� 100������ �� �߿���, ¦���� ���� ���ϰ�, ���� ����ض�
		int sum = 0;	// ������ ���� �׵��
		for(int index =1; index <= 100; index++) {
			if(index % 2 == 0)
				sum += index;
		}
		System.out.println("1���� 100������ ¦���� �� : " + sum);
		
		// �غ�� �迭���� �� �л����� ������ ����Ǿ� �ִ�
		// ��� �л��� ������ ���� �հ踦 ���ϼ���
		
		int score[] = {99, 88, 72, 98, 62, 59, 80};
		int score_sum = 0;
		for(int num : score) {	// ��� ���� : ��ü ��ü (iterable �ڷ���)
			score_sum += num;
		}
		
		System.out.println("�հ��  : " + score_sum);

		for (int k = 0; k < 5; k++) {			// �ܺ� for : ����
			//System.out.println("0 0 0 0 0");
			for (int j =0; j < 5; j++) {		// ���� for : ����
				System.out.print("0 ");
			}System.out.println();
		}
		
		
	}

}
