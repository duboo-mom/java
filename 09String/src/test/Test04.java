package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		1. ���ڿ� �˻�
//		�����̸��� ����� ���ڿ� �迭���� jpg ������ �� ������ ����ϼ���.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		��� ����
//
//		jpg ���� ���� : 3
		
		int count = 0;
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith(".jpg")) {
				count++;
			}
		}
		System.out.println("jpg ���� ���� : " + count);
		
		
//		2. �� �ܾ� ����
//		���� �ܾ� ��� ����.
//		�Ʒ��� ���� 4���� ������ �����ϰ�, ���ڿ��� �������� �Է��� �޴´�.
//		100�� ���� �������� �� ������ ����Ѵ�.
//		1. �¸��� ����� �Է��ϼ��� :
//		2. ����� ����� �Է� �ϼ��� :
//		3. ��ǻ�͸� ����� �Է� �ϼ��� :
//		4. ��Ʈ���� ����� �Է��ϼ��� :
//		�Է� ����
//
//		1. �¸��� ����� �Է��ϼ��� :victory
//		2. ����� ����� �Է� �ϼ��� :lobe
//		3. ��ǻ�͸� ����� �Է� �ϼ��� :computer
//		4. ��Ʈ���� ����� �Է��ϼ��� :notebook
//		��� ����
//
//		������ 75�� �Դϴ�.

		Scanner scan = new Scanner(System.in);
		String[] word = new String[4];
		
		System.out.print("1. �¸��� ����� �Է��ϼ��� : ");
		word[0] = scan.nextLine();
		System.out.print("2. ����� ����� �Է� �ϼ��� : ");
		word[1] = scan.nextLine();
		System.out.print("3. ��ǻ�͸� ����� �Է� �ϼ��� : ");
		word[2] = scan.nextLine();
		System.out.print("4. ��Ʈ���� ����� �Է��ϼ��� : ");
		word[3] = scan.nextLine();
		
		String[] answer = {"victory", "love", "computer", "notebook"};
		
		count = 0;
		for(int i = 0; i < word.length; i++) {
			if(word[i].equals(answer[i])) {
				count += 25;
			}
		}
		System.out.println("������ " + count + "�� �Դϴ�.");
		
		
		
		
//		3. ���ڿ� �˻�
//		ȸ�� ��ΰ� �Ʒ��� ���� ���ڿ��� ���� �Ǿ� �ִ�. ���� �̸��� �� �� ���� ����ϼ���.
		String membersString = "������:�۰�ȣ:���켺:�̹�ȣ:�۰�ȣ:�̹���:�̹���:������:�̺���:������";
//
//		��� ����
//
//		���� ���� �� : 3
		
		String[] members = membersString.split(":");
//		String[] overlap = new String[members.length];
//		count = 0;
//		
//		for(int i = 0; i < members.length; i++) {
//			for(int j = i + 1; j < members.length; j++) {
//				int n = 0;
//				if(members[i].equals(members[j])) {
//					count++;							
//				}
//			}
//		}
//		System.out.println("�������� �� : " + count);

		// ���޴� Ǯ��

		
		count = 0;
		
		for(int i = 0; i < members.length; i++) {
			
			String targetName = members[i];
			for(int j = i + 1; j < members.length; j++) {
				
				if(targetName.equals(members[j])) {
					count++;
					break;
				}
				
			}
		}

		

		
		scan.close();
		
		
		
		
		
	}

}
