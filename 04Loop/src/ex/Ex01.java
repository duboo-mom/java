package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		int weight = 76;		
		// �����԰� 70kg �̸� �ɶ����� ��� �Ѵ�.
		// == �����԰� 70 �̻��� ���� ��� �Ѵ�.
		
		while(weight >= 70) {
			System.out.println("���X���X");
			weight -= 2; // weight = weight -2;
		}
		
		// Ƚ�� �ݺ�
		// hello world 5�� ���
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("Hello world");
			i++; // i += 1;  // i = i + 1;
		}
		
		// 1 2 3 4 5 ���
		i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("���� ����");
		
		// ī��Ʈ �ٿ�
		i = 5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		
		// �ݺ� Ƚ�� ����
		int count = 7;
		i = 0;
		while(i < count) {
			System.out.println(i);
			i++;
		}
		
		// �ݺ����� ���� �� ���ϱ�
		// 1 ~ 10 ��
		
		int sum = 0;
		i = 1;
		while(i <= 10) {
			sum += i; // sum = sum + i;
			i++;
		}
		System.out.println("�� : " + sum);
		
		
		// ���� �ݺ�
		// ���� ����
		
//		while(true) {
//			System.out.println("�;�~~~");
//		}
		
		// �ǵ�ġ ���� ���� �ݺ�
		i = 0;
		while(i < 5) {
			System.out.println("�;�~");
		}
		
		
	}

}
