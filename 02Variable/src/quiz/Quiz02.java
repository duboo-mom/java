package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
//		���� ������ 90�� �̻��̸� 'A'�����̰� ������ 4.0 �Դϴ�.
//		���� ������ 80�� �̻��̸� 'B'�����̰� ������ 3.0 �Դϴ�.
		
		int score = 90;
		char grade = 'A';
		double rate = 4;
		System.out.println("���� ������ " + score + "�� �̻��̸� \'" + grade + "\'�����̰� ������ " + rate + "�Դϴ�." );
		
		score = 80;
		grade = 'B';
		rate = 3;
		System.out.println("���� ������ " + score + "�� �̻��̸� \'" + grade + "\'�����̰� ������ " + rate + "�Դϴ�." );
		
		//�� ���� �� : 1165.7250000000001
		int number1 = 33;
		double number2 = 35.325;
		double multiply = number1 * number2;
		
		System.out.println("�� ���� �� : " + multiply);
		
		// �ð����: 943�ð��� 39�� �Դϴ�.
		int hour = 943;
		int day = hour / 24;
		System.out.println(hour + "�ð��� " + day + "�� �Դϴ�.");
		
		// ���� ���� 8 ���� ���� 9�� �簢���� �ﰢ���� ���̸� ���� ���Ͽ� ����ϼ���
		int width = 7;
		int height = 3;
		int square = width * height;
		double triangle = (width * height) / (double)2;
		System.out.println("�簢���� ����: " + square);
		System.out.println("�ﰢ���� ����: " + triangle);
		
		// ���� 93��, ���� 88, ���� 94��
		// ��� : 91.66666666666667
		
		int korean = 93;
		int math = 88;
		int english = 94;
		double average = (korean + math + english) / 3.0;
		System.out.println("���� " + korean + "��, ���� " + math + "��, ���� " + english);
		System.out.println("��� : " + average);
		
		// ȭ�� �µ� = 9 / 5 * ���� �µ� + 32
		// ���� 30���� ȭ�� 86.0�� �Դϴ�.
		int celsius = 30;
		double fahrenheit = (double)9 / 5 * celsius + 32;
		// ���⼭ 9/5*celsius �θ� �ϸ� 9/5�� int�� �ƹ��� double�� ȭ���� �����ص� 1.0���� �νĵǾ ���� ���̰� �߻��� ������!! 
		System.out.println("���� " + celsius + "���� ȭ�� " + fahrenheit + "�� �Դϴ�.");
		
		
		
		
		
	}

}
