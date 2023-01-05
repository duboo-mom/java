package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		int weight = 76;		
		// 몸무게가 70kg 미만 될때까지 운동을 한다.
		// == 몸무게가 70 이상일 동안 운동을 한다.
		
		while(weight >= 70) {
			System.out.println("으쌰으쌰");
			weight -= 2; // weight = weight -2;
		}
		
		// 횟수 반복
		// hello world 5번 출력
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("Hello world");
			i++; // i += 1;  // i = i + 1;
		}
		
		// 1 2 3 4 5 출력
		i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("다음 예제");
		
		// 카운트 다운
		i = 5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		
		// 반복 횟수 제어
		int count = 7;
		i = 0;
		while(i < count) {
			System.out.println(i);
			i++;
		}
		
		// 반복문을 통한 합 구하기
		// 1 ~ 10 합
		
		int sum = 0;
		i = 1;
		while(i <= 10) {
			sum += i; // sum = sum + i;
			i++;
		}
		System.out.println("합 : " + sum);
		
		
		// 무한 반복
		// 무한 루프
		
//		while(true) {
//			System.out.println("와아~~~");
//		}
		
		// 의도치 않은 무한 반복
		i = 0;
		while(i < 5) {
			System.out.println("와아~");
		}
		
		
	}

}
