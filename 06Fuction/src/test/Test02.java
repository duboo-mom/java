package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		1. �� ���ϱ�
//		���� �Է� �޾Ƽ� 1���� ���� �� �� ������ ���� ���ϴ� �Լ��� ���弼��.
//		��, ���� 100�� ������ ���� �ߴ��ϰ� �� �� ������ ���� �����ϼ���.
//		�Է� ����
//
//		���� �Է��ϼ��� : 85
//		��� ����
//
//		105
		
//		System.out.print("���� �Է��ϼ��� : ");
//		int number = scan.nextInt();
//		System.out.println(sumAll(number));
		
		
//		2. �ּҰ�

//		�Է� ����
//
//		5���� ���� �Է��ϼ��� : 4 29 9 398 -4
//		��� ����
//
//		�ּҰ��� -4
		
		System.out.print("5���� ���� �Է��ϼ��� : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		getMinimum(num1, num2, num3, num4, num5);
		
		
		
//		3. �Ҽ�(prime) �Ǻ�
//		�Ҽ�: 1�� �ڱ��ڽ� �̿ܿ� ������ �������� �ʴ� ���̴�.
//

//		�Է� ����
//
//		���� �Է��ϼ��� : 22
//		��� ����
//
//		false
		
		System.out.print("���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println(isPrime(num));
		
				
		
	}
	
//	���� �Է� �޾Ƽ� 1���� ���� �� �� ������ ���� ���ϴ� �Լ��� ���弼��.
//	��, ���� 100�� ������ ���� �ߴ��ϰ� �� �� ������ ���� �����ϼ���.
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
	
		
//	5���� ���� �Է� �޾Ƽ� �ּҰ��� ����ϴ� �Լ��� ���弼��.(���ϰ� ����)
//	�Է� ������ �ִ밪�� 1000 �Դϴ�.
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
	
//	���� �Է� �ް� �� ���� �Ҽ�(prime)���� �ƴ��� �����ϴ� �Լ��� ����� ȣ���ϼ���.
//	�Ҽ��̸� true, �Ҽ��� �ƴϸ� false�� ����
//	��, �Է��ϴ� ���� 2 �̻�
	
	public static boolean isPrime(int number) {
		for(int i = 2; i <= (number / 2); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
		


