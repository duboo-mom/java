package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
//		1.�Է� ����
//		���̸� �Է��ϼ��� 
//		24
//		��� ����
//		�̸� : ���α� ���� : 24
		
//		System.out.println("���̸� �Է��ϼ���");
//		int age = scan.nextInt();
//		System.out.println("�̸� : �ȹ��� ���� : " + age);

//		2.�Է� ����
//		�� ���� �Է� �ϼ��� 
//		3 5
//		��� ����
//		3 + 5 = 8
		
//		System.out.println("�� ���� �Է� �ϼ���");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int sum = num1 + num2;
//		System.out.println(num1 + " + " + num2 +" = " + sum);

//		3.�Է� ����
//		�� ���� �Է� �ϼ���
//		3 5
//		��� ����
//		3 - 5 = -2;

//		System.out.println("�� ���� �Է� �ϼ���");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int sub = num1 - num2;
//		System.out.println(num1 + " - " + num2 +" = " + sub);
		
//		4.�Է� ����
//		�ܼ��� �Է� �ϼ��� : 5
//		��� ����
//		5 X 1 = 5
//		5 X 2 = 10
//		5 X 3 = 15
//		5 X 4 = 20
//		5 X 5 = 25

//		System.out.println("�ܼ��� �Է� �ϼ��� : ");
//		int number = scan.nextInt();
//		System.out.println(number + " X 1 = " + number * 1);
//		System.out.println(number + " X 2 = " + number * 2);		
//		System.out.println(number + " X 3 = " + number * 3);
//		System.out.println(number + " X 4 = " + number * 4);
//		System.out.println(number + " X 5 = " + number * 5);

		
//		5. �Է� ����
//		������ �Է��ϼ��� :  24
//		��� ����
//		���� ���̴� 452.16 �Դϴ�.
		
		System.out.print("������ �Է��ϼ��� : ");
		int d = scan.nextInt();
		double half = d / 2.0;
		double pi = 3.14;
		double area = half * half * pi;
		System.out.println("���� ���̴� " + area + " �Դϴ�.");
				
		scan.close();
	}

}
