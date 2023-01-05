package test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
//		1. 과락 포함 합격 여부
//		점수 두 개를 입력 받고 합격 여부를 출력 하라
//		평균이 60점 이상이면 "합격"
//		한 과목이라도 50점 이하면 무조건 "과락"
//		평균이 60점 미만이면 "불합격"
//
//		입력 예시
//
//		점수1 : 95
//		점수2 : 48
//		출력 예시
//
//		과락
		
//		System.out.print("점수1 : ");
//		int score1 = scan.nextInt();
//		System.out.print("점수2 : ");
//		int score2 = scan.nextInt();
//		
//		double average = (score1 + score2) / 2.0;
////		System.out.println(average);
//		
//		if(score1 <= 50 || score2 <= 50) {
//			System.out.println("과락");
//		} else if(average >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//			
		
		
//		2. 윤년 구하기
//		연도를 입력 받아서 윤년인지 출력하시오
//		윤년 조건
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 윤년이다.
//		입력 예시
//		연도 : 2020
//		출력 예시
//		윤년
		
		System.out.println("연도 : ");
		int year = scan.nextInt();
//		
		// 내 풀이
//		if(year % 4 ==0) {
//			if(year % 100 == 0 && year % 400 != 0) {
//				System.out.println("윤년 아님");
//			} else {
//				System.out.println("윤년");
//			}
//		}else {
//			System.out.println("윤년 아님");
//		}
		
		// 스앵님 풀이1
//		if(year % 4 == 0) {
//			if(year % 100 == 0) {
//				if(year % 400 == 0) {
//					System.out.println("윤년");
//				}else {
//					System.out.println("평년");
//				}
//			}else {
//				System.out.println("윤년");
//			}
//		}else {
//			System.out.println("평년");
//		}
		// 스앵님 풀이 2 - 과락 문제처럼..! 관련 있는 문장 먼저 조건 걸고 풀기
//		if(year % 400 == 0) {
//			System.out.println("윤년");
//		} else if(year % 100 == 0) {
//			System.out.println("평년");
//		} else if(year % 4 == 0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
		
		// 스앵님 풀이 3 - 윤년 아니면 평년 이니까!! if, else 두개로만 나눌수 있다는 것
		// 4로 나누어 떨어지는 연도 중에 100으로 나누어 떨어지지 않는 연도는 윤년
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		
		
//		3. 가위 바위 보 게임
//		철수와 영희가 가위(1), 바위(2), 보(3) 게임을 진행할때, 게임에서 이긴 사람을 출력하세요
//		영희의 가위바위보를 숫자로 먼저 입력 받고 그다음에 철수의 가위바위보를 숫자로 입력 받는다.
//		입력 예시
//
//		영희 공격 : 2
//		철수 공격 : 3
//		출력 예시
//
//		철수가 이겼다
//		
//		System.out.print("영희 공격 : ");
//		int younghee = scan.nextInt();
//		System.out.print("철수 공격 : ");
//		int cheolsu = scan.nextInt();
//		
//		if(younghee == 1) {
//			if(cheolsu == 3) {
//				System.out.println("영희가 이겼다");
//			}else if(cheolsu == 2) {
//				System.out.println("철수가 이겼다");
//			}else {
//				System.out.println("비겼다");
//			}
//		}else if(younghee == 2) {
//			if(cheolsu == 3) {
//				System.out.println("철수가 이겼다");
//			}else if(cheolsu == 2) {
//				System.out.println("비겼다");
//			}else {
//				System.out.println("영희가 이겼다.");
//			}
//		}else {
//			if(cheolsu == 3) {
//				System.out.println("비겼다.");
//			}else if(cheolsu == 2) {
//				System.out.println("영희가 이겼다.");
//			}else {
//				System.out.println("철수가 이겼다.");
//			}
//		}
		
		//스앵님 풀이
//		System.out.print("영희 공격 : ");
//		int player1 = scan.nextInt();
//		System.out.print("철수 공격 : ");
//		int player2 = scan.nextInt();
//		
//		if(player1 == player2) {
//			System.out.println("비겼다");
//		} else if((player2 == 1 && player1 == 3) || (player2 == 2 && player1 == 1) || (player2 ==3 && player2 ==2) ) {
//			System.out.println("철수가 이겼다.");
//		} else {
//			System.out.println("영희가 이겼다.");
//		}
//		
//		
//		4. 45분전
//		시간(hour)과 분(min)이 주어질 때, 해당 시간보다 45분전의 시간을 계산하여 출력하세요
//		시간은 24시간 표현방법을 사용한다
//		입력 예시
//		시간 분 입력 : 4 30
//		출력 예시
//		3시 45분

//		System.out.println("시간 분 입력 : ");
//		int hour = scan.nextInt();
//		int minute = scan.nextInt();
//		
//		minute = (hour * 60) + minute;
//		
//		minute = minute - 45;
//		hour = minute / 60;
//		minute = minute % 60;
//	
//		if(minute < 0) {
//			hour = hour + 23;
//			minute = minute + 60;
//		}
//		System.out.println(hour + "시 " + minute + "분");
		
		//스앵님 풀이
//		System.out.println("시간 분 입력 : ");
//		int hour = scan.nextInt();
//		int minute = scan.nextInt();
//		
//		minute = (hour * 60) + minute;
//		minute = minute - 45;
//		//0시 이전일 경우
//		if(minute < 0) {
//			minute = (24 * 60) + minute;
//		}
//		hour = minute / 60;
//		minute = minute % 60;
//		System.out.println(hour + "시 " + minute + "분");
//		
//		5.윷놀이
//		4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
//		윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
//		윷놀이는 4개의 윷을 이용하는 게임이다.
//		도 : 1개가 뒤집어진 상태
//		개 : 2개가 뒤집어진 상태
//		걸 : 3개가 뒤집어진 상태
//		윷 : 4개가 뒤집어진 상태
//		모 : 하나도 뒤집어지지 않은 상태
//		입력 예시
//		윷 상태를 입력하세요 : 0 1 1 1
//		출력 예시
//		걸
		
//		System.out.print("윷 상태를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		
//		int sum = num1 + num2 + num3 + num4;
//		
//		switch(sum) {
//		case 0:
//			System.out.println("모");
//			break;
//		case 1:
//			System.out.println("도");
//			break;
//		case 2:
//			System.out.println("개");
//			break;
//		case 3:
//			System.out.println("걸");
//			break;
//		case 4:
//			System.out.println("윷");
//		}
//		
//		scan.close();
//		
	}

}
