package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		1. ���ڿ� ���
//		���ڿ� ������ ���� ���� �Ʒ� ������ �ܾ �ϳ��� �����ϼ���.
//		�� ������ �̿��ؼ� �Ʒ� ����ó�� ����ϼ���.
//		Oh My God
		
//		String word1 = "Oh";
//		String word2 = "My";
//		String word3 = "God";
//		
//		System.out.println(word1 + " " + word2 + " " + word3);
		
//		2. ���ڿ� �Է�
//		id�� �Է� �ް�, �Ʒ��� ���� ȯ�� �޽����� ����ϼ���.
//		Welcome! id
//		�Է� ����
//
//		ID�� �Է� �ϼ��� : hagulu
//		��� ����
//
//		Welcome! hagulu
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("ID�� �Է� �ϼ��� : ");
//		String id = scan.next();
//		System.out.println("Welcome! " + id);
		
//		3. ���ڿ� �迭 ***
//		�Ʒ��� ���� ������ �Է� �ϰ�, �� ������ �ܾ �ϳ��� ���ڿ� �迭�� �����ϼ���.
//		����� �ܾ �� �ٿ� �ϳ��� ����ϼ���.
//		�Է� ����
//
//		Why so serious
//		��� ����
//
//		Why 
//		so
//		serious
		
		
//		String word1 = scan.next();
//		String word2 = scan.next();
//		String word3 = scan.next();
				
		String[] words = new String[3];
		
		for(int i = 0; i < words.length; i++) {
			words[i] = scan.next();		
		}
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		

		


	}

}
