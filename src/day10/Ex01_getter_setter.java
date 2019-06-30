package day10;

class Car {
	//���� �ʵ带 private���� ���� ����
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
			System.out.println("�߸��� �����Է��Դϴ�.");
	}
 }
public class Ex01_getter_setter {
	public static void main(String[] args) {
		Car car1 = new Car("������", "EŬ����", 8000);
		
		//�ʵ忡 setter�� getter�� ���ؼ� �����մϴ�.
		//�߸��� �����Ͱ� ������� �ʰ� �Ϸ���
		car1.setOwnerName("������");
		System.out.println(car1.getOwnerName());
		car1.setPrice(-500);
		car1.setPrice(7000);
		System.out.println(car1.getPrice());
		
		Car car2 = new Car("������", "SŬ����", 6000);
		car2.setPrice(-4500);
	}

}
