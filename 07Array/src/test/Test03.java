package test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. ��ġ ���� (swap)
//		�� ���� index�� �Է� �޾Ƽ�, �ش��ϴ� index�� ���� ���� ��ü �ؼ� �迭�� ����ϼ���.
//		int[] numbers = {3, 5, 2, 10, 39};
//		�Է� ����
//
//		�� ���� index�� �Է� �ϼ��� : 2 4
//		��� ����
//
//		3 5 39 10 2 
		
//		int[] numbers = {3, 5, 2, 10, 39};
//		
//		System.out.print("�� ���� index�� �Է��ϼ��� : ");
//		int index1 = scan.nextInt();
//		int index2 = scan.nextInt();
//		
//		int tempNum = numbers[index1];
//		numbers[index1] = numbers[index2];
//		numbers[index2] = tempNum;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		
		
		
//		2. ����
//		1 ~ 10 ���� ���ʷ� ����� �迭�� �����, ������ �� ��� �� ����� ��� �ϼ���.
//		��Ʈ
//		rand() �Լ��� �̿��ؼ�, 0��° index�� ���� rand() ��° index�� ���� ���� ��ü �ϸ� �ȴ�.
//
//		Random rand = new Random();
//
//		for (int i = 0; i < 100; i++) {
//		    int randomNumber = rand.nextInt(10);
//		    // swap ����
//		}
//		��� ����
//
//		4 5 7 8 9 1 3 6 2 10
//		
		Random rand = new Random();
		
		int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// ���⼭�� 100 �� �����ִ� Ƚ���̹Ƿ� Ŭ���� ���ϸ��� ���� 
		for (int i = 0; i < 100; i++) {
		    int randomNumber = rand.nextInt(10);
		    // swap ����
		    
		    int tmp = oneToTen[0];
		    oneToTen[0] = oneToTen[randomNumber];
		    oneToTen[randomNumber] = tmp;
   		    
		}
		
		for(int i = 0; i < oneToTen.length; i++) {
			System.out.print(oneToTen[i] + " ");
		}
		System.out.println();
		
		
		
//		3. ���� �� ã��
//		�Ʒ� �迭�� 1 ~ 9 �� ���ڵ��� ����ִµ� �ϳ��� ���� ���� �ִ�.
//		���� ���� ã�Ƽ� ����ϼ���.
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
//
//		��� ����
//
//		���� ���� 7 �Դϴ� 
		
//		int sum = 0;
//		int result = 0;
//		
//		for(int i = 0; i < numbers2.length; i++) {
//			sum += numbers2[i];
//		}
//		
//		for(int i = 1; i < 10; i++) {
//			result += i;
//		}
//		result = result - sum;
//		System.out.println("���� ���� " + result + "�Դϴ�.");
		
		// ���޴� Ǯ��
		
		// 1 2 3 4 5 6 7 8 9 �̷� üũ�� �� �ִ� ���� �����
		// v v v v v v   v v  �̷��� üũ�ؼ� ��� ã��
		
		// 0 1 2 3 4 5 6 7 8 9 �̷��� ����� ������!
		// ó�� ����� zerosó�� 0���� �� �����
		int[] count = new int[10];
		
		for(int i = 0; i < numbers2.length; i++) {
			count[numbers2[i]] = 1;
		}
		
		for(int i = 1; i < count.length; i++) {
			if(count[i] == 0) {
				System.out.println("���� ���� " + i + "�Դϴ�.");
				break;
			}
		}
		
		
		
		
//		4. �󵵼� ���ϱ�
//		1 ~ 5 ���� �ȿ� ���ڰ� �迭�� �ߺ��Ǿ� ���� �Ǿ� �ִ�.
//		1 ~ 5 ������ ���ڰ� ���� �� ���� ���� �Ǿ� �ִ��� ��� �ϼ���.
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//
//		��� ����
//
//		1 : 2
//		2 : 3
//		3 : 3
//		4 : 1
//		5 : 1

		// ���޴� Ǯ��
		// 1 2 3 4 5
		// Ȯ���ϸ鼭 �ϳ��ϳ� ���ϱ�!
		
		// 0 1 2 3 4 5
		// 0 0 0 0 0 0
		int[] numberCounts = new int[6];
		
		for(int i = 0; i < numbers3.length; i++) {
			numberCounts[numbers3[i]]++;
		}
		
		for(int i = 1; i < numberCounts.length; i++) {
			System.out.println(i + " : " + numberCounts[i]);
		}
		
		
		
//		int num1 = 0;
//		int num2 = 0;
//		int num3 = 0;
//		int num4 = 0;
//		int num5 = 0;
//		
//		int[] dupleNum = new int[5];
//		
//		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//		
//		for(int i = 0; i < numbers3.length; i++) {
//			if (numbers3[i] == 1) {
//				num1++;
//			} else if(numbers3[i] == 2) {
//				num2++;
//			} else if(numbers3[i] == 3) {
//				num3++;
//			} else if(numbers3[i] == 4) {
//				num4++;
//			} else {
//				num5++;
//			}
//		}
//		System.out.println("1 : " + num1);
//		System.out.println("2 : " + num2);
//		System.out.println("3 : " + num3);
//		System.out.println("4 : " + num4);
//		System.out.println("5 : " + num5);

		
		
	}

}
