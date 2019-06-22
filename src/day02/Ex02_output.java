package day02;

public class Ex02_output {

	public static void main(String[] args) {
		// 자바에서 사용하는 콘솔 출력 함수 3가지
		System.out.print("줄바꿈없는 기본 출련\n" );
		System.out.println("마지막에 자동으로 줄바꿈출력");
		System.out.printf("%s\n", "C언어의 printf() 함수처럼 작동함");
		/*
		 *  %d : 정수를 10진수로 출력		\t : 탭 크기만큼 오른쪽으로 커서를 이동
		 *  %f : 실수 출력					\n : 다음 줄로 커서를 이동
		 *  %c : 단일 문자 출력				\b : 왼쪽으로 커서를 한 칸 이동(지우지 않음)
		 *  %s : 문자열 출력				\" : 문자열 "가 아닌 글자로써의" (기능 제거)
		 */
		
		System.out.println("\"비오는 날은 짬뽕이지\" 라고 누군가 말했다");
		
		System.err.println("이 함수는 내용을 에러로 출력합니다");
		System.err.print("System.err. 에도 줄바꿈없는 출력함수도 있습니다\n");
		System.err.printf("%s\n", "서식을 활용한 출력입니다");
		
		System.out.print("1 바이트 크기의 영문자를 입력하세요 : ");
		int num = 5; // 사용자가 입력한 1바이트 크기의 키 값을 정수로 반환
		System.out.println("num : " + num); //'표준입출력 리다이렉션' 입력,출력,에러출력 3가지가 있다
		
		/*
		 *	System.in : 사용자로부터 입력받는 스트림
		 * 	System.out : 컴퓨터가 데이터를 표준 출력하기 위한 스트림
		 * 	System.err : 컴퓨터가 데이터를 에러로써 출력하기 위한 스트림
		 */

	}

}
