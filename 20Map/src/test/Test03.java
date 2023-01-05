package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test03 {

    public static void main(String[] args) {
    	
    	
//    	 책이름으로 작가명 찾기
//    	 책 이름을 입력 받으면 책의 작가명을 출력하는 프로그램
//    	 장르별로 책과 작가의 쌍이 n개 들어있다.
//    	 사용자로부터 책이름을 입력 받는다.
//    	 책이름에 해당하는 작가명을 출력한다.
//    	 예) 어린왕자의 작가명은 생텍쥐페리
    	
        // {장르1={책제목1=작가1, 책제목2=작가2}, 장르2={책제목1=작가1, 책제목2=작가2}}

        // {
        //    자기계발={더 해빙=이서윤,홍주연, 말 그릇=김윤나, 메모의 마법=마에다 유지},
        //    소설={어린왕자=생텍쥐페리, 아몬드=손원평, 나미야 잡화점의 기적=히가시노 게이고, 해변의 카프카=무라카미 하루키},
        //    과학={시간은 흐르지 않는다=카를로 로벨리, 코스모스=칼 세이건, 평행우주=미치오 카쿠}
        // }

        Map<String, Map<String, String>> bookMap = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("더 해빙", "이서윤,홍주연");
        map1.put("말 그릇", "김윤나");
        map1.put("메모의 마법", "마에다 유지");

        Map<String, String> map2 = new HashMap<>();
        map2.put("어린왕자", "생텍쥐페리");
        map2.put("아몬드", "손원평");
        map2.put("나미야 잡화점의 기적", "히가시노 게이고");
        map2.put("해변의 카프카", "무라카미 하루키");

        Map<String, String> map3 = new HashMap<>();
        map3.put("시간은 흐르지 않는다", "카를로 로벨리");
        map3.put("코스모스", "칼 세이건");
        map3.put("평행우주", "미치오 카쿠");

        bookMap.put("자기계발", map1);
        bookMap.put("소설", map2);
        bookMap.put("과학", map3);
//        System.out.println(bookMap);

        // 책 이름 입력
        Scanner scan = new Scanner(System.in);
        System.out.print("책이름을 입력해주세요: ");
        String searchBook = scan.nextLine();

        // TODO: 구현하기
        
        // 책이름 -> bookMap의 value가 map -> map의 key..!
        // 우선 bookMap의 set 만들어서 그 key의 value의 key를 조회하면~?
        
        
        Set<String> bookKey = bookMap.keySet();
        
        // bookKey는 자기계발, 소설, 과학이고 이거에 대한 value -> map1, map2, map3이 들어감
        // 그 각각의 맵에서 key를 활용해서 value확인
        
        for(String key:bookKey) {        	
        	Map<String, String> books = bookMap.get(key);
        	
        	if(books.containsKey(searchBook)) {
            	System.out.println(searchBook + "의 작가명은 " + books.get(searchBook));
        	}
        }
        
        // null 은 비워져있는 상태를 의미
        // 객체가 리턴할 값이 없을때도 null..
        
        
        
        
        
    }
}
