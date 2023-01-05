package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
	
//		1. 자료 입력
//		아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
//		국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
//		출력 예시
//
//		{국어=90, 사회=80, 과학=100, 수학=85, 영어=90}
		
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("국어", 90);
		scoreMap.put("수학", 85);
		scoreMap.put("영어", 90);
		scoreMap.put("사회", 80);
		scoreMap.put("과학", 100);
		
		System.out.println(scoreMap);
		
//		2. 값 수정
//		사회 시험의 체점에 문제가 있어서 5점을 더 올려야 한다 값을 바꾸고 출력 하세요.
//		출력 예시
//
//		{국어=90, 사회=85, 과학=100, 수학=85, 영어=90}
		
		int newScore = scoreMap.get("사회") + 5;
		scoreMap.put("사회", newScore);
		System.out.println(scoreMap);
		
		
//		3. 값 찾기
//		과목명을 입력 받고, 점수를 출력 하세요.
//		단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
//		입력 예시
//
//		조회 할 과목명을 입력하세요 : 영어
//		출력 예시
//
//		영어 : 90
		
		Scanner scan = new Scanner(System.in);
		System.out.print("조회 할 과목명을 입력하세요 : ");
		String name = scan.nextLine();
		if(scoreMap.containsKey(name)) {
			System.out.println(name + " : " + scoreMap.get(name));
		} else {
			System.out.println("자료 없음");
		}
		
		
//		4. 값 찾기
//		90점 이상의 모든 과목을 출력 하세요.
//		출력 예시
//
//		국어 과학 영어 
		
		Set<String> keySet = scoreMap.keySet();
		
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			
			if(scoreMap.get(key) >= 90) {
				System.out.print(key + " ");
			}
		}
		System.out.println();
		
		
//		5. 값 확인
//		100점 성적이 있는 학생에게 성적 우수 상을 주기로 하였다.
//		성적 우수상을 받을 수 있는지 출력하세요.
//		출력 예시
//
//		수상 가능
		
		for(String key:keySet) {
			if(scoreMap.get(key) == 100) {
				System.out.println("수상 가능");
				break; // 반복문에서 더이상 필요없을땐 ~ 반복횟수 줄이도록~~
			}
		}
		
		
		// 웬만해서 쓰지맛..! value 기반으로 뭘 하려고하면 안됨
		if(scoreMap.containsValue(100)) {
			System.out.println("수상가능");
		}
		
		
		

	}

}
