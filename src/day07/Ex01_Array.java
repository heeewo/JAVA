package day07;

public class Ex01_Array {

	public static void main(String[] args) {

		int num = 10; 				// primitive 자료형의 변수는 직접 데이터를 저장한다
		
		int [] arr = {1,2,3,4};
		int arr2 [] = {11,22,33,44};
		int arr3[/*5*/];			// 자바에서의 []는 변수가 배열을 가리키는 의미만 전달하고
									// 실제 길이값을 작성하지 않는다
		int arr4[] = new int[4];	// 값을 적지 않고, 길이만 지정하여 생성할 경우
		int arr5[] = new int[] {10,20,30,40};
									// 길이 대신, 멤버 값을 작성할 수도 있다
//		int arr6[] = new int[5] {1,2,3,4,5};
									// 두가지 동시는 X
		System.out.println(arr[0]);	// 배열이름[첨자] 의 형식으로 멤버 변수를 가리킬 수 있다
		System.out.println(num);	// 멤버 변수는 일반 변수와 동일하게 취급한다
		
		System.out.println(arr2[2]);
		arr2[2] = 30;
		System.out.println(arr2[2]);
		
		// 배열 전체를 출력하기 : 배열의 인덱스는 항상 [0]부터 시작해서 [길이 - 1]까지 존재한다
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}System.out.println();
		
		arr3 = null;				//*arr3 = 0;
		System.out.println(arr3);
		// arr3는 참조변수(위치만 알려주는)일뿐 배열 그 자체가 아니므로, 바라보는 대상이 얼마든지 바뀔 수 있다
		arr3 = arr2;				// C언어에서는 성립되지 않는다
		
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
