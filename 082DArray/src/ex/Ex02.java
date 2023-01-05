package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// 이차원 배열 값 넣기
		int[][] numbers = new int[5][6];
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
//				// 같은 값 넣기
//				numbers[i][j] = 5;
//				
//				// 열별로 다른값 넣기
//				numbers[i][j] = j + 1;
//				
//				// 행별로 다른값 넣기
//				numbers[i][j] = i + 1;
				
				// 특정 인덱스만 값 넣기
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
