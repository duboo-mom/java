package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		int walking = 9000;
		int weight = 50;
				
		// 만보를 걷고 몸무게가 70kg 이하면 치킨먹자
		// 만보 이상을 걷는다. 그리고 && 몸무게가 70 이하다. 그러면 치킨 먹는다.
		
		if(walking >= 10000 && weight <= 70) {
			System.out.println("그리고 치킨 먹자~");
		}

		// 만보를 걷거나 몸무게가 70이하면 치킨먹자
		// 만보 이상을 걷는다. 또는 몸무게가 70 이하다. 그러면 치킨 먹는다.
		// 또는: 코드가 앞에부터 실행되니까 walking >= 10000 에서 true면 뒤에 조건 확인 안하고 바로 실행됨
		if(walking >= 10000 || weight <= 70) {
			System.out.println("또는 치킨 먹자");
		}
		
		// 10 <= number <= 40
		int number = 40;
		if(10 <= number && number <= 40) {
			System.out.println("10과 40 사이의 값이다");
		}
		
		// number < 10, number > 40
		if (number < 10 || number > 40) {
			System.out.println("10보다 작거나 40보다 크다");
		}
		
		
		
		
	}

}
