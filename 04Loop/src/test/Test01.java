package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		1. �ݺ� ���
//		���� �Է� �޾Ƽ� �� ����ŭ "�� �ƴϾ�" �� ����ϼ���
//		�Է� ����
//
//		Ƚ���� �Է��ϼ��� : 5
//		��� ����
//
//		�� �ƴϾ�
//		�� �ƴϾ�
//		�� �ƴϾ�
//		�� �ƴϾ�
//		�� �ƴϾ�
//				
		System.out.println("Ƚ���� �Է��ϼ��� : ");
		int count = scan.nextInt();
		int i = 0;
		while(i < count) {
			System.out.println("�� �ƴϾ�");
			i++;
		}
//	
//		2. ī��Ʈ �ٿ� "�߻�"
//		���� �Է� �ް� �� ������ ���� 0 ���� �� �پ� ī��Ʈ �ٿ��� ��� �ϰ� �������� "�߻�"�� ����ϼ���.
//		�Է� ����
//
//		ī��Ʈ �ٿ� �Է��ϼ��� : 3
//		��� ����
//
//		3
//		2
//		1
//		0
//		�߻�
		
		System.out.println("ī��Ʈ �ٿ� �Է��ϼ��� : ");
		i = scan.nextInt();
				
		while(i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("�߻�");
		
		// ���޴� Ǯ��
//		int count = scan.nextInt();
//		i = count;
		// �̷��� i���ٰ� �����ϴ� ����..!
		
		
//		3. ¦�� �� ���ϱ�
//		���� �Է� �ް� 1���� ���� �Է��� �������� ¦���� ���� ���Ͽ� ����ϼ���.
//		�Է� ����
//
//		���� �Է��ϼ��� : 12
//		��� ����
//
//		���� ��� : 42
		
//		System.out.print("���� �Է��ϼ��� : ");
//		int number = scan.nextInt();
//		 i = 2;
//		int sum = 0;
//		
		// ���޴� Ǯ��
//		while(i <= number) {
//			sum += i;
//			i += 2;
//		}
//		System.out.println("���� ��� : " + sum);
//		
		
		
		// ���޴� Ǯ��
//		System.out.println("���� �Է��ϼ���: ");
//		int number = scan.nextInt();
//		
//		i = 1;
//		
//		int sum = 0;
//		while(i <= number) {
//			// 1 2 3 4 5 �߿� ¦���� ��� ���ҰŴϱ�
//			if(i % 2 == 0) {
//				sum = sum + i;
//			}
//			i++;
//		}
//		
//		System.out.println("��: sum");
		
		
//		4. ������
//		������ 2���� ����ϼ���
//		��� ����
//
//		2 X 1 = 2
//		2 X 2 = 4
//		2 X 3 = 6
//		2 X 4 = 8
//		2 X 5 = 10
//		2 X 6 = 12
//		2 X 7 = 14
//		2 X 8 = 16
//		2 X 9 = 18
		
//		System.out.print("������ �ܼ� �Է� : ");
//		int num = scan.nextInt();
//		i = 1;
//		
//		while(i < 10) {
//			System.out.println(num + " X " + i + " = " + (num * i));
//			i++;
//		}

		
//		5. �ݺ� �Է�
//		while�� �̿��Ͽ� 5�� ���� ���� �Է� �ް� ����ϼ���.
//		����� ����
//
//		�Է� : 4
//		��� : 4
//		�Է� : 5
//		��� : 5
//		�Է� : 6
//		��� : 6
//		�Է� : 7
//		��� : 7
//		�Է� : 8
//		��� : 8
		
		i = 0;
		while(i < 5) {
			System.out.print("�Է� : ");
			int input = scan.nextInt();
			System.out.println("��� : " + input);
			i++;
		}
		
		
		
		
		
		scan.close();

	}

}
