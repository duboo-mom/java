package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 5���� �л��� 3�� ����
		int[][] scores = {
				{90, 100, 95}, 
				{100, 85, 90}, 
				{75, 60, 70}, 
				{80, 75, 80}, 
				{100, 95, 90}
				};
		
		System.out.println("�ι�° �л��� ����° ���� : " + scores[1][2]);
		System.out.println("�׹�° �л��� �ι�° ���� : " + scores[3][1]);
		System.out.println("����° �л��� ����° ���� : " + scores[2][2]);
		
		for(int i = 0; i < scores.length; i++) {
			// �迭 �ϳ��� ����
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		// �л��� ���� �հ�
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			
			System.out.println("�հ� : " + sum);
			
		}
		
		
		
	}

}
