package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// �Ҽ� (�Ǽ�)
		double pi = 3.14;
		System.out.println("������ : " + pi);
		
		// ����
		char quiz = 'O';
		System.out.println("������ ������ : " + quiz);
		
		// ����ȯ (casting)
		// pi�� ���� int �� ������ ����
		int intPi = (int)pi;
		System.out.println("int pi : " + intPi);
		
		double doublePi = intPi;
		System.out.println("double pi : " + doublePi);
		
		// ��� ���ϱ�
		int score1 = 95;
		int score2 = 100;
		
		double doubleScore1 = (double)score1;
		// double average = (doubleScore1 + score2) / 2;
		
		// double average = (score1 + score2) / (double)2;
		
		double average = (score1 + score2) / 2.0;
		
		System.out.println("��� : " + average );
		
		
	}
}
