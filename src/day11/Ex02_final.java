package day11;

class Test {	// Final : ���� ������ �� ���� (���ȭ)
	// Final�� �ʱ�ȭ�� �����ϰ� ���� ������ �� ���� ������, �ݵ�� �ʱⰪ�� �����ؾ� ��
	/* ���� : ���ϴ� ��
	 * ��� : ��'��' ������ �ʴ� '��'
	 * final(���) �ʵ� : �� �� �ʱ�ȭ �Ǹ� ���α׷� ������� �� ���� ����
	 * final�ʵ�� �̸��� ���ʻ� �빮�ڷ� ǥ��
	 */
int a;
static int b;
final int c;	// The blank final field c may not have been initialized
static final int d = 10;	// �ʵ忡 ���� �ʱⰪ
//static final �ʵ� : ������ �ȵǴ� ���� ������ �� �ִ� �ʵ�
private static final Integer e = 123;

Test(int c){
this.c = c;	// �����ڸ� ���ؼ� ���� �Է��� �� �ִ�
}
// Final�� �޼��忡 �ۿ��ϸ�, �޼��带 �������̵�(������)�� �� ������ �����
}
public class Ex02_final {
	public static void main(String[] args) {
		Test ob = new Test(30);
		
		ob.a = 10;	// �ν��Ͻ� �ʵ�� ������ ����
//		ob.b = 20;	// static�� Class�� �����ؾ� �������� ����
		Test.b = 20;
//		ob.c = 30;	// Final�� ���� ������ �� ����
//		ob.d = 40;
//		Test.d = 40;	
		
	}
}
