package test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
//		1. ���� ���� �հ� ����
//		���� �� ���� �Է� �ް� �հ� ���θ� ��� �϶�
//		����� 60�� �̻��̸� "�հ�"
//		�� �����̶� 50�� ���ϸ� ������ "����"
//		����� 60�� �̸��̸� "���հ�"
//
//		�Է� ����
//
//		����1 : 95
//		����2 : 48
//		��� ����
//
//		����
		
//		System.out.print("����1 : ");
//		int score1 = scan.nextInt();
//		System.out.print("����2 : ");
//		int score2 = scan.nextInt();
//		
//		double average = (score1 + score2) / 2.0;
////		System.out.println(average);
//		
//		if(score1 <= 50 || score2 <= 50) {
//			System.out.println("����");
//		} else if(average >= 60) {
//			System.out.println("�հ�");
//		} else {
//			System.out.println("���հ�");
//		}
//			
		
		
//		2. ���� ���ϱ�
//		������ �Է� �޾Ƽ� �������� ����Ͻÿ�
//		���� ����
//		4�� ������ �������� ������ �����̴�.
//		100���� ������ �������� ������ ������ �ƴϴ�.
//		400���� ������ �������� ������ �����̴�.
//		�Է� ����
//		���� : 2020
//		��� ����
//		����
		
		System.out.println("���� : ");
		int year = scan.nextInt();
//		
		// �� Ǯ��
//		if(year % 4 ==0) {
//			if(year % 100 == 0 && year % 400 != 0) {
//				System.out.println("���� �ƴ�");
//			} else {
//				System.out.println("����");
//			}
//		}else {
//			System.out.println("���� �ƴ�");
//		}
		
		// ���޴� Ǯ��1
//		if(year % 4 == 0) {
//			if(year % 100 == 0) {
//				if(year % 400 == 0) {
//					System.out.println("����");
//				}else {
//					System.out.println("���");
//				}
//			}else {
//				System.out.println("����");
//			}
//		}else {
//			System.out.println("���");
//		}
		// ���޴� Ǯ�� 2 - ���� ����ó��..! ���� �ִ� ���� ���� ���� �ɰ� Ǯ��
//		if(year % 400 == 0) {
//			System.out.println("����");
//		} else if(year % 100 == 0) {
//			System.out.println("���");
//		} else if(year % 4 == 0) {
//			System.out.println("����");
//		} else {
//			System.out.println("���");
//		}
		
		// ���޴� Ǯ�� 3 - ���� �ƴϸ� ��� �̴ϱ�!! if, else �ΰ��θ� ������ �ִٴ� ��
		// 4�� ������ �������� ���� �߿� 100���� ������ �������� �ʴ� ������ ����
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
		
		
		
//		3. ���� ���� �� ����
//		ö���� ���� ����(1), ����(2), ��(3) ������ �����Ҷ�, ���ӿ��� �̱� ����� ����ϼ���
//		������ ������������ ���ڷ� ���� �Է� �ް� �״����� ö���� ������������ ���ڷ� �Է� �޴´�.
//		�Է� ����
//
//		���� ���� : 2
//		ö�� ���� : 3
//		��� ����
//
//		ö���� �̰��
//		
//		System.out.print("���� ���� : ");
//		int younghee = scan.nextInt();
//		System.out.print("ö�� ���� : ");
//		int cheolsu = scan.nextInt();
//		
//		if(younghee == 1) {
//			if(cheolsu == 3) {
//				System.out.println("���� �̰��");
//			}else if(cheolsu == 2) {
//				System.out.println("ö���� �̰��");
//			}else {
//				System.out.println("����");
//			}
//		}else if(younghee == 2) {
//			if(cheolsu == 3) {
//				System.out.println("ö���� �̰��");
//			}else if(cheolsu == 2) {
//				System.out.println("����");
//			}else {
//				System.out.println("���� �̰��.");
//			}
//		}else {
//			if(cheolsu == 3) {
//				System.out.println("����.");
//			}else if(cheolsu == 2) {
//				System.out.println("���� �̰��.");
//			}else {
//				System.out.println("ö���� �̰��.");
//			}
//		}
		
		//���޴� Ǯ��
//		System.out.print("���� ���� : ");
//		int player1 = scan.nextInt();
//		System.out.print("ö�� ���� : ");
//		int player2 = scan.nextInt();
//		
//		if(player1 == player2) {
//			System.out.println("����");
//		} else if((player2 == 1 && player1 == 3) || (player2 == 2 && player1 == 1) || (player2 ==3 && player2 ==2) ) {
//			System.out.println("ö���� �̰��.");
//		} else {
//			System.out.println("���� �̰��.");
//		}
//		
//		
//		4. 45����
//		�ð�(hour)�� ��(min)�� �־��� ��, �ش� �ð����� 45������ �ð��� ����Ͽ� ����ϼ���
//		�ð��� 24�ð� ǥ������� ����Ѵ�
//		�Է� ����
//		�ð� �� �Է� : 4 30
//		��� ����
//		3�� 45��

//		System.out.println("�ð� �� �Է� : ");
//		int hour = scan.nextInt();
//		int minute = scan.nextInt();
//		
//		minute = (hour * 60) + minute;
//		
//		minute = minute - 45;
//		hour = minute / 60;
//		minute = minute % 60;
//	
//		if(minute < 0) {
//			hour = hour + 23;
//			minute = minute + 60;
//		}
//		System.out.println(hour + "�� " + minute + "��");
		
		//���޴� Ǯ��
//		System.out.println("�ð� �� �Է� : ");
//		int hour = scan.nextInt();
//		int minute = scan.nextInt();
//		
//		minute = (hour * 60) + minute;
//		minute = minute - 45;
//		//0�� ������ ���
//		if(minute < 0) {
//			minute = (24 * 60) + minute;
//		}
//		hour = minute / 60;
//		minute = minute % 60;
//		System.out.println(hour + "�� " + minute + "��");
//		
//		5.������
//		4���� �� ���°� �ԷµǸ� ��, ��, ��, ��, �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���� ���°� 0�̸� ������ ���� ���� ����, 1�̸� �������� ���¸� �ǹ��Ѵ�.
//		�����̴� 4���� ���� �̿��ϴ� �����̴�.
//		�� : 1���� �������� ����
//		�� : 2���� �������� ����
//		�� : 3���� �������� ����
//		�� : 4���� �������� ����
//		�� : �ϳ��� ���������� ���� ����
//		�Է� ����
//		�� ���¸� �Է��ϼ��� : 0 1 1 1
//		��� ����
//		��
		
//		System.out.print("�� ���¸� �Է��ϼ��� : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		
//		int sum = num1 + num2 + num3 + num4;
//		
//		switch(sum) {
//		case 0:
//			System.out.println("��");
//			break;
//		case 1:
//			System.out.println("��");
//			break;
//		case 2:
//			System.out.println("��");
//			break;
//		case 3:
//			System.out.println("��");
//			break;
//		case 4:
//			System.out.println("��");
//		}
//		
//		scan.close();
//		
	}

}
