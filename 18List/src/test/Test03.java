package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

//		1. id �ߺ� üũ
//		�Ʒ��� ���� ȸ�� ���Ե� id ����� �־�����.
//		["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//		id �� �Է� �ް�, id �� �ߺ� �ɰ�� "�ߺ��Դϴ�", �ߺ��� ���� ���� ��� "��밡��" �� ��� �ϼ���.
//		�Է� ����
//
//		id : hagulu
//		��� ����
//
//		�ߺ� �Դϴ�.
		
		List<String> idList = new ArrayList<>();
		idList.add("hagulu");
		idList.add("happy");
		idList.add("google");
		idList.add("bts");
		idList.add("iu");
		idList.add("cuteboy");
		
//		System.out.print("id : ");
//		Scanner scan = new Scanner(System.in);
//		String newId = scan.next(); // nextLine �ص���~
//		if(idList.contains(newId)) {
//			System.out.println("�ߺ� �Դϴ�.");
//		} else {
//			System.out.println("��� ����");
//		}
//		System.out.println();
		
//		2. ü�� ��� ��� ����
//		ü�� ��⿡�� �Ʒ��� ���� �ɻ����� ������ ���� �Ǿ����ϴ�.
//		�ְ����� �������� ������ ������ ������ ����� ���ϼ���.
//		for������ ������ ��
//
//		[8, 7, 6, 10, 9, 4]
//		��� ����
//
//		�ְ����� �������� ������ ��� ������ 7.5
		
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(8);
		scoreList.add(7);
		scoreList.add(6);
		scoreList.add(10);
		scoreList.add(9);
		scoreList.add(4);
		
		
		// sort�ؼ� �յ� �߶� �ɰŰ���...
		
//		Integer min = scoreList.get(0);
//		Integer max = scoreList.get(0);
//		for(int i = 1; i < scoreList.size(); i++) {
//			if(scoreList.get(i) < min) {
//				min = scoreList.get(i);
//			}
//			if(scoreList.get(i) > max) {
//				max = scoreList.get(i);
//			}
//		}
//		scoreList.remove(min);
//		scoreList.remove(max);
		
		scoreList.sort(Comparator.naturalOrder());
//		scoreList.remove(scoreList.size() - 1);
//		scoreList.remove(0);
		
		int sum = 0;
//		for(Integer score : scoreList) {
//			sum += score;
//		}
		
		// ������������..! 
		for(int i = 1; i < scoreList.size() - 1; i++) {
			sum += scoreList.get(i);
		}
		
		double average = sum / (double)(scoreList.size() - 2);
		
		System.out.println("�ְ����� �������� ������ ��� ������ " + average );
		System.out.println();	
		
		
//		3. �ζ� ��ȣ
//		Random Ŭ������ �̿��ؼ� 1~45 ������ 6���� �ߺ� ���� �ʴ� ���ڸ� ����Ʈ�� ���� �ϼ���.
//		����� ���ڸ� ���� �������� �����ؼ� ��� �ϼ���.
//		��� ����
//
//		[3, 6, 19, 26, 37, 44]
		
		Random random = new Random();
		List<Integer> lottoList = new ArrayList<>();
		
		// ����Ʈ�� ũ�Ⱑ 6���� �������� ������ ���ڸ� �̴´�.
		// ������ i�� ��Ʈ���ϴ°� �ϳ� ����� �۾���..!!
		while(lottoList.size() < 6) {
			Integer number = random.nextInt(45) + 1;
			if(!lottoList.contains(number)) {
				lottoList.add(number);
			}
		}
		
		
//		for(int i = 0; i < 6; i++) {
//			Integer number = random.nextInt(45) + 1;
//			
//			if(!lottoList.contains(number)) {
//				lottoList.add(number);
//			} else {
//				i--;
//			}
//			
//		}
		lottoList.sort(Comparator.naturalOrder());
		System.out.println(lottoList);
		System.out.println();
		
		
		
		
//		4. ȸ�� �߰��ϱ�
//		ȸ������ ����Ʈ�� �����.
//
//		[���, ����, ���, ����, �κ�]
//		���� �Է��� �̸��� ���� ����Ʈ�� �߰��Ѵ�.
//		���� ���������� ���� ��� ȸ���� �ڿ� ���ڸ� ���δ�.
//		(���� �Է��� �̸����� �ٸ� ����Ʈ�� �־�ΰ� �����ϱ�)
//
//		����Ű
//		����
//		����
//		�κ�
//		����
//		��� ����
//
//		[���, ����, ���, ����, �κ�, ����Ű, ����1, ����, �κ�1, ����2]
		
		List<String> nameList = new ArrayList<>();
		
		nameList.add("���");
		nameList.add("����");
		nameList.add("���");
		nameList.add("����");
		nameList.add("�κ�");
		
		List<String> addNameList = new ArrayList<>();
		addNameList.add("����Ű");
		addNameList.add("����");
		addNameList.add("����");
		addNameList.add("�κ�");
		addNameList.add("����");
		addNameList.add("�κ�");
		addNameList.add("����");
		addNameList.add("����");
		addNameList.add("�κ�");
		
		for(int i = 0; i < addNameList.size(); i++) {
			String addName = addNameList.get(i);
			// ���� ����1 ����2 ����3 ����4
			int count = 1;
			while(nameList.contains(addName)) {
				// ����1
				addName = addNameList.get(i) + count;
				count++;
			}
			
			nameList.add(addName);
		}
		
		System.out.println(nameList);
		

		// ��Ǯ��...��������� ������ �ƴ�.��..��....
//		int count = 1;
//		for(int i = 0; i < addNameList.size(); i++) {
//			
//			if(nameList.contains(addNameList.get(i))) {
//				
//				if(nameList.contains(addNameList.get(i) + count)) {
//					count++;
//					nameList.add(addNameList.get(i) + count);
//					break;
//				}
//				nameList.add(addNameList.get(i) + 1);
//					
//			} else {
//				nameList.add(addNameList.get(i));
//			}				
//		}
//		System.out.println(nameList);
		
		
		
		
		
	}

}
