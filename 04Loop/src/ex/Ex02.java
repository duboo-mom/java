package ex;

public class Ex02 {

	public static void main(String[] args) {
		// 횟수 반복
		for(int i =0; i < 5; i++) {
			System.out.println("Hello world!");
		}
		
		// 숫자 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		// 카운트 다운
		// 5 4 3 2 1
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 합구하기
		// 1 ~ 10 합구하기
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println("합 : " + sum);
		
		
		// 몸무게가 70kg 이 될때까지 운동을 계속한다.
		// 몸무게가 70 이상인 동안 운동한다.
		int weight = 73;
		// weight 변수를 사용한다.
		
		for(; weight >= 70; weight -= 2) {
			System.out.println("으쌰으쌰");
		}
		
		// 무한루프
//		for(;;) {
//			System.out.println("무한루프");
//		}
		
		// break
//		int i = 0;
//		while(true) {
//			System.out.println("hello world!!");
//			
//			if(i == 6) {
//				break;
//			}
//			
//			i++;
//		}
		
		
		// continue
		// 4의 배수를 제외한 나머지 수를 출력하라
		// 1 ~ 10
		for(int i = 1; i <= 10; i++) {
			
			if(i % 4 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		
	}

}
