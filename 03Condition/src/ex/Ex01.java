package ex;

public class Ex01 {

	public static void main(String[] args) {

		int weight = 77;
		
		// 체중이 75kg 이하이면 치킨을 먹는다.
		if (weight <= 75) {
			System.out.println("치킨먹자~~");					
		}
		
		// 몸무게가 90 초과면 운동해야 겠다.
		if (weight > 90) {
			System.out.println("운동해야겠다");
		}
		
		// 몸무게가 60 이하면 뭐 좀 먹자!
		if (weight <= 60) {
			System.out.println("뭐 좀 먹자");
		}
		
		// 몸무게가 70이면 목표 달성!!
		if (weight == 70) {
			System.out.println("목표 달성!");
		}

		int number1 = 10;
		int number2 = 20;
		
		if(number1 > number2) {
			System.out.println("number1이 더 크다!");
		}
		
		boolean result = number1 > number2;
		System.out.println("비교연산 결과 " + result);
		
		if(result) {
			System.out.println("number1가 더 크다");
		}

	}

}
