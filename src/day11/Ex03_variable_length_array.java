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
		// 가변 길이 배열
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int [] arr = new int[n];
		int [] tmp = null;
		
		while(true) {
			for (int i = 0; i < arr.length; i++) {	// arr길이만큼 반복
				if(arr[i] == 0) {		// 배열멤버의 값이 0이면 입력받기
					System.out.printf("입력 (길이 : %d) : ", arr.length);
					arr[i] = Integer.parseInt(sc.nextLine());
					if(arr[i] == 0) {	// 입력한 값이 0이면 즉시 종료
						System.out.println("프로그램을 종료합니다");
						sc.close();
						return;
					}
					break;	// 한번 입력하면 다음 코드로 넘어간다
				}
			}
			PrintArray(arr);	// 배열의 상태 출력
			
			if (arr[arr.length - 1] != 0) {	// 배열의 마지막 값이 0이 아니면
					// 모든 값을 입력받았다면 마지막 값 또한 0이 아닐 것이다 == 배열이 꽉 찼다
				tmp = new int[arr.length + n];// 기존 배열 길이 + 3의 새로운 배열 생성
				for (int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;	// arr 참조변수는 새롭게 생성된 배열을 바라본다 (1 2 3 0 0 0)
			}	// 기존에 arr가 바라보던 배열은 참조받고 있지 않으므로, GC가 정리한다
		}
	}
}






