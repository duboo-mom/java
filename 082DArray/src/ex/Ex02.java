package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// ������ �迭 �� �ֱ�
		int[][] numbers = new int[5][6];
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
//				// ���� �� �ֱ�
//				numbers[i][j] = 5;
//				
//				// ������ �ٸ��� �ֱ�
//				numbers[i][j] = j + 1;
//				
//				// �ະ�� �ٸ��� �ֱ�
//				numbers[i][j] = i + 1;
				
				// Ư�� �ε����� �� �ֱ�
				if(i == 2) {
					numbers[i][j] = 1;
				}
				
				if(j == 4) {
					numbers[i][j] = 1;
				}
				
			}
		}
		
		
		
		
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
