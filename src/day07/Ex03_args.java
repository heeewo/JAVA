package day07;

public class Ex03_args {

	public static void main(String[] args) {
		/*
		 *  C:\> java Ex03_args			// �ܼ� ����
		 *  
		 *  C:\> java Ex03_args /h		// /h��� ���ڿ��� �Ű������� �����Լ��� ����
		 *  
		 *  C:\> java Ex03_args --help	// --help ��� ���ڿ��� �Ű������� �����Լ��� ����
		 */
		
		// int main(int argc, char ** argv) { //�Ű����� ī��Ʈ, ���ڿ��� �迭�� �޾���
		
		System.out.println("args test !!");
		System.out.println("args.length : " + args.length);
		for(int i=0; i < args.length; i++) {
			System.out.printf("args[%d] : %s\n", i, args[i]);
		}
		
		if(args.length > 0) {
			if(args[0].equals("/a")) {
				System.out.println("�Ű������� �ĺ��߽��ϴ�");
				System.out.println("/a �ɼ��� ���޹޾Ƽ� �´� ������ ����մϴ�");
			}
			switch(args[0]) {
			case "naver":		// java day08.Ex04_args naver
				// �� �������� ���ؼ� ����Ʈ�� ȣ���ϴ� �ڵ�
				break;
			case "daum":		// java day08.Ex04_args naver
				// �� �������� ���ؼ� ����Ʈ�� ȣ���ϴ� �ڵ�
				break;
			}
		}
	}

}
