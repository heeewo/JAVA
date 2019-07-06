package day12;

class Empty extends Object{
	// �ƹ� ���뵵 ����
	// .toString()	: Ŭ������ ���ǳ� �ֿ� ������ ���ڿ��� ��ȯ�Ѵ�
	// .equals()	: ��ü�� �Ű������� ���� �������� ���Ͽ� true/false�� ��ȯ�Ѵ�
}

class Super /* extends Object */{
	Super(String field1){
		System.out.println("�θ� Ŭ���� ������ ȣ�� !!");
		this.field1 = field1;
	}
	String field1;
	
	public final void Func() {
		System.out.println("�� �޼���� �������̵� �� �� �����ϴ� !!");
	}
	public void Func2() {
		System.out.println("�� �޼���� �θ�Ŭ������ �޼����Դϴ� !!");
	}
	
}
class Sub extends Super {
	Sub(String field1, String field2){	// ��ӹ��� �ʵ�� ���� �ʵ忡 ���� �ʱ�ȭ�� �Ϸ���
		super(field1);				// �θ�Ŭ������ �����ڸ� ȣ���ϱ����� super()
//		this.field1 = field1;
		super.field1 = field1;
		this.filed2 = field2;		// �ڽ�Ŭ������ �ʵ�� �ڽ��� ���� ó��
		System.out.println("�ڽ� Ŭ���� ������ ȣ�� !!");
	}
	String filed2;
	
	@Override
	public String toString() {
		return "���� �������̵��� �޼���";
		// �θ�Ŭ������ ������ ������ ��ӹ��� �ڽ�Ŭ�������� �����Ӱ� �� ���ǰ� �����ϴ�
	}
	
//	@Override
//	public void Func() {}
	// Cannot override the final method from Super
	// �θ�Ŭ������ final �޼���� �������̵� �� �� �����ϴ�
	@Override
	public void Func2() { System.out.println("�� Ŭ������ �ڽ�Ŭ������ �޼����Դϴ� !!"); }
}
public class Ex02_Super {
	public static void main(String[] args) {
		Sub ob1 = new Sub("�ʵ�1", "�ʵ�2");
		ob1.field1 = "�θ�Ŭ������ �ʵ�";
		System.out.println(ob1.field1 + ", " + ob1.filed2);
		System.out.println(ob1.toString());
		
		Empty ob2 = new Empty();
		
		System.out.println(ob2.toString());
		System.out.println(ob2.hashCode());
		System.out.println(ob2.equals("A"));
		System.out.println(ob2.getClass());
		System.out.println(ob2.getClass().getSimpleName());
		
		ob1.Func();
		ob1.Func2();
		
	}
}
