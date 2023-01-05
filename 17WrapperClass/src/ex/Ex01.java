package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println(number1);
		
		Integer number2 = 10;
		System.out.println(number2);
		
		// 이건 이제 사라질 문법인데 유예기간 줌..ㅋ.ㅎ..!!
		Integer number3 = new Integer(10);
		System.out.println(number3);
		
		// int 변수에 Integer 값 저장
		number1 = number2;
		// Integer 변수에 int 값 저장
		number2 = number1;
		
		// 래퍼클래스와 자료형은 자유롭게 호환가능~~
		
		
		if(number1 == number2) {
			System.out.println("출력");
		}
		
		if(number2 == number3) {
			System.out.println("출력안됨");
		}
		
		// 대문자로 시작하믄 클래스이니까 클래스 비교면 걍 무조건 equals쓰는게..^^...
		if(number2.equals(number3)) {
			System.out.println("출력");
		}
		
		// wrapper class 메모리 풀 주소가 동일하니께
		Integer number4 = 10;
		if(number2 == number4) {
			System.out.println("출력");
		}
		
		
		
		
		
	}

}
