package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. �� ���ϱ�
//		���� �Է� �޾Ƽ� 1���� �Է� ���� �������� ���� ����ϼ���.
//		�Է� ����
//
//		���� �Է� �ϼ��� : 45
//		��� ����
//
//		�� : 1035
		
//		System.out.print("���� �Է� �ϼ��� : ");
//		int lastnum = scan.nextInt();
//		int sum = 0;
//		
//		for(int i = 1; i <= lastnum; i++) {
//			sum += i;
//		}
//		System.out.println("�� : " + sum);
		
//		2. �հ� ��� ���ϱ�
//		�ݺ������� 5���� ���� �Է� �޾Ƽ� ���հ� ����� ����ϼ���.
//		�Է� ����
//
//		1 ��° ���� �Է� �ϼ��� : 
//		3
//		2 ��° ���� �Է� �ϼ��� : 
//		59
//		3 ��° ���� �Է� �ϼ��� : 
//		43
//		4 ��° ���� �Է� �ϼ��� : 
//		20
//		5 ��° ���� �Է� �ϼ��� : 
//		659
//		��� ����
//
//		���� : 784 ��� : 156.8
		
//		int sum = 0;
//		double average = 0;
//		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i + "��° ���� �Է� �ϼ��� : ");
//			int number = scan.nextInt();
//			
//			sum += number;
//			average = (double)sum / i;
//		}
//		System.out.println("���� : " + sum + " ��� : " + average);
		
		
//		3. ���丮��
//		���丮���� 1���� �� �������� ��� ���� ���̰� �Ʒ��� ���� ǥ���ȴ�.
//		5! = 1 * 2 * 3 * 4 * 5
//		7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//
//		���� �Է� �ް� �� ���� ���丮���� ����ϼ���.
//		�Է� �޴� ���� �ִ밪�� 10�̴�.
//		�Է� ����
//
//		���� �Է� �ϼ��� : 8
//		��� ����
//
//		8! = 40320
		
//		System.out.println("���� �Է� �ϼ��� : ");
//		int num = scan.nextInt();
//		int multi = 1;
//		
//		for(int i = 1; i <= num; i++) {
//			multi *= i;
//		}
//		System.out.println(num + "! = " + multi);

		
//		4. �ּҰ�
//		�ݺ������� 5���� ���� �Է� �޾Ƽ� �ּ� ���� ����ϼ���.
//		�Է°��� �ִ� ���� 1000 �Դϴ�.
//		�Է� ����
//
//		1 ��° ���� �Է� �ϼ��� : 
//		4
//		2 ��° ���� �Է� �ϼ��� : 
//		29
//		3 ��° ���� �Է� �ϼ��� : 
//		9
//		4 ��° ���� �Է� �ϼ��� : 
//		398
//		5 ��° ���� �Է� �ϼ��� : 
//		-4
//		��� ����
//
//		�ּҰ��� -4�Դϴ�.
		
//		int temp = 0;
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i + " ��° ���� �Է��ϼ��� : ");
//			int num = scan.nextInt();
//			
//			if(num < temp) {
//				temp = num;
//			}
//		}
//		System.out.println("�ּҰ��� " + temp + "�Դϴ�.");
//		
				
		
//		5. ��� ���ϱ�
//		���� �Է� �޾Ƽ� �� ���� ����� ��� ����ϼ���.
//		�Է� ����
//
//		���� �Է� �ϼ��� : 24
//		��� ����
//
//		1 2 3 4 6 8 12 24
		
		
		System.out.print("���� �Է� �ϼ��� : ");
		int number = scan.nextInt();
		
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
