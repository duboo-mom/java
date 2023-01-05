package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		1. 합 구하기
//		수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
//		단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
//		입력 예시
//
//		수를 입력하세요 : 85
//		출력 예시
//
//		105
		
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();
//		System.out.println(sumAll(number));
		
		
//		2. 최소값

//		입력 예시
//
//		5개의 수를 입력하세요 : 4 29 9 398 -4
//		출력 예시
//
//		최소값은 -4
		
		System.out.print("5개의 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		getMinimum(num1, num2, num3, num4, num5);
		
		
		
//		3. 소수(prime) 판별
//		소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
//

//		입력 예시
//
//		수를 입력하세요 : 22
//		출력 예시
//
//		false
		
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(isPrime(num));
		
				
		
	}
	
//	수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
//	단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
	public static int sumAll(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
			if(sum >= 100) {
				break;
			}
		}
		return sum;
	}
	
		
//	5개의 수를 입력 받아서 최소값을 출력하는 함수를 만드세요.(리턴값 없음)
//	입력 가능한 최대값은 1000 입니다.
	public static void getMinimum(int num1, int num2, int num3, int num4, int num5) {
		int min = num1;
		if(min > num2) {
			min = num2;
		}
		if(min > num3) {
			min = num3;
		}
		if(min > num4) {
			min = num4;
		}
		if(min > num5) {
			min = num5;
		}
		System.out.println(min);
	}
	
//	수를 입력 받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
//	소수이면 true, 소수가 아니면 false를 리턴
//	단, 입력하는 수는 2 이상
	
	public static boolean isPrime(int number) {
		for(int i = 2; i <= (number / 2); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
		


