package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
	
//		1. �ڷ� �Է�
//		�Ʒ� ���� �̸��� ���� ������ Map �����ϰ� ��� �ϼ���.
//		���� : 90, ���� : 85, ���� : 90, ��ȸ : 80, ���� : 100
//		��� ����
//
//		{����=90, ��ȸ=80, ����=100, ����=85, ����=90}
		
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("����", 90);
		scoreMap.put("����", 85);
		scoreMap.put("����", 90);
		scoreMap.put("��ȸ", 80);
		scoreMap.put("����", 100);
		
		System.out.println(scoreMap);
		
//		2. �� ����
//		��ȸ ������ ü���� ������ �־ 5���� �� �÷��� �Ѵ� ���� �ٲٰ� ��� �ϼ���.
//		��� ����
//
//		{����=90, ��ȸ=85, ����=100, ����=85, ����=90}
		
		int newScore = scoreMap.get("��ȸ") + 5;
		scoreMap.put("��ȸ", newScore);
		System.out.println(scoreMap);
		
		
//		3. �� ã��
//		������� �Է� �ް�, ������ ��� �ϼ���.
//		��, �Է��� ������ ���� ��� "�ڷ� ����"�� ��� �ϼ���.
//		�Է� ����
//
//		��ȸ �� ������� �Է��ϼ��� : ����
//		��� ����
//
//		���� : 90
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȸ �� ������� �Է��ϼ��� : ");
		String name = scan.nextLine();
		if(scoreMap.containsKey(name)) {
			System.out.println(name + " : " + scoreMap.get(name));
		} else {
			System.out.println("�ڷ� ����");
		}
		
		
//		4. �� ã��
//		90�� �̻��� ��� ������ ��� �ϼ���.
//		��� ����
//
//		���� ���� ���� 
		
		Set<String> keySet = scoreMap.keySet();
		
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			
			if(scoreMap.get(key) >= 90) {
				System.out.print(key + " ");
			}
		}
		System.out.println();
		
		
//		5. �� Ȯ��
//		100�� ������ �ִ� �л����� ���� ��� ���� �ֱ�� �Ͽ���.
//		���� ������� ���� �� �ִ��� ����ϼ���.
//		��� ����
//
//		���� ����
		
		for(String key:keySet) {
			if(scoreMap.get(key) == 100) {
				System.out.println("���� ����");
				break; // �ݺ������� ���̻� �ʿ������ ~ �ݺ�Ƚ�� ���̵���~~
			}
		}
		
		
		// �����ؼ� ������..! value ������� �� �Ϸ����ϸ� �ȵ�
		if(scoreMap.containsValue(100)) {
			System.out.println("���󰡴�");
		}
		
		
		

	}

}
