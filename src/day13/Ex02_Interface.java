package day13;
/*
 * 	�������̽�  : �߻� Ŭ������ �� ����, �ڹٿ��� �����ϰ� ���� ����� ����ϴ� Ÿ���̴�
 * 	�ڵ��� ����(������ ���� ������)
 * 	�ٸ� �ڷ��� �ٸ� �θ�Ŭ������ �־ �����ټ� ����
 * 
 * 	1. ��ü ������ �Ұ��� (�߻� Ŭ�����̹Ƿ�)
 * 	2. ��� �ʵ�� �ڵ����� static final �Ӽ��� ������
 * 	3. ��� �޼���� public abstract �Ӽ��� ������
 * 	4. �Ϲ� Ŭ������ �����ϱ� ���Ͽ�, �������̽��� ���(����)�ϴ� Ű����� implements �̴�
 */
interface USB{
	// USB ��ġ�� �������ϴ� �ʼ����� �޼��带 ���� �ϱ�
	void react();	// public abstract
}

class USB_Stick extends Object implements USB{	//implements�� ���߻���� �����Ѵ�
	public void react() {						//������ �������̵��� �ؾ��Ѵ� @Override�� ����ǰ� ���ص��ȴ�
		System.out.println("���ο� USB ������ġ �߰�!!");//�������̵� �϶� �� ������ ���� �����ڸ� ���� �ʾƵ� �ȴ�
	}
}
class USB_Cable extends Object implements USB{
	public void react() {
		System.out.println("������...99%");
	}
}
class USB_Fan extends Object implements USB{
	public void react() {
		System.out.println("��������");
	}
}
class PC {
	public static void Connect(USB ob) {	// ���� �ٸ� Ŭ������ �������̽��� ���� �� �ִ�
		ob.react();		// ��� USB�� react() �޼��带 �ݵ�� ������
	}
}
public class Ex02_Interface {
	public static void main(String[] args) {
		USB_Cable ob1 = new USB_Cable();
		USB_Fan ob2 = new USB_Fan();
		USB_Stick ob3 = new USB_Stick();
		
		PC.Connect(ob1);
		PC.Connect(ob2);
		PC.Connect(ob3);
		
//		USB ob4 = new USB(); // �����Ұ�
		USB ob4 = ()->System.out.println("���콺 ���� !!");
		PC.Connect(ob4);
		
		// �ڹ� 1.8���� �Լ��� �������̽��� ���ٽ� ��ü ������ �����ϴ�
		// �ٸ� ���� ���� �ϳ��� �޼��常 ������ �������̽��� �Լ��� �������̽���� �Ѵ�
	}
}
