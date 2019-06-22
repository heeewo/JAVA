package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// !! 이 파일에서 보여드리는 입력은 원리를 설명하기 위한 내용이지
		//    모두 암기해야 하는 내용이 아닙니다
		
		int num;
		System.out.print("1 Byte의 영어 대문자 입력 : ");
		num = System.in.read();		// A, 엔터 (\r, \n) (13, 10)
		System.out.println("num : " + num);
		char ch = (char)num;
		System.out.println("ch :" + ch);
		System.in.read();
		System.in.read();
		
		InputStreamReader ins = new InputStreamReader(System.in);
		System.out.print("2 Byte의 한글 입력: ");
		num = ins.read();
		ch = (char)num;
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = br.readLine();
		System.out.println("str : " + str);
		
		// Java 1.5 이후 Scanner 라는 입력기를 이용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	// 입력받은 데이터를 정수 형태로 반환
		
		System.out.print("실수 입력 : ");
		double db = sc.nextDouble();	//입력받은 데이터를 실수형태로 반환
		sc.nextLine();
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine();	// 입력받은 문자열을 줄바꿈문자(\n)까지 읽어들여서 반환
		
		System.out.println("한글자 입력 : ");
		ch = sc.nextLine().charAt(0);
		
		System.out.println("num : " + num);
		System.out.println("db : " + db);
		System.out.println("str : " + str);
		System.out.println("ch : " + ch);
		sc.close();
		
	}

}
