package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// ���ڿ� ���� �ʱ�ȭ
		String text = "Hello World!!";
		System.out.println(text);

		// ���ڿ� ����
		int number = 10;
		System.out.println("Hello " + number);
		System.out.println(text + number);
		
		String word1 = "Hello ";
		String word2 = "World!!";
		
		System.out.println(word1 + word2);
		
		String newText = word1 + word2;
		System.out.println(newText);
		
		// ���ڿ� �Է�
		Scanner scan  = new Scanner(System.in);
		
//		String text1 = scan.next();
//		System.out.println(text1);
		
		String text2 = scan.nextLine();
		System.out.println(text2);
		
		// ���ڿ� �迭
		String[] texts = {"cat", "dog", "apple"};
		
		for(int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
		
		
	}

}
