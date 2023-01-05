package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 입력 예시
//		입력1 : 5
//		입력2 : 9
//		출력 예시
//		덧셈 : 14
//		뺄셈 : -4
//		곱셈 : 45
//		나눗셈 : 0
				
//		System.out.print("입력1 : ");
//		int num1 = scan.nextInt();
//		System.out.print("입력2 : ");
//		int num2 = scan.nextInt();
//		System.out.println("덧셈 : " + (num1 + num2));
//		System.out.println("뺄셈 : " + (num1 - num2));
//		System.out.println("곱셈 : " + (num1 * num2));
//		System.out.println("나눗셈 : " + (num1 / num2));
		
		
//		2.입력 예시
//		입력1 : 843
//		입력2 : 8
//		출력 예시
//		몫 : 105 나머지 : 3
		
//		System.out.print("입력1 : ");
//		int num1 = scan.nextInt();
//		System.out.print("입력2 : ");
//		int num2 = scan.nextInt();
//		System.out.println("몫 : " + (num1 / num2) + " 나머지 : " + (num1 % num2));
		
		
//		3.입력 예시
//		길이 : 43
//		출력 예시
//		정사각형의 넓이 : 1849
		
//		System.out.print("길이 : ");
//		int length = scan.nextInt();
//		System.out.println("정사각형의 넓이 : " + (length * length));

		
//		4.입력 예시
//		밑변 : 13
//		높이 : 9
//		출력 예시
//		삼각형의 넓이 : 58.5
		
//		System.out.print("밑변 : ");
//		int width = scan.nextInt();
//		System.out.print("높이 : ");
//		int height = scan.nextInt();
//		
//		double area = width * height / 2.0;
//		System.out.println("삼각형의 넓이 : " + area);
		
//		5.입력 예시
//		x : 6
//		y : 4
//		출력 예시
//		x : 4 y : 6
		
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("y : ");
		int y = scan.nextInt();
		
		//swap 알고리즘
		int temp = x;
		x = y;
		y = temp;		
						
		System.out.println("x: " + x + " y : " + y);

		
//		6.입력 예시
//		초 : 464
//		출력 예시
//		7분 44초
		
//		System.out.print("초 : ");
//		int sec = scan.nextInt();
//		int min = sec / 60;
//		sec = sec % 60;
//		
//		System.out.println(min + "분 " + sec + "초");
		
		scan.close();
	}

}
