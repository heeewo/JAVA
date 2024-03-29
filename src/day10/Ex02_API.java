package day10;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

class Phone {
	private String model, company;
	private int price;
	private static double promotion; //할인율
	private String [] arr = new String[] {"SAMSUNG", "APPLE", "LG", "HWAWAY"};
	private boolean match = true;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		/* c언어orPython에서는 ASCII코드로 영어인지 아닌지, 소문자, 대문자인지까지는 구분가능
		 * 정규표현식 : ^, [], a-z, A-z, 0-9, ㄱ-ㅎ, 가-힣, * &
		 * ^ : 시작~
		 * & : ~종료
		 * [] : 범위  >> [abc]중 한글자
		 * ? : 없음 또는 한글자
		 * * : 없음 또는 여러글자
		 */
		if(Pattern.matches("^[0-9A-z]*$", model))
		this.model = model;
		else
			System.err.println("모델명은 영문과 숫자로만 가능합니다.");
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		for(int i = 0 ; i < arr.length; i++) {
			//gb는 넘어가야되요
			//toUpperCase() : 문자열을 대문자로 변환
			//indexOF("찾을 문자열") : 찾을 문자열의 인덱스번호를 반환, 못 찾으면 -1을 반환
		if(company.toUpperCase().indexOf(arr[i]) == -1)
			match = false;
		else {  match = true; break;}
		}
		if (match)
			this.company = company;
		else System.err.println("회사가 잘못 되었습니다");
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 2000000)
			System.err.println("금액은 200만원을 넘을 수 없어요");
		else
		this.price = price;
	}
	public static double getPromotion() {
		return promotion;
	}
	public static void setPromotion(double promotion) {
		if(promotion > 20.0)
			System.err.println("할인율은 20%를 초과할 수 없어요");
		else
		Phone.promotion = promotion;
	}
	
	public void info() {
		System.out.println("회사 : " + company);
		System.out.println("모델명 : " + model);
		DecimalFormat df = new DecimalFormat("#,###");
		String priceDF = df.format(price);
		System.out.println("정가 : " + priceDF);
		System.out.println("할인가 : " + df.format(price-price*promotion/100));
		
	}
	
}

public class Ex02_API {
	public static void main(String[] args) {
		//이번달의 모든 핸드폰은 10%할인
		
		//할인율은 20.0%를 넘지못해
		//
		Phone.setPromotion(20.5); 	//에러 발생
		Phone.setPromotion(10.0);
		
		Phone hp1 = new Phone();
		hp1.setCompany("Sam");
		hp1.setCompany("Samsung");	//아무 제약없음
		
		//모델명(영문 + 숫자만 가능하도록)
		hp1.setModel("아리랑");		//에러 발생
		hp1.setModel("galexyS8");
		
		//가격(음수이거나 200만원을 초과할 수 없다.) => 천 단위구분기호가 붙도록
		hp1.setPrice(999999999);
		hp1.setPrice(1200000);
		
		hp1.info();
		
		/*
		 *  할인율은 20%를 초과할 수 없어요
		 * 	모델명은 영문과 숫자로만 가능합니다.
		 *  금액은 200만원을 넘을 수 없어요
		 *  
		 *  회사 : samsung
		 *  모델명 : galexyS8
		 *  정가 : 1,200,000
		 *  할인가 : 108,000
		 */
		
	}
}
