package day04;

public class Ex01_If {

	public static void main(String[] args) {
		// ��� (Control Statement) : ���α׷��� �帧�̳� �б⸦ �����ϴ� ����
		int num = 10;
		
		if(num > 5) {
			System.out.println(++num);
		}
		else/*if(!(num > 5))*/ {
			System.out.println(--num);
		}
		// ���, ����, 0�� �Ǻ��ϴ� ��
		if(num > 0)
			System.out.println("num�� ���� �����Դϴ�");
		else if(num < 0)
			System.out.println("num�� ���� �����Դϴ�");
		else 
			System.out.println("num�� 0�Դϴ�");
		}
	

	}

