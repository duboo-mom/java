package quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 입력 예시
//		입력
//		1234
		
//		System.out.println("입력");
//		int fullNumber = scan.nextInt();

//		int thousand = fullNumber / 1000;
//		int hundred = (fullNumber /100) - (thousand * 10);
//		int ten = (fullNumber / 10) - (thousand * 100) - (hundred * 10);
//		int num = fullNumber - (thousand * 1000) - (hundred * 100) - (ten * 10);
		
//		int number = scan.nextInt();
//		System.out.println(number / 1000);
//		number = number % 1000;
//		System.out.println(number / 100);
//		number = number % 100;
//		System.out.println(number / 10);
//		System.out.println(number % 10);
		// 이게 훨씬 짧고 효율적인걸까..?? 내가 짠거는 하나 숫자 받아서 다 돌릴수 있는데!!!
		
//		출력 예시
//		1
//		2
//		3
//		4

		//출력 예시
		
//		4
//		3
//		2
//		1
		System.out.println("입력");
		int number = scan.nextInt();
		
		System.out.println(number % 10);
		number = number / 10;
		System.out.println(number % 10);
		number = number / 10;
		System.out.println(number % 10);
		System.out.println(number / 10);
		
		
//		System.out.println(num);
//		System.out.println(ten);
//		System.out.println(hundred);
//		System.out.println(thousand);
	}

}
