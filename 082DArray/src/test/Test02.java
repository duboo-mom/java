package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		1. 10 �Է��ϱ�
//		[2][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, ��� ���� 10�� �ְ� ����ϼ���.
//		���
//
//		10 10 10 
//		10 10 10 
		int[][] array1 = new int[2][3];
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				array1[i][j] = 10;
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();


		
//		2. ������� �Է��ϱ�
//		[3][4] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, �Ʒ��� ���� �� �迭�� 1~4�� ���� �ϰ�, ����ϼ���.
//		���
//
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
		
		int[][] array2 = new int [3][4];
		
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				array2[i][j] = j + 1;
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		3. �迭 ���� �Է��ϱ�
//		[3][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, ù �迭�� 1, �ι�° �迭�� 2, ����° �迭�� 3 ���� ä��� ��� �ϼ���.
//		���
//
//		1 1 1 
//		2 2 2 
//		3 3 3 
		
		int[][] array3 = new int[3][3];
		
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3[i].length; j++) {
				array3[i][j] = i + 1;
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		4. +�� �׸���
//		[5][5] ũ���� �迭�� ���弼��.
//		��� ���� 0���� �ʱ�ȭ �ϼ���.
//		�ݺ����� �̿��ؼ�, �Ʒ��� ���� + ��ġ�� 1�� �Է� �ϰ� ����ϼ���.
//		���
//
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0 
		
		int[][] array4 = new int [5][5];
		for(int i = 0; i < array4.length; i++) {
			for(int j = 0; j < array4[i].length; j++) {
				array4[2][j] = 1;				
			}
			array4[i][2] = 1;
		}
		
		for(int i = 0; i < array4.length; i++) {
			for(int j = 0; j < array4[i].length; j++) {
				System.out.print(array4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		5. ��ü �� �Է�
//		[3][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, �Ʒ��� ���� ���·� ���ڸ� ���ʷ� �����ϰ� ��� �ϼ���.
//		���
//
//		1 2 3 
//		4 5 6 
//		7 8 9 
		
		
 		int[][] array5 = new int[3][3];
		int number = 1;
		for(int i = 0; i < array5.length; i++) {
			for(int j = 0; j < array5[i].length; j++) {
//				array5[i][j] = j + 1 + (3 * i) ;
				array5[i][j] = number;
				number++;
			}
		}
		
		// ��¿�����..! ���� �δ°� ���Ѱ� ������ �߰��߰� �� Ȯ���� �� �����ϱ�?
		
		for(int i = 0; i < array5.length; i++) {
			for(int j = 0; j < array5[i].length; j++) {
				System.out.print(array5[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		6. ��ü �� �Է�
//		[3][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, �Ʒ��� ���� ���·� ���ڸ� ���ʷ� �����ϰ� ��� �ϼ���.
//		���
//
//		1 4 7 
//		2 5 8 
//		3 6 9 
		
 		int[][] array6 = new int[3][3];
		int num = 1;
		for(int i = 0; i < array6.length; i++) {
			for(int j = 0; j < array6[i].length; j++) {
				
				// ����
				// 00 01 02 10 11 12 20 21 22
				// ��� �ϰ���� ��ġ
				// 00 10 20 01 11 21 02 12 22
				
//				array6[i][j] =  i + 1 + (j * 3);
				array6[j][i] = num;
				num++;
			}
			
		}
		
		for(int i = 0; i < array6.length; i++) {
			for(int j = 0; j < array6[i].length; j++) {
				System.out.print(array6[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		

		
//		1. ���� ���ڿ� ��ȯ
//		�Ʒ��� ���� ��������� ����� ���� ������ �ִ�.
//		�ش� ������ �Ʒ��� ���� ��������� ǥ���ϴ� ���ڿ��� ��ȯ�ϰ� ����ϼ���.
		int year = 2000;
		int month = 11;
		int day = 15;
//		��� ����
//
//		20001115
		
		// String yearString = String.valueOf(year);
		String yearString = year + "";
		String monthString = month + "";
		String dayString = day + "";
		
		System.out.println(yearString + monthString + dayString);
		
		System.out.println(year + "" + month + day);
		// 
		
		
//		2. ���ڿ� ���� ��ȯ
//		�Ʒ��� ���� ������ ����� String �� ���� �� ���� ���̸� ��� �ϼ��� (�ѱ� ����)
		yearString = "1995";
//		��� ����
//
//		1995����� ���̴� 28��
		
		year = Integer.parseInt(yearString);
		int age = 2022 - year + 1;
		System.out.println(yearString + "����� ���̴� " + age + "��");
		
		
//		3. ���� ����
//		�Ʒ� �迭�� ��ǰ ����� ����Ǿ� �ִ�.
		String[] goods = {"�����", "������", "�Ŷ��", "��ī�ݶ�", "������", "������", "�����", "�Ŷ��"};
//		��ǰ���� �Է¹ް� �ش� ��ǰ�� �迭�� �� �� �ִ��� ����ϼ���.
//		�Է� ����
//
//		��ǰ�� : ������
//		��� ����
//
//		3��
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��ǰ�� : ");
		String subject = scan.next();
		
		int count = 0;
		
		for(int i = 0; i < goods.length; i++) {
			if(goods[i].equals(subject)) {
				count++;				
			}
		}
		System.out.println(count + "��");
		
		
		scan.close();
		
		
		


	}

}
