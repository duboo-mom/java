package ex.ex02;

public class Ex02 {

	public static void main(String[] args) {
		
		// Naver �ڹ� �����ڸ� ���� ����
		// ����غ�� ����
		
		Naver naver = new Naver();
		
		JobAplicant me = new JobAplicant();
		me.readLetter();
		
		naver.recruitJavaProgrammer(me);

	}

}
