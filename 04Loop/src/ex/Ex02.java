package ex;

public class Ex02 {

	public static void main(String[] args) {
		// Ƚ�� �ݺ�
		for(int i =0; i < 5; i++) {
			System.out.println("Hello world!");
		}
		
		// ���� ���
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		// ī��Ʈ �ٿ�
		// 5 4 3 2 1
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// �ձ��ϱ�
		// 1 ~ 10 �ձ��ϱ�
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println("�� : " + sum);
		
		
		// �����԰� 70kg �� �ɶ����� ��� ����Ѵ�.
		// �����԰� 70 �̻��� ���� ��Ѵ�.
		int weight = 73;
		// weight ������ ����Ѵ�.
		
		for(; weight >= 70; weight -= 2) {
			System.out.println("���X���X");
		}
		
		// ���ѷ���
//		for(;;) {
//			System.out.println("���ѷ���");
//		}
		
		// break
//		int i = 0;
//		while(true) {
//			System.out.println("hello world!!");
//			
//			if(i == 6) {
//				break;
//			}
//			
//			i++;
//		}
		
		
		// continue
		// 4�� ����� ������ ������ ���� ����϶�
		// 1 ~ 10
		for(int i = 1; i <= 10; i++) {
			
			if(i % 4 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		
	}

}
