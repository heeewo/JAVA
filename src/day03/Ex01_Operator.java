package day03;

public class Ex01_Operator {

	public static void main(String[] args) {
	
		// 연산자 : 소스 코드에서 값을 변경하거나, 대입하는데 사용하는 기호
		
		// 산술 연산자 : 덧셈, 뺄셈, 곱셈, 나눗셈(몫, 나머지)
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		// 1. 정수 감의 연산은 정수 결과를 도출한다
		// 2. 연산에 실수가 포함되면 실수형의 결과를 도출한다
		
		System.out.println("n1 / (double)n2 = " + (n1 / (double)n2));

		int kor = 100, eng = 99, mat = 87;
		int sum = kor + eng + mat;
		double avg = sum / 3.0;		//.0 을 붙이는 것만으로도 실수로 쉽게 변환이 가능하다
		System.out.println("평균 : " + avg);
		/* 자릿수 제한 */
		System.out.printf("평균 (둘째자리까지) : %.2f\n", avg);
		String avg2 = String.format("%.2f", avg); //서식을 변환하여 문자열로 저장
		System.out.println("평균 : " + avg2);
		
		// % 연산 용도(나머지)
		// 1. 수의 홀짝, 배수, 약수를 판별한다 -> 소수
		// 2. 10, 100, 1000 등으로 나누어서 정수의 자릿수를 구분할 때
		int num = 930516;
		int date = num % 100;
		num = num / 100;
		int month = num % 100;
		int year = num / 100;
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		
		// 3. 난수의 범위를 제한할 때
		// 어떠한 수이든 n으로 나누면 그 나머지는 n보다 작은 숫자이다
		
		// 단항 연산자 (증감연산자)
		n1 = 10;
		System.out.println("n1++ : " + n1++);
		System.out.println("++n1 : " + ++n1);
		System.out.println("n1-- : " + n1--);
		System.out.println("--n1 : " + --n1);
		

	}

}
