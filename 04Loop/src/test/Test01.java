package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		1. 반복 출력
//		수를 입력 받아서 그 수만큼 "응 아니야" 를 출력하세요
//		입력 예시
//
//		횟수를 입력하세요 : 5
//		출력 예시
//
//		응 아니야
//		응 아니야
//		응 아니야
//		응 아니야
//		응 아니야
//				
		System.out.println("횟수를 입력하세요 : ");
		int count = scan.nextInt();
		int i = 0;
		while(i < count) {
			System.out.println("응 아니야");
			i++;
		}
//	
//		2. 카운트 다운 "발사"
//		수를 입력 받고 그 수에서 부터 0 까지 한 줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.
//		입력 예시
//
//		카운트 다운 입력하세요 : 3
//		출력 예시
//
//		3
//		2
//		1
//		0
//		발사
		
		System.out.println("카운트 다운 입력하세요 : ");
		i = scan.nextInt();
				
		while(i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("발사");
		
		// 스앵님 풀이
//		int count = scan.nextInt();
//		i = count;
		// 이렇게 i에다가 대입하는 형태..!
		
		
//		3. 짝수 합 구하기
//		수를 입력 받고 1에서 부터 입력한 수까지의 짝수의 합을 구하여 출력하세요.
//		입력 예시
//
//		수를 입력하세요 : 12
//		출력 예시
//
//		더한 결과 : 42
		
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();
//		 i = 2;
//		int sum = 0;
//		
		// 스앵님 풀이
//		while(i <= number) {
//			sum += i;
//			i += 2;
//		}
//		System.out.println("더한 결과 : " + sum);
//		
		
		
		// 스앵님 풀이
//		System.out.println("수를 입력하세용: ");
//		int number = scan.nextInt();
//		
//		i = 1;
//		
//		int sum = 0;
//		while(i <= number) {
//			// 1 2 3 4 5 중에 짝수만 골라서 더할거니까
//			if(i % 2 == 0) {
//				sum = sum + i;
//			}
//			i++;
//		}
//		
//		System.out.println("합: sum");
		
		
//		4. 구구단
//		구구단 2단을 출력하세요
//		출력 예시
//
//		2 X 1 = 2
//		2 X 2 = 4
//		2 X 3 = 6
//		2 X 4 = 8
//		2 X 5 = 10
//		2 X 6 = 12
//		2 X 7 = 14
//		2 X 8 = 16
//		2 X 9 = 18
		
//		System.out.print("구구단 단수 입력 : ");
//		int num = scan.nextInt();
//		i = 1;
//		
//		while(i < 10) {
//			System.out.println(num + " X " + i + " = " + (num * i));
//			i++;
//		}

		
//		5. 반복 입력
//		while을 이용하여 5번 동안 수를 입력 받고 출력하세요.
//		입출력 예시
//
//		입력 : 4
//		출력 : 4
//		입력 : 5
//		출력 : 5
//		입력 : 6
//		출력 : 6
//		입력 : 7
//		출력 : 7
//		입력 : 8
//		출력 : 8
		
		i = 0;
		while(i < 5) {
			System.out.print("입력 : ");
			int input = scan.nextInt();
			System.out.println("출력 : " + input);
			i++;
		}
		
		
		
		
		
		scan.close();

	}

}
