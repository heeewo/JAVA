package day07;

public class Ex02_2DArray {

	public static void main(String[] args) {
		int [][]arr = new int [5][];
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr[0] : " + arr[0]);
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = new int[4];
		}
		// 쉽게말해서 배열의 멤버들의 크기를 자유롭게 만들때는 이런식으로 설정

		System.out.println("arr[0].lenght : " + arr[0].length);
		// 2차원 배열을 할시에 첫번째 배열들 또한 배열들을 가르키는 참조 변수들(같은 자료형을 담는)이다
		// 결국 배열을 값들은 맨 마지막의 배열들이다
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf("%2d ", arr[i][j]);
			}System.out.println();
		}System.out.println();

		String [][] star = {{"재석","호동","동엽"},
				{"명수","승기","희철"},
				{"형돈","수근","준현"}};
		// 선언과 초기화를 같이 할때만 가능

		for (int i = 0; i < star.length; i++) {
			for (String n : star[i]) {
				System.out.printf("%s ", n);
			}System.out.println();
		}
			
	}

}
