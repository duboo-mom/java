package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// ���� ���ڿ��� -> int�� ����
		String numberString1 = "30";
		String numberString2 = "20";
		
		System.out.println(numberString1 + numberString2);
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		System.out.println(number1 + number2);
		
		// int �� ���� ���ڿ��� ��ȯ
		int number3 = 100;
		int number4 = 400;
		
//		String numberString3 = String.valueOf(number3);
//		String numberString4 = String.valueOf(number4);
		String numberString3 = number3 + "";
		String numberString4 = number4 + "";
				
		System.out.println(numberString3 + numberString4);
		
		// ���ڿ� ��
		
		String word1 = "�����";
		String word2 = "�����";
//		String word2 = new String("�����");
		System.out.println(word2);
		
		// ���ڿ��� ��� �ʱ�ȭ �Ǿ��Ŀ� ���� �ϰ��� ���� �Ǻ���
//		if(word1 == word2) {
//			System.out.println("����!");
//		} else {
//			System.out.println("�ٸ���~");
//		}
		
		if(word1.equals(word2)) {
			System.out.println("����!");
		} else {
			System.out.println("�ٸ���!");
		}
		
		
		
		
		

	}

}
