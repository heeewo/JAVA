package day11;
import java.util.Scanner;

public class Ex03_variable_length_array {
	static void PrintArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// ���� ���� �迭
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int [] arr = new int[n];
		int [] tmp = null;
		
		while(true) {
			for (int i = 0; i < arr.length; i++) {	// arr���̸�ŭ �ݺ�
				if(arr[i] == 0) {		// �迭����� ���� 0�̸� �Է¹ޱ�
					System.out.printf("�Է� (���� : %d) : ", arr.length);
					arr[i] = Integer.parseInt(sc.nextLine());
					if(arr[i] == 0) {	// �Է��� ���� 0�̸� ��� ����
						System.out.println("���α׷��� �����մϴ�");
						sc.close();
						return;
					}
					break;	// �ѹ� �Է��ϸ� ���� �ڵ�� �Ѿ��
				}
			}
			PrintArray(arr);	// �迭�� ���� ���
			
			if (arr[arr.length - 1] != 0) {	// �迭�� ������ ���� 0�� �ƴϸ�
					// ��� ���� �Է¹޾Ҵٸ� ������ �� ���� 0�� �ƴ� ���̴� == �迭�� �� á��
				tmp = new int[arr.length + n];// ���� �迭 ���� + 3�� ���ο� �迭 ����
				for (int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;	// arr ���������� ���Ӱ� ������ �迭�� �ٶ󺻴� (1 2 3 0 0 0)
			}	// ������ arr�� �ٶ󺸴� �迭�� �����ް� ���� �����Ƿ�, GC�� �����Ѵ�
		}
	}
}






