package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		int price = getNoodlesPrice(5);
		
		System.out.println("가격 : " + price);
		
		System.out.println(sum(10, 90));
						
		printHelloWorld();
		
		System.out.println(sumAll(10));
		
		int result = sumAll(35) + 20;
		System.out.println(result);
		
		

	}
	
	// 육개장 개수에 따른 가격계산 기능
	// 이 상태가 함수 원형이라고도 함 -> int getNoodlesPrice(int count)
	public static int getNoodlesPrice(int count) {
		
		int result = 900 * count;
		
		return result;
	}
	
	// 두 수를 전달 받아서 더하는 기능
	// long = int보다 더 큰 범위의 수를 담는 타입
	public static long sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 입력값과 돌려주는 값이 없는 함수
	// Hello World를 세번 출력하는 함수
	public static void printHelloWorld() {
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
	}
	
	// 1부터 전달받은 까지의 합을 구하는 함수
	public static int sumAll(int number) {
		// 1 부터 number 까지의 합 구하기
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	
	
	
}
