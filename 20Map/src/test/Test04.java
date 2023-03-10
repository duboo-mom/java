package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test04 {

    public static void main(String[] args) {
        Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("닉네임", "마로비아나");
        myCharacter.put("직업", "마법사");
        myCharacter.put("서버", "B");
        myCharacter.put("레벨", "38");

        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
        List<Map<String, String>> characters = new ArrayList<>();
        Map<String, String> character1 = new HashMap<>();
        character1.put("닉네임", "사자고양이");
        character1.put("직업", "전사");
        character1.put("서버", "A");
        character1.put("레벨", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("닉네임", "하구루");
        character2.put("직업", "마법사");
        character2.put("서버", "B");
        character2.put("레벨", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("닉네임", "바다");
        character3.put("직업", "힐러");
        character3.put("서버", "B");
        character3.put("레벨", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("닉네임", "초보");
        character4.put("직업", "힐러");
        character4.put("서버", "A");
        character4.put("레벨", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("닉네임", "남라");
        character5.put("직업", "힐러");
        character5.put("서버", "B");
        character5.put("레벨", "84");
        characters.add(character5);

        // TODO: 구현
        
        // characters라는 list가 있으니까 그안에 있는 map중에 key = 서버 조회하기
        // 내 서버랑 같은 캐릭터 조회
        // 직업 먼저 돌던 서버먼저 돌던 상관 없을듯..!? 아니면 조건 동시만족으로 찾기
        
        // characters list 전체 훑어보기
        
        // 보너스 문제.... 후보중에 레벨 젤 높은 사람만 출력....ㅋㅎㅋㅎ?
        // 와! maxCharacter를 맵으로 저장해서 통째로 출력하면 되지!!
        
        Iterator<Map<String, String>> iter = characters.iterator();
        System.out.println("힐러 탐색 결과");
        int maxLevel = 0;
        Map<String, String> maxCharacter = null;
        
        while(iter.hasNext()) {
        	
        	Map<String, String> charactersMap = iter.next();
        	String myServer = myCharacter.get("서버");
        	
        	if(myServer.equals(charactersMap.get("서버")) && charactersMap.get("직업").equals("힐러")) {
        		
        		String levelString = charactersMap.get("레벨");
        		int level = Integer.parseInt(levelString);
        		
        		if(maxLevel < level) {
        			maxLevel = level;
        			maxCharacter = charactersMap;
        		}

        	}
        	
        }
//        System.out.println(maxLevel);
        
		System.out.println("닉네임 : " + maxCharacter.get("닉네임"));
		System.out.println("직업 : " + maxCharacter.get("직업"));
		System.out.println("서버 : " + maxCharacter.get("서버"));
		System.out.println("레벨 : " + maxCharacter.get("레벨"));

    }

}
