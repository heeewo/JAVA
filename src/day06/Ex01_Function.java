package day06;

public class Ex01_Function {	// 소스코드에서 public class는 하나만 존재한다

		static int Add(int n1 , int n2) {	// 함수의 정의(definition)
		// [반환자료형] [함수이름](매개변수자료형 매개변수이름, 매개변수2, 매개변수3 ...)
		//	 	y	=	f	(x)
			return n1 + n2;
		}
		// 반환자료형이 인수값보다 큰경우 자동으로 형변환을 지원한다 
		// 반대의 경우 강제 형변환을 해야하고 문자열로의 형변환은 지원하지 않는다. >>format.String(자료형, 인수);를 쓰는게 더 좋다
		static double Multi(double n1, double n2) { // promotion
			return n1 * n2;
		}
//		static String Multi(double n1, double n2) { // can not convert
//			return n1 * n2;
//		}
		
		public static void main(String[] args) {	// main함수는 public class에만 존재
			// 함수 (Function) : '소스 코드에서 특정한 작업을 수행하는 코드의 묶음'
			/*
			 * 		class 내부의 함수를 메서드(Method)라고 한다
			 * 		자바에서는 모든 함수가 class 내부에 속해 있기 때문에
			 * 		(자바는 코드의 기본단위가 class이다)
			 * 		일반적으로, 자바에서는 함수라는 명칭 대신 메서드라고 많이 부른다
			 */
			
			Add(10, 20);	// 함수의 호출  = 30;
							// y = f(X)
			System.out.println(Add(10,20));
//			함수의 호출은 함수의 반환값으로 대체된다
			int result = Add(100, 200);
			System.out.println(result);
			
			System.out.println(Multi(10,20));
			
			
		}

}
