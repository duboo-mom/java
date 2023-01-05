package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 육개장 가격은 900원 이다.
		int noodleCup = 900;
		System.out.println(noodleCup);
		
		// 육개장 가격 : 900원
		System.out.println("육개장 가격 : " + noodleCup + "원");
		
		// 줄바꿈
		System.out.println("안녕하세요\n좀 졸리네용");
		// "안녕"
		System.out.println("\"안녕\"");
		
		// 연산자
		// 육개장 3개의 가격
		int sum = noodleCup * 3;
		
		System.out.println("육개장 3개의 가격 : " + sum);
		
		// 가격 상승
		noodleCup = noodleCup + 50;
		System.out.println("새로운 육개장 3개의 가격 : " + (noodleCup * 3));
		
		// 5000원으로 최대 몇개의 육개장을 살 수 있는지?
		int money = 5000;
		int count = money / noodleCup;
		System.out.println("개수 : " + count);
		// 잔돈?
		// 5000을 950으로 나눈 나머지
		int change = money % noodleCup;
		System.out.println("잔돈 : " + change);
		
		
	}

}
