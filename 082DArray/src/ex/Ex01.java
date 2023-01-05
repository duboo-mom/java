package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 5명의 학생의 3개 성적
		int[][] scores = {
				{90, 100, 95}, 
				{100, 85, 90}, 
				{75, 60, 70}, 
				{80, 75, 80}, 
				{100, 95, 90}
				};
		
		System.out.println("두번째 학생의 세번째 점수 : " + scores[1][2]);
		System.out.println("네번째 학생의 두번째 점수 : " + scores[3][1]);
		System.out.println("세번째 학생의 세번째 점수 : " + scores[2][2]);
		
		for(int i = 0; i < scores.length; i++) {
			// 배열 하나를 관리
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		// 학생별 점수 합계
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			
			System.out.println("합계 : " + sum);
			
		}
		
		
		
	}

}
