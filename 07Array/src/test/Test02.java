package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		1. �迭 �� ����
//		index �� ���� ���ʷ� �Է� �޾Ƽ�, �Ʒ� �迭�� �ش��ϴ� index�� ���� �ٲٰ� ��� �ϼ���.
//		int[] numbers = {3, 5, 2, 10, 39}
//		�Է� ����
//
//		 ������ index�� ���� �Է��ϼ��� : 2 16
//		��� ����
//
//		3 5 16 10 39 

		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("������ index�� ���� �Է��ϼ��� : ");
		int index = scan.nextInt();
		int changeNum = scan.nextInt();
		numbers[index] = changeNum;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	
		
//		2. ���� ü��
//		�Ʒ��� ���� O �� X�� ä�� ����� ����� �迭�� �ִ�.
//		100�� ���� �������� �� ���� �¾Ҵ��� ����ϼ���.
//		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		��� ����
//
//		ä�� ����� 60�� �Դϴ�. 
		
		int sumScores = 0;
		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == 'O') {
				sumScores += 100 / scores.length;
			}
		}
		System.out.println("ä�� ����� " + sumScores + "�� �Դϴ�.");
		
		
//		3. �ӱ� ���
//		�Ʒ� �迭�� ���� ��, ȭ, ��, ��, ��, ��, �� 7�ϰ��� �Ƹ�����Ʈ�� �� �ð��� ��Ÿ����.
//		�ñ� ������ �Ʒ��� ���� �� 7�� ���� ���� �� �ӱ��� ���� ����ϼ���.
//		���� �ñ� : 8500��
//		�ָ�(��,��) �ñ� : 9500��
//
//		int[] works = {3, 5, 5, 3, 5, 3, 5};
//
//		��� ����
//
//		�����ϰ� �� �ӱ��� 254500�� �Դϴ�.
				
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int money = 0;
		
		for(int i = 0; i < works.length; i++) {
			if(i < (works.length - 2)) {
				money += (works[i] * 8500);
			} else {
				money += (works[i] * 9500);
			}
		}
		System.out.println("�����ϰ� �� �ӱ��� " + money + "�� �Դϴ�.");
		
		
//		4. ���ĺ� ����
//		�ݺ����� �̿��ؼ� A~Z �� �迭�� �����ؼ� ��� �ϰ�, 'V' �� �� ��° ���ĺ����� ��� �ϼ���.
//		��� ����
//
//		A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//		V �� 22��° �Դϴ�.
		
		char alphabet[] = new char[26];
//		int numV = 0; 
//
//		for(int i = 0; i < alphabet.length; i++) {
//			alphabet[i] = (char) (i + 65);
//			alphabet[i] = (char) ('A' + i) ��� �ᵵ ����~
//			System.out.print(alphabet[i] + " ");
//			
//			if(alphabet[i] == 'V') {
//				numV = i + 1;
//			}
//			
//		}
		
		// ���޴� Ǯ�� - ���� Ǭ ����� �˷��ֽ�
		
//		char tmp = 'A';
//		for(int i = 0; i < alphabet.length; i++) {
//			alphabet[i] = tmp;
//			tmp++;
//		}
//		
//		for(int i = 0; i < alphabet.length; i++) {
//			System.out.print(alphabet[i] + " ");
//		}
		
//		for(int i = 0; i < alphabet.length; i++) {
//			alphabet[i] = (char) ('A' + 65);
//			System.out.print(alphabet[i] + " ");
//		}
//
//		for(int i = 0; i < alphabet.length; i++) {
//			if(alphabet[i] == 'V') {
//				System.out.println("V �� " + (i + 1) + "��° �Դϴ�.");
//				break;
//			}
//		}
		
		
		System.out.println();
//		System.out.println("V �� " + numV + "��° �Դϴ�.");
				
		
//		5. �迭 �� ����
//		���̰� 5�� int �迭�� �����.
//		���� ���ѷ����� �Է� �����鼭, �Է� ���� ���� ¦�� �� ����, �迭�� �����Ѵ�.
//		�迭�� ���� ���� �Է��� �ߴ��ϰ�, ����� ������ ����Ѵ�.
//		�Է� ����
//
//		���� �Է��ϼ��� : 34
//		���� �Է��ϼ��� : 65
//		���� �Է��ϼ��� : 23
//		���� �Է��ϼ��� : 74
//		���� �Է��ϼ��� : 2
//		���� �Է��ϼ��� : 74
//		���� �Է��ϼ��� : 57
//		���� �Է��ϼ��� : 68
//		��� ����
//
//		34 74 2 74 68
		
		int[] numbers2 = new int[5];
		
		int i = 0;
		while(true) {
			
			
			System.out.print("���� �Է��ϼ��� : ");
			int number = scan.nextInt();
			
			if(number % 2 == 0) {
				numbers2[i] = number;
				i++;
			}
			if(i == 5) {
				break;
			}				
		}
		
		for(i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
		}
		
		

		
		
	}	

}


