package day07;

public class Ex03_args {

	public static void main(String[] args) {
		/*
		 *  C:\> java Ex03_args			// 단순 실행
		 *  
		 *  C:\> java Ex03_args /h		// /h라는 문자열을 매개변수로 메인함수에 전달
		 *  
		 *  C:\> java Ex03_args --help	// --help 라는 문자열을 매개변수로 메인함수에 전달
		 */
		
		// int main(int argc, char ** argv) { //매개변수 카운트, 문자열의 배열을 받아줌
		
		System.out.println("args test !!");
		System.out.println("args.length : " + args.length);
		for(int i=0; i < args.length; i++) {
			System.out.printf("args[%d] : %s\n", i, args[i]);
		}
		
		if(args.length > 0) {
			if(args[0].equals("/a")) {
				System.out.println("매개변수를 식별했습니다");
				System.out.println("/a 옵션을 전달받아서 맞는 내용을 출력합니다");
			}
			switch(args[0]) {
			case "naver":		// java day08.Ex04_args naver
				// 웹 브라우저를 통해서 사이트를 호출하는 코드
				break;
			case "daum":		// java day08.Ex04_args naver
				// 웹 브라우저를 통해서 사이트를 호출하는 코드
				break;
			}
		}
	}

}
