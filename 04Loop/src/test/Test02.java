package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		1. �ݺ� ���
//		35 ~ 40 ���� ��� �ϼ���
//		��� ����
//
//		35 36 37 38 39 40 

		for(int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
				
		
//		2. �ݺ� ���
//		5 ~ -5 ���� ����ϼ���
//		��� ����
//
//		5 4 3 2 1 0 -1 -2 -3 -4 -5 
		
		for(int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
//		3. Ư�� ���� ���ϱ�
//		1 ~ 50 ���̿� 3�� ����� ����ϼ���.
//		��� ����
//
//		3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 
		
//		for(int i = 1; i <= 50; i++) {
//			
//			if(i % 3 == 0) {
//				System.out.print(i + " ");				
//			}
//		}
//		System.out.println();

		// �̷��� �ݺ� Ƚ�� ��ü�� ���� �ϴ°͵� ���� �����!! ����� �����ϴϱ�
		for(int i = 3; i <= 50; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		4. ���� ����
//		1 ~ 100 ���̿� 7�� ��� ������ ���ϼ���.
//		��� ����
//
//		7�� ����� ������ : 14
		
		int count = 0;
//		for(int i = 1; i <= 100; i++) {
//			
//			if(i % 7 == 0) {
//				count++;
//			}
//		}
		
//		�׷� �굵 ���� ����ó�� 
		for(int i = 7; i <= 100; i += 7) {
			count++;
		}
		
		System.out.println("7�� ����� ������ : " + count);
		
		
		
//		5. ������
//		���� �Է� �޾Ƽ� �ش��ϴ� �ܼ��� �������� ��� �ϼ���.
//		�Է� ����
//
//		�ܼ��� �Է��ϼ��� : 8
//		��� ����
//
//		8 X 1 = 8
//		8 X 2 = 16
//		8 X 3 = 24
//		8 X 4 = 32
//		8 X 5 = 40
//		8 X 6 = 48
//		8 X 7 = 56
//		8 X 8 = 64
//		8 X 9 = 72
				
		System.out.print("�ܼ��� �Է��ϼ��� : ");
		int number = scan.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
		System.out.println();
//		
		
//		6. ���� ū ��
//		for�� �̿��ؼ� 5���� ���� �Է� �ް� ���� ū���� ����ϼ���
//		�Է� ����
//
//		���� �Է��ϼ��� : 5
//		���� �Է��ϼ��� : 78
//		���� �Է��ϼ��� : 3
//		���� �Է��ϼ��� : 7
//		���� �Է��ϼ��� : 3
//		��� ����
//
//		���� ū �� : 78
		
		// ������ ���� �Էµ�..! ó�� �Է°��� ������ temp�� �ѹ� �ְ� ����
		System.out.println("���� �Է��ϼ��� : ");
		int temp = scan.nextInt();
		for(int i = 1; i <= 4; i++) {
			System.out.print("���� �Է��ϼ��� : ");
			int num = scan.nextInt();
			
			if(num > temp) {
				temp = num;
			}
		}
		System.out.println("���� ū �� : " + temp);
		
		
		scan.close();

	}

}
