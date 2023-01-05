package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		1. 문자열 검색
//		파일이름이 저장된 문자열 배열에서 jpg 파일이 몇 개인지 출력하세요.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		출력 예시
//
//		jpg 파일 개수 : 3
		
		int count = 0;
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith(".jpg")) {
				count++;
			}
		}
		System.out.println("jpg 파일 개수 : " + count);
		
		
//		2. 영 단어 퀴즈
//		영어 단어 퀴즈를 낸다.
//		아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//		100점 만점 기준으로 몇 점인지 출력한다.
//		1. 승리를 영어로 입력하세요 :
//		2. 사랑을 영어로 입력 하세요 :
//		3. 컴퓨터를 영어로 입력 하세요 :
//		4. 노트북을 영어로 입력하세요 :
//		입력 예시
//
//		1. 승리를 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook
//		출력 예시
//
//		점수는 75점 입니다.

		Scanner scan = new Scanner(System.in);
		String[] word = new String[4];
		
		System.out.print("1. 승리를 영어로 입력하세요 : ");
		word[0] = scan.nextLine();
		System.out.print("2. 사랑을 영어로 입력 하세요 : ");
		word[1] = scan.nextLine();
		System.out.print("3. 컴퓨터를 영어로 입력 하세요 : ");
		word[2] = scan.nextLine();
		System.out.print("4. 노트북을 영어로 입력하세요 : ");
		word[3] = scan.nextLine();
		
		String[] answer = {"victory", "love", "computer", "notebook"};
		
		count = 0;
		for(int i = 0; i < word.length; i++) {
			if(word[i].equals(answer[i])) {
				count += 25;
			}
		}
		System.out.println("점수는 " + count + "점 입니다.");
		
		
		
		
//		3. 문자열 검색
//		회원 명부가 아래와 같이 문자열이 저장 되어 있다. 같은 이름이 몇 개 인지 출력하세요.
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
//
//		출력 예시
//
//		동명 이인 수 : 3
		
		String[] members = membersString.split(":");
//		String[] overlap = new String[members.length];
//		count = 0;
//		
//		for(int i = 0; i < members.length; i++) {
//			for(int j = i + 1; j < members.length; j++) {
//				int n = 0;
//				if(members[i].equals(members[j])) {
//					count++;							
//				}
//			}
//		}
//		System.out.println("동명이인 수 : " + count);

		// 스앵님 풀이

		
		count = 0;
		
		for(int i = 0; i < members.length; i++) {
			
			String targetName = members[i];
			for(int j = i + 1; j < members.length; j++) {
				
				if(targetName.equals(members[j])) {
					count++;
					break;
				}
				
			}
		}

		

		
		scan.close();
		
		
		
		
		
	}

}
