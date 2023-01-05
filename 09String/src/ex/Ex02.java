package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// 숫자 문자열을 -> int형 변수
		String numberString1 = "30";
		String numberString2 = "20";
		
		System.out.println(numberString1 + numberString2);
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		System.out.println(number1 + number2);
		
		// int 형 값을 문자열로 변환
		int number3 = 100;
		int number4 = 400;
		
//		String numberString3 = String.valueOf(number3);
//		String numberString4 = String.valueOf(number4);
		String numberString3 = number3 + "";
		String numberString4 = number4 + "";
				
		System.out.println(numberString3 + numberString4);
		
		// 문자열 비교
		
		String word1 = "고양이";
		String word2 = "고양이";
//		String word2 = new String("고양이");
		System.out.println(word2);
		
		// 문자열이 어떻게 초기화 되었냐에 따라 일관성 없게 판별함
//		if(word1 == word2) {
//			System.out.println("같다!");
//		} else {
//			System.out.println("다르다~");
//		}
		
		if(word1.equals(word2)) {
			System.out.println("같다!");
		} else {
			System.out.println("다르다!");
		}
		
		
		
		
		

	}

}
