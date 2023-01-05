package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
//		1.입력 예시
//		나이를 입력하세요 
//		24
//		출력 예시
//		이름 : 김인규 나이 : 24
		
//		System.out.println("나이를 입력하세요");
//		int age = scan.nextInt();
//		System.out.println("이름 : 안미정 나이 : " + age);

//		2.입력 예시
//		두 수를 입력 하세요 
//		3 5
//		출력 예시
//		3 + 5 = 8
		
//		System.out.println("두 수를 입력 하세요");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int sum = num1 + num2;
//		System.out.println(num1 + " + " + num2 +" = " + sum);

//		3.입력 예시
//		두 수를 입력 하세요
//		3 5
//		출력 예시
//		3 - 5 = -2;

//		System.out.println("두 수를 입력 하세요");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int sub = num1 - num2;
//		System.out.println(num1 + " - " + num2 +" = " + sub);
		
//		4.입력 예시
//		단수를 입력 하세요 : 5
//		출력 예시
//		5 X 1 = 5
//		5 X 2 = 10
//		5 X 3 = 15
//		5 X 4 = 20
//		5 X 5 = 25

//		System.out.println("단수를 입력 하세요 : ");
//		int number = scan.nextInt();
//		System.out.println(number + " X 1 = " + number * 1);
//		System.out.println(number + " X 2 = " + number * 2);		
//		System.out.println(number + " X 3 = " + number * 3);
//		System.out.println(number + " X 4 = " + number * 4);
//		System.out.println(number + " X 5 = " + number * 5);

		
//		5. 입력 예시
//		지름을 입력하세요 :  24
//		출력 예시
//		원의 넓이는 452.16 입니다.
		
		System.out.print("지름을 입력하세요 : ");
		int d = scan.nextInt();
		double half = d / 2.0;
		double pi = 3.14;
		double area = half * half * pi;
		System.out.println("원의 넓이는 " + area + " 입니다.");
				
		scan.close();
	}

}
