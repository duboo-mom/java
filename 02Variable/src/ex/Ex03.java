package ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��ϼ���");
		int noodleCup = scan.nextInt();
		System.out.println("������ ���� : " + noodleCup);
		
		// ���� ���� ���
		int sum = noodleCup * 3;
		System.out.println("������ 3�� ���� : " + sum);
		
		// ������ ���ݰ� ������ �Է� �޾Ƽ� ��� ���
//		System.out.println("������ ������ �Է��ϼ���.");
//		noodleCup = scan.nextInt();
//		System.out.println("������ �Է��ϼ���");
//		int count = scan.nextInt();

		System.out.println("������ ���ݰ� ������ �Է��ϼ���");
		noodleCup = scan.nextInt();
		int count = scan.nextInt();
		// Stream ������ �ΰ� ���� ����ϰ� ����
		sum = noodleCup * count;
		
		System.out.println("������ " + count + "���� ���� : " + sum);
		
		scan.close();
		
	}

}
