package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		1. ���ڿ� ��ȯ
//		�Ʒ� ���ڿ����� A �� B�� �ٲ㼭 ��� �ϼ���.
		String gradeString = "My grade is A";
//		��� ����
//
//		My grade is B
		
		System.out.println(gradeString.replace("A", "B"));
		System.out.println();
		
//		2. ���ڿ� �ڸ���
//		�Ʒ��� ���� ��ȭ��ȣ�� ����Ǿ� ���� �� ��¿��ÿ� ���� ���·� -�� �����Ͽ� ����ϼ���.
		String phoneNumber = "01012345678";
//		��� ����
//
//		010-1234-5678
		
		System.out.println(phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 7) + "-" + phoneNumber.substring(7));
		System.out.println();
		
//		3. ���ڿ� ���� ��ȯ
//		�Ʒ��� ���� ��������� ����� String �� ���� �� ���� ���̸� ��� �ϼ��� (�ѱ� ����)
		String birthString = "19950721";
//		��� ����
//
//		1995����� ���̴� 28��
		
		int year = Integer.parseInt(birthString.substring(0, 4));
		int age = 2022 - year + 1;
		
		System.out.println(year + "����� ���̴� " + age + "��");
		System.out.println();
		
		
//		4. ���ڿ� �˻�
//		���� �ܾ �Է� �ް� 'e' �� �� �� ��� �ִ��� ��� �ϼ���.
//		�Է� ����
//
//		�ܾ �Է��ϼ��� : elephant
//		��� ����
//
//		e�� ������ 2�� �Դϴ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("e�� ������ " + count + "�� �Դϴ�.");
		System.out.println();
		
//		5. �ܾ� �� ����
//		�Ʒ� ���ڿ��� �ܾ� ������ ��� �ϼ���.(�ߺ� ����)
		String sentence = "To be, or Not to Be. That Is The Question";
//		��� ����
//
//		�ܾ� ���� : 10
		
		String[] words = sentence.split(" ");
		System.out.println("�ܾ� ���� :" + words.length);
		
		
		scan.close();
		
		

	}

}
