package day07;

public class Ex01_Array {

	public static void main(String[] args) {

		int num = 10; 				// primitive �ڷ����� ������ ���� �����͸� �����Ѵ�
		
		int [] arr = {1,2,3,4};
		int arr2 [] = {11,22,33,44};
		int arr3[/*5*/];			// �ڹٿ����� []�� ������ �迭�� ����Ű�� �ǹ̸� �����ϰ�
									// ���� ���̰��� �ۼ����� �ʴ´�
		int arr4[] = new int[4];	// ���� ���� �ʰ�, ���̸� �����Ͽ� ������ ���
		int arr5[] = new int[] {10,20,30,40};
									// ���� ���, ��� ���� �ۼ��� ���� �ִ�
//		int arr6[] = new int[5] {1,2,3,4,5};
									// �ΰ��� ���ô� X
		System.out.println(arr[0]);	// �迭�̸�[÷��] �� �������� ��� ������ ����ų �� �ִ�
		System.out.println(num);	// ��� ������ �Ϲ� ������ �����ϰ� ����Ѵ�
		
		System.out.println(arr2[2]);
		arr2[2] = 30;
		System.out.println(arr2[2]);
		
		// �迭 ��ü�� ����ϱ� : �迭�� �ε����� �׻� [0]���� �����ؼ� [���� - 1]���� �����Ѵ�
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}System.out.println();
		
		arr3 = null;				//*arr3 = 0;
		System.out.println(arr3);
		// arr3�� ��������(��ġ�� �˷��ִ�)�ϻ� �迭 �� ��ü�� �ƴϹǷ�, �ٶ󺸴� ����� �󸶵��� �ٲ� �� �ִ�
		arr3 = arr2;				// C������ �������� �ʴ´�
		
		System.out.println(arr3.length);
		for(int n : arr3) {
			System.out.print(n + " ");
		}System.out.println();
		for(int n : arr2) {
			System.out.print(n + " ");
		}System.out.println();
		arr3[2] = 34;
		System.out.println(arr2[2]);


	}

}
