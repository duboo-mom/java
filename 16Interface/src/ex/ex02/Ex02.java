package ex.ex02;

public class Ex02 {

	public static void main(String[] args) {
		
		// Naver 자바 개발자를 모집 공고
		// 취업준비생 지원
		
		Naver naver = new Naver();
		
		JobAplicant me = new JobAplicant();
		me.readLetter();
		
		naver.recruitJavaProgrammer(me);

	}

}
