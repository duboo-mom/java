package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
//		1.¦�� ���ϱ�
//		������ ���� �Է� �޾Ƽ� ¦���� ���� �� ���� ��� �ϼ���.
//		�Է� ����
//
//		������ ���� �Է� �ϼ��� : 4 6 9
//		��� ����
//
//		4�� ¦�� �Դϴ�. 
//		6�� ¦�� �Դϴ�.

//		System.out.print("������ ���� �Է� �ϼ��� : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		
//		if(num1 % 2 == 0) {
//			System.out.println(num1 + "�� ¦�� �Դϴ�.");
//		}
//		if(num2 % 2 == 0) {
//			System.out.println(num2 + "�� ¦�� �Դϴ�.");
//		}
//		if(num3 % 2 == 0) {
//			System.out.println(num3 + "�� ¦�� �Դϴ�.");
//		}
		
//		2. BMI ��ġ�� �Է� �޾Ƽ� �� ������ ����ϼ���.
//
//		bmi ��ġ	�񸸵�
//		~ 10 ����	����
//		~ 20 ����	��ü��
//		20 ~ �ʰ�	��
//		�Է� ����
//		bmi ��ġ�� �Է� �ϼ��� : 18
//		��� ����
//		��ü��
		
//		System.out.print("bmi ��ġ�� �Է� �ϼ��� : ");
//		int bmi = scan.nextInt();
//		
//		if(bmi <= 10) {
//			System.out.println("����");
//		} else if(bmi <= 20) {
//			System.out.println("��ü��");
//		} else {
//			System.out.println("��");
//		}
		
//		3. ��� �հ� ���ϱ� 
//		�� ������ �Է� �ް� , ����� 70�� �̻��̸� �հ� �׷��� ������ ���հ��� ����ϼ���.
//		�Է� ����
//
//		�� ������ �Է� �ϼ��� : 87 95
//		��� ����
//
//		�հ��Դϴ�.
		
//		System.out.print("�� ������ �Է� �ϼ��� : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		double average = (score1 + score2) / 2.0;
//		
//		if(average >= 70) {
//			System.out.println("�հ��Դϴ�");
//		} else {
//			System.out.println("���հ��Դϴ�.");
//		}
		
		
//		4.ū�� ���ϱ�
//		�� ���� ������ �Է� �޾�, ���� ū���� ��� �ϼ���.
//		�Է� ����
//
//		�� ���� �Է� �ϼ��� : 3 8 5
//		��� ����
//
//		8
		
		System.out.print("�� ���� �Է� �ϼ��� : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
//		
//		if(num1 > num2) {
//			if(num1 > num3) {
//				System.out.println(num1);
//			} else {
//				System.out.println(num3);
//			}
//		} else {
//			if(num2 > num3) {
//				System.out.println(num2);
//			} else {
//				System.out.println(num3);
//			}
//		}

		// ���޴��� Ǯ���� ��
//		if(num1 > num2 && num1 > num3) {
//			System.out.println(num1);
//		} else if(num2 > num1 && num2 > num3) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num3);
//		}
		
		// ���� ��� Ǯ�̹�
		// �ְ� ����� ��� �ߴ��� �Ǵ�
		// �������...100 120 110 130 120 140 150
		
		// �ְ� ������ ����
//		int max = 0;
//		// number1 �ְ� �̻�����
//		if(num1 > max) {
//			max = num1; // ����
//		}
//		
//		if(num2 > max) {
//			max = num2;
//		}
//		
//		if(num3 > max) {
//			max = num3;
//		}
//		System.out.println(max);
				
//		5. ��(month)�� �Է� �޾Ƽ� � �������� ����ϼ���.
//		��	����
//		3, 4, 5	��
//		6, 7, 8	����
//		9, 10, 11	����
//		12, 1, 2	�ܿ�
//		�Է� ����
//		���� �Է� �ϼ��� : 5
//		��� ����
//		��
	
//		System.out.print("���� �Է� �ϼ��� : ");
//		int month = scan.nextInt();
//		
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("��");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("����");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("����");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("�ܿ�");
//			break;
//		}
//		
		// �ڿ� case 12, 1 2 �� ���̽��� ������ default: �� �ص� ������
		
		
		scan.close();
	
	}
		
}





