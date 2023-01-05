package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
//		1.짝수 구하기
//		세개의 수를 입력 받아서 짝수일 때만 그 값을 출력 하세요.
//		입력 예시
//
//		세개의 수를 입력 하세요 : 4 6 9
//		출력 예시
//
//		4는 짝수 입니다. 
//		6은 짝수 입니다.

//		System.out.print("세개의 수를 입력 하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		
//		if(num1 % 2 == 0) {
//			System.out.println(num1 + "은 짝수 입니다.");
//		}
//		if(num2 % 2 == 0) {
//			System.out.println(num2 + "은 짝수 입니다.");
//		}
//		if(num3 % 2 == 0) {
//			System.out.println(num3 + "은 짝수 입니다.");
//		}
		
//		2. BMI 수치를 입력 받아서 비만 판정을 출력하세요.
//
//		bmi 수치	비만도
//		~ 10 이하	정상
//		~ 20 이하	과체중
//		20 ~ 초과	비만
//		입력 예시
//		bmi 수치를 입력 하세요 : 18
//		출력 예시
//		과체중
		
//		System.out.print("bmi 수치를 입력 하세요 : ");
//		int bmi = scan.nextInt();
//		
//		if(bmi <= 10) {
//			System.out.println("정상");
//		} else if(bmi <= 20) {
//			System.out.println("과체중");
//		} else {
//			System.out.println("비만");
//		}
		
//		3. 평균 합격 구하기 
//		두 점수를 입력 받고 , 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.
//		입력 예시
//
//		두 점수를 입력 하세요 : 87 95
//		출력 예시
//
//		합격입니다.
		
//		System.out.print("두 점수를 입력 하세요 : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		double average = (score1 + score2) / 2.0;
//		
//		if(average >= 70) {
//			System.out.println("합격입니다");
//		} else {
//			System.out.println("불합격입니다.");
//		}
		
		
//		4.큰값 구하기
//		세 개의 정수를 입력 받아, 가장 큰값을 출력 하세요.
//		입력 예시
//
//		세 수를 입력 하세요 : 3 8 5
//		출력 예시
//
//		8
		
		System.out.print("세 수를 입력 하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
//		
//		if(num1 > num2) {
//			if(num1 > num3) {
//				System.out.println(num1);
//			} else {
//				System.out.println(num3);
//			}
//		} else {
//			if(num2 > num3) {
//				System.out.println(num2);
//			} else {
//				System.out.println(num3);
//			}
//		}

		// 스앵님이 풀이한 거
//		if(num1 > num2 && num1 > num3) {
//			System.out.println(num1);
//		} else if(num2 > num1 && num2 > num3) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num3);
//		}
		
		// 역도 경기 풀이법
		// 최고 기록을 경신 했는지 판단
		// 예를들어...100 120 110 130 120 140 150
		
		// 최고값 저장할 변수
//		int max = 0;
//		// number1 최고값 이상인지
//		if(num1 > max) {
//			max = num1; // 갱신
//		}
//		
//		if(num2 > max) {
//			max = num2;
//		}
//		
//		if(num3 > max) {
//			max = num3;
//		}
//		System.out.println(max);
				
//		5. 월(month)를 입력 받아서 어떤 계절인지 출력하세요.
//		월	계절
//		3, 4, 5	봄
//		6, 7, 8	여름
//		9, 10, 11	가을
//		12, 1, 2	겨울
//		입력 예시
//		월을 입력 하세요 : 5
//		출력 예시
//		봄
	
//		System.out.print("월을 입력 하세요 : ");
//		int month = scan.nextInt();
//		
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("봄");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여름");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("가을");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("겨울");
//			break;
//		}
//		
		// 뒤에 case 12, 1 2 는 케이스로 안적고 default: 로 해도 오케이
		
		
		scan.close();
	
	}
		
}





