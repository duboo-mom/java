package test;

public class Test01 {

	public static void main(String[] args) {
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
//		1. �л� �� ��� ���ϱ�
//		�� �л��� ����� ���� ���ؼ� ����ϼ���.
//		���
//
//		1��° �л��� ��� : 89.9
//		2��° �л��� ��� : 84.8
//		3��° �л��� ��� : 94.2
//		4��° �л��� ��� : 78.3
//		5��° �л��� ��� : 54.8
		
//		for(int i = 0; i < scores.length; i++) {
//			
//			int sum = 0;
//			for(int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];				
//			}
//			
//			double average = (double) sum / scores[0].length;
//			System.out.println((i + 1) + "��° �л��� ��� : " + average);
//			
//		}
		
		
//		2. �л� �� �ְ��� ���ϱ�
//		�� �л��� �ְ� ������ ���ؼ� ����ϼ���.
//		���
//
//		1��° �л��� �ְ��� : 93
//		2��° �л��� �ְ��� : 98
//		3��° �л��� �ְ��� : 98
//		4��° �л��� �ְ��� : 100
//		5��° �л��� �ְ��� : 67
		
//		for(int i = 0; i < scores.length; i++) {
//			
//			int max = scores[i][0];
//			for(int j = 0; j < scores[i].length; j++) {
//				if(max < scores[i][j]) {
//					max = scores[i][j];
//				}
//			}
//			System.out.println((i + 1) + "��° �л��� �ְ��� : " + max);			
//		}
//		System.out.println();
		
//		3. ��� �ְ��� ���ϱ�
//		����� ���� ���� �л��� ��������� �� ��° �л����� ����ϼ���.
//		����� �Ҽ��� ù° �ڸ� ������ ��� �ϼ���.
//		���
//
//		����� ���� ���� �л� : 3��° �л�
//		��� : 94.2
		
//		int sumScores[] = new int[scores.length];
//		
//		for(int i = 0; i < scores.length; i++) {
//			
//			int sum = 0;			
//			for(int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];
//			}
//			sumScores[i] = sum;			
//		}
//		
//		int max = sumScores[0];
//		for(int i = 1; i < sumScores.length; i++) {
//			
//			if(max < sumScores[i]) {
//				max = sumScores[i];
//				System.out.println("����� ���� ���� �л�" + (i + 1) + "��° �л�");
//			}
//			
//		}
//		double average = (double)max / scores[0].length;
//		System.out.println("��� : " + average);

		// ���޴� Ǯ��
		
		double maxAverage = 0;
		int maxIndex = 0;
		for(int i = 0; i < scores.length; i++) {
		
			int sum = 0;			
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			
			double average = sum / (double)scores[i].length;
			if(maxAverage < average) {
				maxAverage = average;
				maxIndex = i + 1;
			}
		}
		System.out.println("����� ���� ���� �л�" + maxIndex + "��° �л�");
		System.out.println("�ְ��� ��� : " + maxAverage);
		System.out.println();
		
		
		
//		4. Ư�� ���� �ְ���
//		index 4 ������ �ְ� ������ �л��� �� ��° �л����� ����ϼ���.
//		���
//
//		4��° ������ �ְ� �����ڴ� 3��° �л�
//		���� : 97
		
//		int max = scores[0][4];
//		for(int i = 0; i < scores.length; i++) {
//			if(max < scores[i][4]) {
//				max = scores[i][4];
//				System.out.println("5��° ������ �ְ� �����ڴ� " + (i + 1) + "��° �л�" );
//				System.out.println("���� : " + scores[i][4]);
//			}
//		}
		
		// ���޴� Ǯ��
		
		int maxScore = scores[0][4];
		maxIndex = 0;
		for(int i = 0; i < scores.length; i++) {
			if(maxScore < scores[i][4]) {
				maxScore = scores[i][4];
				maxIndex = i;
			}
		}
		System.out.println("5��° ������ �ְ� �����ڴ� " + (maxIndex + 1) + "��° �л�" );
		System.out.println("���� : " + maxScore);
		System.out.println();
		
		
//		5. �Ϻ� ��� �ְ���
//		������� index 3 ~ 7 �� ����� ���� ���� �л��� index�� ���Ͽ� ����ϼ���.
//		���
//
//		����� ���� ���� �л� :  3�� index
//		��� : 93.8
		
//		int sumScores[] = new int[scores.length];
//		for(int i = 0; i < scores.length; i++) {
//			
//			int sum = 0;			
//			for(int j = 3; j < 7; j++) {
//				sum += scores[i][j];
//			}
//			sumScores[i] = sum;			
//		}
//		
//		int max = sumScores[0];
//		for(int i = 1; i < sumScores.length; i++) {
//			if(max < sumScores[i]) {
//				max = sumScores[i];
//				System.out.println("����� ���� ���� �л�" + i + "��° �л�");
//			}
//		}
//		double average = (double)max / scores[0].length;
//		System.out.println("��� : " + average);
		
		
		maxAverage = 0;
		maxIndex = 0;
		for(int i = 0; i < scores.length; i++) {
			
			int sum = 0;			
			for(int j = 3; j < 8; j++) {
				sum += scores[i][j];
			}
			
			double average = sum / 5.0;
			if(maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
			
		}
		System.out.println("��� ���� ���� �л� : " + maxIndex);
		System.out.println("��� : " + maxAverage);
		
		

	}

}
