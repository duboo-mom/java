package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		1. ���ѷ��� Ż��
//		���� ������ break�� �̿��ؼ� Hello World�� 8�� ��� �ϼ���.
//		��� ����
//
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
		
		for(int i = 0;;i++) {
			System.out.println("Hello World!!");
			
			if(i == 7) {
				break;
			}
		}
		
		
//		2. ¦�� ���
//		continue �� �̿��ؼ� 1~10 ���� �� �߿� ¦���� ��� �ϼ���.
//		��� ����
//
//		2 4 6 8 10 
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 != 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
//		3. ��� ���
//		���� �Է� �ް� continue �� �̿��ؼ� 1~ 100���� ������ ���߿� �Է� ���� ���� ����� ��� �ϼ���
//		�Է� ����
//
//		���� �Է��ϼ��� : 9
//		��� ����
//
//		9 18 27 36 45 54 63 72 81 90 99 
		
		System.out.println("���� �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % number != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		
//		4. ���� �Է�
//		���� ������ ���ؼ� �ݺ������� ���� �Է��� �ް� 0�� �Է� �Ǿ����� �ݺ����� ���� ������ �ϼ���.
//		�Է��� ������ "��"�� ����ϼ���
//		�Է� ����
//
//		���� �Է��ϼ��� : 21
//		���� �Է��ϼ��� : 24
//		���� �Է��ϼ��� : 83
//		���� �Է��ϼ��� : 2
//		���� �Է��ϼ��� : 9
//		���� �Է��ϼ��� : 0
//		��� ����
//
//		��

		for(int i = 1;;i++) {
			System.out.print("���� �Է��ϼ��� : ");
			int num = scan.nextInt();
			
			if (num == 0) {
				break;
			}
		}
		System.out.println("��");
		

	}

}
