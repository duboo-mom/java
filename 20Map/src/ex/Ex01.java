package ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Map<String, String> memberMap = new HashMap<>();
		
		// value는 중복 가능~~
		memberMap.put("hagulu", "김인규");
		memberMap.put("mizzong", "안미정");
		memberMap.put("ohndar", "김인규");
		
		System.out.println(memberMap);

		// 값 수정
		memberMap.put("ohndar", "유재석");
		System.out.println(memberMap);
		
		System.out.println(memberMap.get("mizzong"));
		String name = memberMap.get("ohndar");
		System.out.println(name);
		
		// 맵에서 사용되는 메소드
		// 특정 키가 존재하는지 확인하는 메소드
		if(memberMap.containsKey("hagulu")) {
			System.out.println("해당 키가 있습니다.");
			System.out.println(memberMap.get("hagulu"));
		}
		
		// 맵에 있는 모든 값 확인하기
		// 반복문 사용
		// 최대한 사용하지 않도록 하세요!!!!!
		// 맵은 순서가 있는게 아니고 키값을 알고 데이터를 사용한다는 개념이니까..! 전체를 훑어보는게 좀 어색한 것임
		// 맵자체를 반복할수는 없음
		
		// 맵 안에 모든 키 얻어 오기
		// key의 제네릭과 일치시키기~
		// 왜 set으로 얻어올까..? -> 중복없고, 순서 상관없으니까~
		// 키를 얻어올 상황은 거~~의 없음.. 키를 통해서 밸류를 얻는 과정!
		
		Set<String> keySet = memberMap.keySet();
		
		for(String id:keySet) {
			
			System.out.print(memberMap.get(id) + " ");
		}
		System.out.println();
		
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String id = iter.next();
			
			System.out.print(memberMap.get(id) + " ");
		}
		
		
		
	}

}
