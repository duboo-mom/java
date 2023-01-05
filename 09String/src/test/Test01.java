package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		1. 문자열 출력
//		문자열 변수를 세개 만들어서 아래 문장의 단어를 하나씩 저장하세요.
//		세 변수를 이용해서 아래 내용처럼 출력하세요.
//		Oh My God
		
//		String word1 = "Oh";
//		String word2 = "My";
//		String word3 = "God";
//		
//		System.out.println(word1 + " " + word2 + " " + word3);
		
//		2. 문자열 입력
//		id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//		Welcome! id
//		입력 예시
//
//		ID를 입력 하세요 : hagulu
//		출력 예시
//
//		Welcome! hagulu
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("ID를 입력 하세요 : ");
//		String id = scan.next();
//		System.out.println("Welcome! " + id);
		
//		3. 문자열 배열 ***
//		아래와 같이 문장을 입력 하고, 이 문장의 단어를 하나씩 문자열 배열에 저장하세요.
//		저장된 단어를 한 줄에 하나씩 출력하세요.
//		입력 예시
//
//		Why so serious
//		출력 예시
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
