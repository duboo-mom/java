package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. �Է� ����
//		�Է�1 : 5
//		�Է�2 : 9
//		��� ����
//		���� : 14
//		���� : -4
//		���� : 45
//		������ : 0
				
//		System.out.print("�Է�1 : ");
//		int num1 = scan.nextInt();
//		System.out.print("�Է�2 : ");
//		int num2 = scan.nextInt();
//		System.out.println("���� : " + (num1 + num2));
//		System.out.println("���� : " + (num1 - num2));
//		System.out.println("���� : " + (num1 * num2));
//		System.out.println("������ : " + (num1 / num2));
		
		
//		2.�Է� ����
//		�Է�1 : 843
//		�Է�2 : 8
//		��� ����
//		�� : 105 ������ : 3
		
//		System.out.print("�Է�1 : ");
//		int num1 = scan.nextInt();
//		System.out.print("�Է�2 : ");
//		int num2 = scan.nextInt();
//		System.out.println("�� : " + (num1 / num2) + " ������ : " + (num1 % num2));
		
		
//		3.�Է� ����
//		���� : 43
//		��� ����
//		���簢���� ���� : 1849
		
//		System.out.print("���� : ");
//		int length = scan.nextInt();
//		System.out.println("���簢���� ���� : " + (length * length));

		
//		4.�Է� ����
//		�غ� : 13
//		���� : 9
//		��� ����
//		�ﰢ���� ���� : 58.5
		
//		System.out.print("�غ� : ");
//		int width = scan.nextInt();
//		System.out.print("���� : ");
//		int height = scan.nextInt();
//		
//		double area = width * height / 2.0;
//		System.out.println("�ﰢ���� ���� : " + area);
		
//		5.�Է� ����
//		x : 6
//		y : 4
//		��� ����
//		x : 4 y : 6
		
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("y : ");
		int y = scan.nextInt();
		
		//swap �˰���
		int temp = x;
		x = y;
		y = temp;		
						
		System.out.println("x: " + x + " y : " + y);

		
//		6.�Է� ����
//		�� : 464
//		��� ����
//		7�� 44��
		
//		System.out.print("�� : ");
//		int sec = scan.nextInt();
//		int min = sec / 60;
//		sec = sec % 60;
//		
//		System.out.println(min + "�� " + sec + "��");
		
		scan.close();
	}

}
