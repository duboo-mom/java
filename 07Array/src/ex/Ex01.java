package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// ��������
		// ������ ���� �̸� �˰� �ִ� ���
		int[] scores = {90, 95, 100, 85, 92};
		// ���� �غ�Ǿ� ���� ������, �������� ������ ������ �ʿ��� ���
		int[] numbers = new int[10];
		
		System.out.println(scores[2]);
		System.out.println(scores[0]);
		System.out.println(scores[3]);
//		System.out.println(scores[5]);
		
		scores[3] = 94;
		System.out.println(scores[3]);

		int index = 2;
		System.out.println(scores[index]);
		System.out.println(scores[index + 1]);
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		System.out.println(scores.length);
		
		
		// ������ ���� ���ϱ�
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
//			System.out.print(scores[i] + " ");
			sum += scores[i];
		}
		System.out.println(sum);
	}

}
