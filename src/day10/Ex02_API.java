package day10;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

class Phone {
	private String model, company;
	private int price;
	private static double promotion; //ÇÒÀÎÀ²
	private String [] arr = new String[] {"SAMSUNG", "APPLE", "LG", "HWAWAY"};
	private boolean match = true;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		/* c¾ğ¾îorPython¿¡¼­´Â ASCIIÄÚµå·Î ¿µ¾îÀÎÁö ¾Æ´ÑÁö, ¼Ò¹®ÀÚ, ´ë¹®ÀÚÀÎÁö±îÁö´Â ±¸ºĞ°¡´É
		 * Á¤±ÔÇ¥Çö½Ä : ^, [], a-z, A-z, 0-9, ¤¡-¤¾, °¡-ÆR, * &
		 * ^ : ½ÃÀÛ~
		 * & : ~Á¾·á
		 * [] : ¹üÀ§  >> [abc]Áß ÇÑ±ÛÀÚ
		 * ? : ¾øÀ½ ¶Ç´Â ÇÑ±ÛÀÚ
		 * * : ¾øÀ½ ¶Ç´Â ¿©·¯±ÛÀÚ
		 */
		if(Pattern.matches("^[0-9A-z]*$", model))
		this.model = model;
		else
			System.err.println("¸ğµ¨¸íÀº ¿µ¹®°ú ¼ıÀÚ·Î¸¸ °¡´ÉÇÕ´Ï´Ù.");
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		for(int i = 0 ; i < arr.length; i++) {
			//gb´Â ³Ñ¾î°¡¾ßµÇ¿ä
			//toUpperCase() : ¹®ÀÚ¿­À» ´ë¹®ÀÚ·Î º¯È¯
			//indexOF("Ã£À» ¹®ÀÚ¿­") : Ã£À» ¹®ÀÚ¿­ÀÇ ÀÎµ¦½º¹øÈ£¸¦ ¹İÈ¯, ¸ø Ã£À¸¸é -1À» ¹İÈ¯
		if(company.toUpperCase().indexOf(arr[i]) == -1)
			match = false;
		else {  match = true; break;}
		}
		if (match)
			this.company = company;
		else System.err.println("È¸»ç°¡ Àß¸ø µÇ¾ú½À´Ï´Ù");
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 2000000)
			System.err.println("±İ¾×Àº 200¸¸¿øÀ» ³ÑÀ» ¼ö ¾ø¾î¿ä");
		else
		this.price = price;
	}
	public static double getPromotion() {
		return promotion;
	}
	public static void setPromotion(double promotion) {
		if(promotion > 20.0)
			System.err.println("ÇÒÀÎÀ²Àº 20%¸¦ ÃÊ°úÇÒ ¼ö ¾ø¾î¿ä");
		else
		Phone.promotion = promotion;
	}
	
	public void info() {
		System.out.println("È¸»ç : " + company);
		System.out.println("¸ğµ¨¸í : " + model);
		DecimalFormat df = new DecimalFormat("#,###");
		String priceDF = df.format(price);
		System.out.println("Á¤°¡ : " + priceDF);
		System.out.println("ÇÒÀÎ°¡ : " + df.format(price-price*promotion/100));
		
	}
	
}

public class Ex02_API {
	public static void main(String[] args) {
		//ÀÌ¹ø´ŞÀÇ ¸ğµç ÇÚµåÆùÀº 10%ÇÒÀÎ
		
		//ÇÒÀÎÀ²Àº 20.0%¸¦ ³ÑÁö¸øÇØ
		//
		Phone.setPromotion(20.5); 	//¿¡·¯ ¹ß»ı
		Phone.setPromotion(10.0);
		
		Phone hp1 = new Phone();
		hp1.setCompany("Sam");
		hp1.setCompany("Samsung");	//¾Æ¹« Á¦¾à¾øÀ½
		
		//¸ğµ¨¸í(¿µ¹® + ¼ıÀÚ¸¸ °¡´ÉÇÏµµ·Ï)
		hp1.setModel("¾Æ¸®¶û");		//¿¡·¯ ¹ß»ı
		hp1.setModel("galexyS8");
		
		//°¡°İ(À½¼öÀÌ°Å³ª 200¸¸¿øÀ» ÃÊ°úÇÒ ¼ö ¾ø´Ù.) => Ãµ ´ÜÀ§±¸ºĞ±âÈ£°¡ ºÙµµ·Ï
		hp1.setPrice(999999999);
		hp1.setPrice(1200000);
		
		hp1.info();
		
		/*
		 *  ÇÒÀÎÀ²Àº 20%¸¦ ÃÊ°úÇÒ ¼ö ¾ø¾î¿ä
		 * 	¸ğµ¨¸íÀº ¿µ¹®°ú ¼ıÀÚ·Î¸¸ °¡´ÉÇÕ´Ï´Ù.
		 *  ±İ¾×Àº 200¸¸¿øÀ» ³ÑÀ» ¼ö ¾ø¾î¿ä
		 *  
		 *  È¸»ç : samsung
		 *  ¸ğµ¨¸í : galexyS8
		 *  Á¤°¡ : 1,200,000
		 *  ÇÒÀÎ°¡ : 108,000
		 */
		
	}
}
