package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 시험점수
		// 저장할 값을 미리 알고 있는 경우
		int[] scores = {90, 95, 100, 85, 92};
		// 값은 준비되어 있지 않지만, 여러값을 저장할 공간이 필요한 경우
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
		
		
		// 점수의 총합 구하기
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
//			System.out.print(scores[i] + " ");
			sum += scores[i];
		}
		System.out.println(sum);
	}

}
