package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println(number1);
		
		Integer number2 = 10;
		System.out.println(number2);
		
		// �̰� ���� ����� �����ε� �����Ⱓ ��..��.��..!!
		Integer number3 = new Integer(10);
		System.out.println(number3);
		
		// int ������ Integer �� ����
		number1 = number2;
		// Integer ������ int �� ����
		number2 = number1;
		
		// ����Ŭ������ �ڷ����� �����Ӱ� ȣȯ����~~
		
		
		if(number1 == number2) {
			System.out.println("���");
		}
		
		if(number2 == number3) {
			System.out.println("��¾ȵ�");
		}
		
		// �빮�ڷ� �����Ϲ� Ŭ�����̴ϱ� Ŭ���� �񱳸� �� ������ equals���°�..^^...
		if(number2.equals(number3)) {
			System.out.println("���");
		}
		
		// wrapper class �޸� Ǯ �ּҰ� �����ϴϲ�
		Integer number4 = 10;
		if(number2 == number4) {
			System.out.println("���");
		}
		
		
		
		
		
	}

}
