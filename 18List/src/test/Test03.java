package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

//		1. id 중복 체크
//		아래와 같이 회원 가입된 id 목록이 주어진다.
//		["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//		id 를 입력 받고, id 가 중복 될경우 "중복입니다", 중복이 되지 않을 경우 "사용가능" 을 출력 하세요.
//		입력 예시
//
//		id : hagulu
//		출력 예시
//
//		중복 입니다.
		
		List<String> idList = new ArrayList<>();
		idList.add("hagulu");
		idList.add("happy");
		idList.add("google");
		idList.add("bts");
		idList.add("iu");
		idList.add("cuteboy");
		
//		System.out.print("id : ");
//		Scanner scan = new Scanner(System.in);
//		String newId = scan.next(); // nextLine 해도됨~
//		if(idList.contains(newId)) {
//			System.out.println("중복 입니다.");
//		} else {
//			System.out.println("사용 가능");
//		}
//		System.out.println();
		
//		2. 체조 경기 평균 점수
//		체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//		최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//		for문으로 구현할 것
//
//		[8, 7, 6, 10, 9, 4]
//		출력 예시
//
//		최고점과 최저점을 제외한 평균 점수는 7.5
		
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(8);
		scoreList.add(7);
		scoreList.add(6);
		scoreList.add(10);
		scoreList.add(9);
		scoreList.add(4);
		
		
		// sort해서 앞뒤 잘라도 될거같군...
		
//		Integer min = scoreList.get(0);
//		Integer max = scoreList.get(0);
//		for(int i = 1; i < scoreList.size(); i++) {
//			if(scoreList.get(i) < min) {
//				min = scoreList.get(i);
//			}
//			if(scoreList.get(i) > max) {
//				max = scoreList.get(i);
//			}
//		}
//		scoreList.remove(min);
//		scoreList.remove(max);
		
		scoreList.sort(Comparator.naturalOrder());
//		scoreList.remove(scoreList.size() - 1);
//		scoreList.remove(0);
		
		int sum = 0;
//		for(Integer score : scoreList) {
//			sum += score;
//		}
		
		// 삭제하지말고..! 
		for(int i = 1; i < scoreList.size() - 1; i++) {
			sum += scoreList.get(i);
		}
		
		double average = sum / (double)(scoreList.size() - 2);
		
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average );
		System.out.println();	
		
		
//		3. 로또 번호
//		Random 클래스를 이용해서 1~45 범위의 6개의 중복 되지 않는 숫자를 리스트에 저장 하세요.
//		저장된 숫자를 오름 차순으로 정렬해서 출력 하세요.
//		출력 예시
//
//		[3, 6, 19, 26, 37, 44]
		
		Random random = new Random();
		List<Integer> lottoList = new ArrayList<>();
		
		// 리스트의 크기가 6보다 작을동안 임의의 숫자를 뽑는다.
		// 실제로 i를 컨트롤하는건 꽤나 어려운 작업임..!!
		while(lottoList.size() < 6) {
			Integer number = random.nextInt(45) + 1;
			if(!lottoList.contains(number)) {
				lottoList.add(number);
			}
		}
		
		
//		for(int i = 0; i < 6; i++) {
//			Integer number = random.nextInt(45) + 1;
//			
//			if(!lottoList.contains(number)) {
//				lottoList.add(number);
//			} else {
//				i--;
//			}
//			
//		}
		lottoList.sort(Comparator.naturalOrder());
		System.out.println(lottoList);
		System.out.println();
		
		
		
		
//		4. 회원 추가하기
//		회원관리 리스트를 만든다.
//
//		[우솝, 루피, 상디, 나미, 로빈]
//		새로 입력할 이름을 기존 리스트에 추가한다.
//		만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//		(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
//
//		프랑키
//		루피
//		쵸파
//		로빈
//		루피
//		출력 예시
//
//		[우솝, 루피, 상디, 나미, 로빈, 프랑키, 루피1, 쵸파, 로빈1, 루피2]
		
		List<String> nameList = new ArrayList<>();
		
		nameList.add("우솝");
		nameList.add("루피");
		nameList.add("상디");
		nameList.add("나미");
		nameList.add("로빈");
		
		List<String> addNameList = new ArrayList<>();
		addNameList.add("프랑키");
		addNameList.add("루피");
		addNameList.add("쵸파");
		addNameList.add("로빈");
		addNameList.add("루피");
		addNameList.add("로빈");
		addNameList.add("루피");
		addNameList.add("루피");
		addNameList.add("로빈");
		
		for(int i = 0; i < addNameList.size(); i++) {
			String addName = addNameList.get(i);
			// 루피 루피1 루피2 루피3 루피4
			int count = 1;
			while(nameList.contains(addName)) {
				// 루피1
				addName = addNameList.get(i) + count;
				count++;
			}
			
			nameList.add(addName);
		}
		
		System.out.println(nameList);
		

		// 내풀이...ㅋㅋㅋ사실 정답은 아님.ㅋ..ㅎ....
//		int count = 1;
//		for(int i = 0; i < addNameList.size(); i++) {
//			
//			if(nameList.contains(addNameList.get(i))) {
//				
//				if(nameList.contains(addNameList.get(i) + count)) {
//					count++;
//					nameList.add(addNameList.get(i) + count);
//					break;
//				}
//				nameList.add(addNameList.get(i) + 1);
//					
//			} else {
//				nameList.add(addNameList.get(i));
//			}				
//		}
//		System.out.println(nameList);
		
		
		
		
		
	}

}
