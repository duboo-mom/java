package ex;

public class Ex03 {

	public static void main(String[] args) {
		
		// 문자열 함수(메소드) 실습

		String text = "Hello";
		
		// 길이 구하기
		int textLength = text.length();
		System.out.println(textLength);
		
		// 문자 하나 얻기
		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		System.out.println(text.charAt(4));
		
		// 문자 하나씩 출력
		for(int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		System.out.println();
		
		// 문자열 자르기
		// 요상한게 substring(start index, end index) 인데...end는 포함이 아니고 그앞에서 잘려서 +1 해줘야됨...ㅋㅎ; 파이썬도 이랬던거 같음..
		text = "20010516";
		
		String yearString = text.substring(0, 4);
		System.out.println(yearString);
		
		String monthString = text.substring(4, 6);
		System.out.println(monthString);
		
		// 인덱스 하나만 넣으면 시작점부터 끝까지 다 가져옴 -> (6, 8) 해도 되고~
		String dayString = text.substring(6);
		System.out.println(dayString);
		
		// 특정 문자열로 시작하는지, 끝나는지
		text = "김인규";
		
		if(text.startsWith("김")) {
			System.out.println("김씨 입니다~~");
		} else {
			System.out.println("김씨가 아닙니다");
		}
		
		if(text.endsWith("인규")) {
			System.out.println("너 인규구나~?");
		} 
		
		// 문자열 일부 바꾸기
		
		String replaceText = text.replace("김", "이");
		
		System.out.println(replaceText);
		System.out.println(text);
		
		// 변수의 값을 바꾸고 싶으면 ~ 이렇게 변수에 다시넣기
		text = text.replace("김", "이");
		System.out.println(text);
		
		// 문자열 쪼개기
		text = "김인규,유재석,하하,황광희,조세호";
		
		String[] names = text.split(",");
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "님");
		}
		
		
		
		
	}

}
