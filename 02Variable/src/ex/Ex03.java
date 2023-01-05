package ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("육개장 가격을 입력하세요");
		int noodleCup = scan.nextInt();
		System.out.println("육개장 가격 : " + noodleCup);
		
		// 세개 가격 계산
		int sum = noodleCup * 3;
		System.out.println("육개장 3개 가격 : " + sum);
		
		// 육개장 가격과 개수를 입력 받아서 결과 출력
//		System.out.println("육개장 가격을 입력하세요.");
//		noodleCup = scan.nextInt();
//		System.out.println("개수를 입력하세요");
//		int count = scan.nextInt();

		System.out.println("육개장 가격과 개수를 입력하세요");
		noodleCup = scan.nextInt();
		int count = scan.nextInt();
		// Stream 공간에 두개 같이 대기하고 있음
		sum = noodleCup * count;
		
		System.out.println("육개장 " + count + "개의 가격 : " + sum);
		
		scan.close();
		
	}

}
