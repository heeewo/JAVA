package day07;

public class Ex02_2DArray {

	public static void main(String[] args) {
		int [][]arr = new int [5][];
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr[0] : " + arr[0]);
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = new int[4];
		}
		// ���Ը��ؼ� �迭�� ������� ũ�⸦ �����Ӱ� ���鶧�� �̷������� ����

		System.out.println("arr[0].lenght : " + arr[0].length);
		// 2���� �迭�� �ҽÿ� ù��° �迭�� ���� �迭���� ����Ű�� ���� ������(���� �ڷ����� ���)�̴�
		// �ᱹ �迭�� ������ �� �������� �迭���̴�
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf("%2d ", arr[i][j]);
			}System.out.println();
		}System.out.println();

		String [][] star = {{"�缮","ȣ��","����"},
				{"���","�±�","��ö"},
				{"����","����","����"}};
		// ����� �ʱ�ȭ�� ���� �Ҷ��� ����

		for (int i = 0; i < star.length; i++) {
			for (String n : star[i]) {
				System.out.printf("%s ", n);
			}System.out.println();
		}
			
	}

}
