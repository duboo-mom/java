package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 
//		입력 예시
//		제곱값을 구할 숫자를 입력하세요: 5
//		출력 예시
//		5의 제곱은 25이다.
		
//		System.out.print("제곱값을 구할 숫자를 입력하세요: ");
//		int number = scan.nextInt();
//		int result = getSquared(number);
//		System.out.println(number + "의 제곱은 " + result + "이다.");
		
		
		
//		2. 평균 구하기 함수
//		입력 예시
//		점수를 입력하세요: 85 72 65 99
//		출력 예시
//		평균은 80.25
		
//		System.out.print("점수를 입력하세요: ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		System.out.println("평균은 " + getAverage(score1, score2, score3, score4));
				
		
//		3. 몫과 나머지 출력 함수
//
//		입력 예시
//
//		숫자와 나눌 수를 입력하세요: 20 7
//		출력 예시
//
//		몫: 2
//		나머지: 6
		
//		System.out.println("숫자와 나눌 수를 입력하세요: ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		printQuotientRemainder(num1, num2);
		
				
//		4. 홀짝 함수
//		입력 예시
//		숫자를 입력하세요: 6
//		출력 예시
//		0
		
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		
		System.out.println(getOddEven(number));
		
		if(getOddEven(number) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
	}
	
//	정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//	hint ) 함수 원형 - public static int getSquared(int x)
	public static int getSquared(int x) {
		
		int square = x * x;
		
		return square;
	}
	
//	4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//	hint ) 함수 원형 - public static double getAverage(int score1, int score2, int score3, int score4)
	public static double getAverage(int score1, int score2, int score3, int score4) {
		
		double average = (score1 + score2 + score3 + score4) / 4.0;
		
		return average;
	}
	
//	두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//	hint ) 함수 원형 - public static void printQuotientRemainder(int number1, int number2)
	public static void printQuotientRemainder(int number1, int number2) {
		
		System.out.println("몫 : " + (number1 / number2));
		
		System.out.println("나머지 : " + (number1 % number2));
		
	}
	
//	정수를 입력 받아서 짝수면 0 홀수면 1을 돌려 주는 함수를 만드세요.
	public static int getOddEven(int number) {
		
//		if(number % 2 == 0) {
//			return 0;
//		} else {
//			return 1;
//		}
		return number % 2;
		// 굿아이디어.ㅎ..ㅎ.!!
		
	}

	
}
