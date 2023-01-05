package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	
    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };

	public static void main(String[] args) {
//		1. 이씨 찾기
//		Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
//
//		성씨가 '이'씨인 경우에는 값을 'O'로 바꾸고 전체 Map을 출력 하세요.
//
//		반복문을 이용해서 바꾸세요.
//		출력 예시
//
//		{이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}
		
		Map<String, String> memberMap = new HashMap<>();
//		Map<String, Character> memberMap = new HashMap<>();
//		memberMap.put("유재석", 'X');
		// char 타입으로 해도되는데 대신 작은따옴표로 put 해야됨
		memberMap.put("유재석", "X");
		memberMap.put("박나래", "X");
		memberMap.put("이지은", "X");
		memberMap.put("서장훈", "X");
		memberMap.put("이광수", "X");
		
		Set<String> keySet = memberMap.keySet();
		for(String name:keySet) {
			if(name.startsWith("이")) {
				memberMap.put(name, "O");
			}
		}
		System.out.println(memberMap);

        
//        2. 수도 맞추기 게임
//        랜덤으로 뽑힌 나라의 수도 이름을 맞추는 게임
//        나라-수도가 들어있는 20개의 쌍이 Map으로 주어진다.
//        이 중 랜덤으로 5개의 문제가 주어지고, 사용자로부터 나라에 해당하는 수도를 입력 받는다.
//        정답인지 아닌지 수도를 입력한 즉시 출력한다.
//        모두 풀고 나면 점수(100점 만점)가 출력된다.

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
		
        Set<String> keys = capitalMap.keySet();
        // list 생성자에 set 받으면 add처리 해줌! 이게 또 ArrayList안에 들어있는...
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
        // TODO: 구현하기
        
        int score = 0;
        List<Integer> indexList = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			// 0 ~ 19
	        int index = rand.nextInt(keyList.size());
	        
	        // index 중복 제거
	        if(indexList.contains(index)) {
	        	i--;
	        } else {
	        	
	        	indexList.add(index);
	        	
	        	String country = keyList.get(index);
	        	System.out.print(country + "의 수도 이름은?");
	        	String answer = scan.nextLine();
	        	if(capitalMap.get(country).equals(answer)) {
	        		System.out.println("정답");
	        		score += 20;
	        	} else {
	        		System.out.println("틀렸습니다.");
	        	}
	        	
	    		// 아니면 index로 하는거말고 문제출제하고 해당 country를 리스트에서 삭제해주면 됨!!
	    		// keyList.remove(country);
	        	// 그러면 인덱스로 돌릴 필요없음~~
	        	
	        }
	        
		}
		System.out.println("총 점수는 " + score);
	

		
		
		scan.close();

	}

}
