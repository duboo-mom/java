package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// 소수 (실수)
		double pi = 3.14;
		System.out.println("원주율 : " + pi);
		
		// 문자
		char quiz = 'O';
		System.out.println("퀴즈의 정답은 : " + quiz);
		
		// 형변환 (casting)
		// pi의 값을 int 형 변수에 저장
		int intPi = (int)pi;
		System.out.println("int pi : " + intPi);
		
		double doublePi = intPi;
		System.out.println("double pi : " + doublePi);
		
		// 평균 구하기
		int score1 = 95;
		int score2 = 100;
		
		double doubleScore1 = (double)score1;
		// double average = (doubleScore1 + score2) / 2;
		
		// double average = (score1 + score2) / (double)2;
		
		double average = (score1 + score2) / 2.0;
		
		System.out.println("평균 : " + average );
		
		
	}
}
