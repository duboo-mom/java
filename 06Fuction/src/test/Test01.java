package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 
//		�Է� ����
//		�������� ���� ���ڸ� �Է��ϼ���: 5
//		��� ����
//		5�� ������ 25�̴�.
		
//		System.out.print("�������� ���� ���ڸ� �Է��ϼ���: ");
//		int number = scan.nextInt();
//		int result = getSquared(number);
//		System.out.println(number + "�� ������ " + result + "�̴�.");
		
		
		
//		2. ��� ���ϱ� �Լ�
//		�Է� ����
//		������ �Է��ϼ���: 85 72 65 99
//		��� ����
//		����� 80.25
		
//		System.out.print("������ �Է��ϼ���: ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		System.out.println("����� " + getAverage(score1, score2, score3, score4));
				
		
//		3. ��� ������ ��� �Լ�
//
//		�Է� ����
//
//		���ڿ� ���� ���� �Է��ϼ���: 20 7
//		��� ����
//
//		��: 2
//		������: 6
		
//		System.out.println("���ڿ� ���� ���� �Է��ϼ���: ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		printQuotientRemainder(num1, num2);
		
				
//		4. Ȧ¦ �Լ�
//		�Է� ����
//		���ڸ� �Է��ϼ���: 6
//		��� ����
//		0
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int number = scan.nextInt();
		
		System.out.println(getOddEven(number));
		
		if(getOddEven(number) == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		
	}
	
//	������ �Է� �޾Ƽ� 2������ ����� �����ִ� �Լ��� ����� ȣ���� ���� ����ϼ���.
//	hint ) �Լ� ���� - public static int getSquared(int x)
	public static int getSquared(int x) {
		
		int square = x * x;
		
		return square;
	}
	
//	4���� ���� �޾Ƽ� ����� �����ִ� �Լ��� ����� ȣ���� ���� ����ϼ���.
//	hint ) �Լ� ���� - public static double getAverage(int score1, int score2, int score3, int score4)
	public static double getAverage(int score1, int score2, int score3, int score4) {
		
		double average = (score1 + score2 + score3 + score4) / 4.0;
		
		return average;
	}
	
//	�� ���� �޾Ƽ� ��� �������� ����ϴ� �Լ��� ���弼��. (���ϰ� ����)
//	hint ) �Լ� ���� - public static void printQuotientRemainder(int number1, int number2)
	public static void printQuotientRemainder(int number1, int number2) {
		
		System.out.println("�� : " + (number1 / number2));
		
		System.out.println("������ : " + (number1 % number2));
		
	}
	
//	������ �Է� �޾Ƽ� ¦���� 0 Ȧ���� 1�� ���� �ִ� �Լ��� ���弼��.
	public static int getOddEven(int number) {
		
//		if(number % 2 == 0) {
//			return 0;
//		} else {
//			return 1;
//		}
		return number % 2;
		// �¾��̵��.��..��.!!
		
	}

	
}
