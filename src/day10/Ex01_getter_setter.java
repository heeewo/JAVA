package day10;

class Car {
	//보통 필드를 private으로 많이 선언
	private String ownerName;
	private String carName;
	private int price;
	
	Car(String ownerName, String carName, int price){
		this.ownerName = ownerName;
		this.carName = carName;
		this.price = price;

	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price >= 0)
		this.price = price;
		else 
			System.out.println("잘못된 가격입력입니다.");
	}
 }
public class Ex01_getter_setter {
	public static void main(String[] args) {
		Car car1 = new Car("이지은", "E클래스", 8000);
		
		//필드에 setter와 getter를 통해서 접근합니다.
		//잘못된 데이터가 저장되지 않게 하려고
		car1.setOwnerName("이지금");
		System.out.println(car1.getOwnerName());
		car1.setPrice(-500);
		car1.setPrice(7000);
		System.out.println(car1.getPrice());
		
		Car car2 = new Car("이지동", "S클래스", 6000);
		car2.setPrice(-4500);
	}

}
