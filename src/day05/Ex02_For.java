package day05;

public class Ex02_For {

	public static void main(String[] args) {
		int i = 0;							//1
		while(i<5) {						//2
			System.out.println("while");	//3
			i++;							//4
		}
		// while은 횟수에 상관없는 반복을 처리할 때 주로 사용
		
		for (int j = 0; j < 5; j++) {		//1 2 4
			
			System.out.println("for");		//3
		}
		// for문은 명확하게 횟수가 정해져 있는 반복문에서 주로 사용
		// 1. main함수나 for문이 실행되는 함수에서 이전에 선언된 변수는 중복 선언할 수 없다
		
		// 2. for문의 조건은 생략 가능하다 (while(true) 와 유사하게 사용)
		
		PROGRAM : for(int k = 0;; k++) {
			System.out.println("무한루프");
			break PROGRAM; // label : break나 continue의 대상이 되어 실행할수 있게 한다
			// return; // return을 만나면 현재 함수가 종료된다
			// break; // 현재 위치에서 가장 가까운 switch, for, while, do 를 탈출
		}

		// 3. Java에서는 길이가 지정되지 않은 형식의 for문도 가능하다
		// (길이가 없더라도 반복 가능한 형식의 객체여야 한다)
		int arr[] = {2,7,4,8,6};
		
		for(int k=0;k < arr.length; k++) {
			System.out.printf("%d%s", arr[k], (k == arr.length - 1) ? "\n" : ", ");
		}
		
		for(int num : arr) {	// 길이에 상관없이 내부의 모든 멤버를 참조하기 위한 for문
			System.out.print(num + " ");
		}System.out.println();
		// arr 내부에 있는 각 값을 하나씩 int num이라고 가정할 때
		// 처음부터 끝까지 모든 num을 띄워쓰기로 구분하여 출력 (foreach, 향상된 for문)
		
		// 예) 1부터 100까지의 수 중에서, 짝수의 합을 구하고, 합을 출력해라
		int sum = 0;	// 덧셈에 대한 항등원
		for(int index =1; index <= 100; index++) {
			if(index % 2 == 0)
				sum += index;
		}
		System.out.println("1부터 100까지의 짝수의 합 : " + sum);
		
		// 준비된 배열에는 각 학생들의 점수가 저장되어 있다
		// 모든 학생의 점수를 합한 합계를 구하세요
		
		int score[] = {99, 88, 72, 98, 62, 59, 80};
		int score_sum = 0;
		for(int num : score) {	// 멤버 변수 : 전체 객체 (iterable 자료형)
			score_sum += num;
		}
		
		System.out.println("합계는  : " + score_sum);

		for (int k = 0; k < 5; k++) {			// 외부 for : 세로
			//System.out.println("0 0 0 0 0");
			for (int j =0; j < 5; j++) {		// 내부 for : 가로
				System.out.print("0 ");
			}System.out.println();
		}
		
		
	}

}
