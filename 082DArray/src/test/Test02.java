package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		1. 10 입력하기
//		[2][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.
//		출력
//
//		10 10 10 
//		10 10 10 
		int[][] array1 = new int[2][3];
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				array1[i][j] = 10;
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();


		
//		2. 순서대로 입력하기
//		[3][4] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
//		출력
//
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
		
		int[][] array2 = new int [3][4];
		
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				array2[i][j] = j + 1;
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		3. 배열 별로 입력하기
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 첫 배열은 1, 두번째 배열은 2, 세번째 배열은 3 으로 채우고 출력 하세요.
//		출력
//
//		1 1 1 
//		2 2 2 
//		3 3 3 
		
		int[][] array3 = new int[3][3];
		
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3[i].length; j++) {
				array3[i][j] = i + 1;
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		4. +자 그리기
//		[5][5] 크기의 배열을 만드세요.
//		모든 값을 0으로 초기화 하세요.
//		반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
//		출력
//
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0 
		
		int[][] array4 = new int [5][5];
		for(int i = 0; i < array4.length; i++) {
			for(int j = 0; j < array4[i].length; j++) {
				array4[2][j] = 1;				
			}
			array4[i][2] = 1;
		}
		
		for(int i = 0; i < array4.length; i++) {
			for(int j = 0; j < array4[i].length; j++) {
				System.out.print(array4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		5. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 2 3 
//		4 5 6 
//		7 8 9 
		
		
 		int[][] array5 = new int[3][3];
		int number = 1;
		for(int i = 0; i < array5.length; i++) {
			for(int j = 0; j < array5[i].length; j++) {
//				array5[i][j] = j + 1 + (3 * i) ;
				array5[i][j] = number;
				number++;
			}
		}
		
		// 출력용으로..! 따로 두는게 편한거 같은게 중간중간 값 확인할 수 있으니까?
		
		for(int i = 0; i < array5.length; i++) {
			for(int j = 0; j < array5[i].length; j++) {
				System.out.print(array5[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		6. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 4 7 
//		2 5 8 
//		3 6 9 
		
 		int[][] array6 = new int[3][3];
		int num = 1;
		for(int i = 0; i < array6.length; i++) {
			for(int j = 0; j < array6[i].length; j++) {
				
				// 원래
				// 00 01 02 10 11 12 20 21 22
				// 출력 하고싶은 위치
				// 00 10 20 01 11 21 02 12 22
				
//				array6[i][j] =  i + 1 + (j * 3);
				array6[j][i] = num;
				num++;
			}
			
		}
		
		for(int i = 0; i < array6.length; i++) {
			for(int j = 0; j < array6[i].length; j++) {
				System.out.print(array6[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		

		
//		1. 정수 문자열 변환
//		아래와 같이 생년월일이 저장된 정수 변수가 있다.
//		해당 변수를 아래와 같이 생년월일을 표시하는 문자열로 변환하고 출력하세요.
		int year = 2000;
		int month = 11;
		int day = 15;
//		출력 예시
//
//		20001115
		
		// String yearString = String.valueOf(year);
		String yearString = year + "";
		String monthString = month + "";
		String dayString = day + "";
		
		System.out.println(yearString + monthString + dayString);
		
		System.out.println(year + "" + month + day);
		// 
		
		
//		2. 문자열 정수 변환
//		아래와 같이 생년이 저장된 String 이 있을 때 올해 나이를 출력 하세요 (한국 나이)
		yearString = "1995";
//		출력 예시
//
//		1995년생의 나이는 28살
		
		year = Integer.parseInt(yearString);
		int age = 2022 - year + 1;
		System.out.println(yearString + "년생의 나이는 " + age + "살");
		
		
//		3. 개수 세기
//		아래 배열에 물품 목록이 저장되어 있다.
		String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
//		제품명을 입력받고 해당 제품이 배열에 몇 개 있는지 출력하세요.
//		입력 예시
//
//		제품명 : 육개장
//		출력 예시
//
//		3개
		
		Scanner scan = new Scanner(System.in);
		System.out.print("제품명 : ");
		String subject = scan.next();
		
		int count = 0;
		
		for(int i = 0; i < goods.length; i++) {
			if(goods[i].equals(subject)) {
				count++;				
			}
		}
		System.out.println(count + "개");
		
		
		scan.close();
		
		
		


	}

}
