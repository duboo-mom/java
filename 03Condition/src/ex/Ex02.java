package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		int walking = 9000;
		int weight = 50;
				
		// ������ �Ȱ� �����԰� 70kg ���ϸ� ġŲ����
		// ���� �̻��� �ȴ´�. �׸��� && �����԰� 70 ���ϴ�. �׷��� ġŲ �Դ´�.
		
		if(walking >= 10000 && weight <= 70) {
			System.out.println("�׸��� ġŲ ����~");
		}

		// ������ �Ȱų� �����԰� 70���ϸ� ġŲ����
		// ���� �̻��� �ȴ´�. �Ǵ� �����԰� 70 ���ϴ�. �׷��� ġŲ �Դ´�.
		// �Ǵ�: �ڵ尡 �տ����� ����Ǵϱ� walking >= 10000 ���� true�� �ڿ� ���� Ȯ�� ���ϰ� �ٷ� �����
		if(walking >= 10000 || weight <= 70) {
			System.out.println("�Ǵ� ġŲ ����");
		}
		
		// 10 <= number <= 40
		int number = 40;
		if(10 <= number && number <= 40) {
			System.out.println("10�� 40 ������ ���̴�");
		}
		
		// number < 10, number > 40
		if (number < 10 || number > 40) {
			System.out.println("10���� �۰ų� 40���� ũ��");
		}
		
		
		
		
	}

}
