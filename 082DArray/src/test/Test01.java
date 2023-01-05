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
		
//		1. 학생 별 평균 구하기
//		각 학생의 평균을 각각 구해서 출력하세요.
//		출력
//
//		1번째 학생의 평균 : 89.9
//		2번째 학생의 평균 : 84.8
//		3번째 학생의 평균 : 94.2
//		4번째 학생의 평균 : 78.3
//		5번째 학생의 평균 : 54.8
		
//		for(int i = 0; i < scores.length; i++) {
//			
//			int sum = 0;
//			for(int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];				
//			}
//			
//			double average = (double) sum / scores[0].length;
//			System.out.println((i + 1) + "번째 학생의 평균 : " + average);
//			
//		}
		
		
//		2. 학생 별 최고점 구하기
//		각 학생의 최고 점수를 구해서 출력하세요.
//		출력
//
//		1번째 학생의 최고점 : 93
//		2번째 학생의 최고점 : 98
//		3번째 학생의 최고점 : 98
//		4번째 학생의 최고점 : 100
//		5번째 학생의 최고점 : 67
		
//		for(int i = 0; i < scores.length; i++) {
//			
//			int max = scores[i][0];
//			for(int j = 0; j < scores[i].length; j++) {
//				if(max < scores[i][j]) {
//					max = scores[i][j];
//				}
//			}
//			System.out.println((i + 1) + "번째 학생의 최고점 : " + max);			
//		}
//		System.out.println();
		
//		3. 평균 최고점 구하기
//		평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
//		평균은 소수점 첫째 자리 까지만 출력 하세요.
//		출력
//
//		평균이 가장 높은 학생 : 3번째 학생
//		평균 : 94.2
		
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
//				System.out.println("평균이 가장 높은 학생" + (i + 1) + "번째 학생");
//			}
//			
//		}
//		double average = (double)max / scores[0].length;
//		System.out.println("평균 : " + average);

		// 스앵님 풀이
		
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
		System.out.println("평균이 가장 높은 학생" + maxIndex + "번째 학생");
		System.out.println("최고점 평균 : " + maxAverage);
		System.out.println();
		
		
		
//		4. 특정 과목 최고점
//		index 4 과목의 최고 성적의 학생이 몇 번째 학생인지 출력하세요.
//		출력
//
//		4번째 과목의 최고 성적자는 3번째 학생
//		점수 : 97
		
//		int max = scores[0][4];
//		for(int i = 0; i < scores.length; i++) {
//			if(max < scores[i][4]) {
//				max = scores[i][4];
//				System.out.println("5번째 과목의 최고 성적자는 " + (i + 1) + "번째 학생" );
//				System.out.println("점수 : " + scores[i][4]);
//			}
//		}
		
		// 스앵님 풀이
		
		int maxScore = scores[0][4];
		maxIndex = 0;
		for(int i = 0; i < scores.length; i++) {
			if(maxScore < scores[i][4]) {
				maxScore = scores[i][4];
				maxIndex = i;
			}
		}
		System.out.println("5번째 과목의 최고 성적자는 " + (maxIndex + 1) + "번째 학생" );
		System.out.println("점수 : " + maxScore);
		System.out.println();
		
		
//		5. 일부 평균 최고점
//		시험과목 index 3 ~ 7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//		출력
//
//		평균이 가장 높은 학생 :  3번 index
//		평균 : 93.8
		
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
//				System.out.println("평균이 가장 높은 학생" + i + "번째 학생");
//			}
//		}
//		double average = (double)max / scores[0].length;
//		System.out.println("평균 : " + average);
		
		
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
		System.out.println("평균 가장 높은 학생 : " + maxIndex);
		System.out.println("평균 : " + maxAverage);
		
		

	}

}
