package ex;

public class Ex01 {

	public static void main(String[] args) {

		int weight = 77;
		
		// ü���� 75kg �����̸� ġŲ�� �Դ´�.
		if (weight <= 75) {
			System.out.println("ġŲ����~~");					
		}
		
		// �����԰� 90 �ʰ��� ��ؾ� �ڴ�.
		if (weight > 90) {
			System.out.println("��ؾ߰ڴ�");
		}
		
		// �����԰� 60 ���ϸ� �� �� ����!
		if (weight <= 60) {
			System.out.println("�� �� ����");
		}
		
		// �����԰� 70�̸� ��ǥ �޼�!!
		if (weight == 70) {
			System.out.println("��ǥ �޼�!");
		}

		int number1 = 10;
		int number2 = 20;
		
		if(number1 > number2) {
			System.out.println("number1�� �� ũ��!");
		}
		
		boolean result = number1 > number2;
		System.out.println("�񱳿��� ��� " + result);
		
		if(result) {
			System.out.println("number1�� �� ũ��");
		}

	}

}
