package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		���� ���ϱ�
//		1 ���� ������ �϶�,
//		1 ~ 7�� ������ ��¥�� �Է� �ް� �ش� ������ ����ϼ���.
//		�Է� ����
//
//		1~7 ������ ��¥�� �Է��ϼ��� : 5
//		��� ����
//
//		�Ͽ���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1~7 ������ ��¥�� �Է��ϼ��� : ");
		int day = scan.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("�����");
			break;
		case 3:
			System.out.println("�ݿ���");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�Ͽ���");
			break;
		case 6:
			System.out.println("������");
			break;
		default:
			System.out.println("ȭ����");
		}
				

		scan.close();
		
	}

}
