package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	
    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("���ѹα�", "����");
            put("����ũ", "�����ϰ�");
            put("����", "������");
            put("���þ�", "��ũ��");
            put("���⿡", "���");
            put("�����", "���������");
            put("������", "����Ȧ��");
            put("������", "����");
            put("������", "���帮��");
            put("�Ƹ���Ƽ��", "�ο��뽺���̷���");
            put("����Ʈ", "ī�̷�");
            put("�̶�", "�����");
            put("��Ż����", "�θ�");
            put("�Ϻ�", "����");
            put("�ʸ���", "���Ҷ�");
            put("�ɶ���", "���Ű");
            put("������", "�ĸ�");
            put("��Ű", "��ī��");
            put("ĳ����", "��Ÿ��");
            put("�ݷҺ��", "����Ÿ");
        }
    };

	public static void main(String[] args) {
//		1. �̾� ã��
//		Map�� Ű�� �̸�(���缮, �ڳ���, ������, ������, �̱���)�� �ְ�, ���� ��� 'X'�� �ʱ�ȭ �ϼ���.
//
//		������ '��'���� ��쿡�� ���� 'O'�� �ٲٰ� ��ü Map�� ��� �ϼ���.
//
//		�ݺ����� �̿��ؼ� �ٲټ���.
//		��� ����
//
//		{������=O, ������=X, ���缮=X, �̱���=O, �ڳ���=X}
		
		Map<String, String> memberMap = new HashMap<>();
//		Map<String, Character> memberMap = new HashMap<>();
//		memberMap.put("���缮", 'X');
		// char Ÿ������ �ص��Ǵµ� ��� ��������ǥ�� put �ؾߵ�
		memberMap.put("���缮", "X");
		memberMap.put("�ڳ���", "X");
		memberMap.put("������", "X");
		memberMap.put("������", "X");
		memberMap.put("�̱���", "X");
		
		Set<String> keySet = memberMap.keySet();
		for(String name:keySet) {
			if(name.startsWith("��")) {
				memberMap.put(name, "O");
			}
		}
		System.out.println(memberMap);

        
//        2. ���� ���߱� ����
//        �������� ���� ������ ���� �̸��� ���ߴ� ����
//        ����-������ ����ִ� 20���� ���� Map���� �־�����.
//        �� �� �������� 5���� ������ �־�����, ����ڷκ��� ���� �ش��ϴ� ������ �Է� �޴´�.
//        �������� �ƴ��� ������ �Է��� ��� ����Ѵ�.
//        ��� Ǯ�� ���� ����(100�� ����)�� ��µȴ�.

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
		
        Set<String> keys = capitalMap.keySet();
        // list �����ڿ� set ������ addó�� ����! �̰� �� ArrayList�ȿ� ����ִ�...
        List<String> keyList = new ArrayList<>(keys); // �����̸� List�� index�� ���� �� ��
        // TODO: �����ϱ�
        
        int score = 0;
        List<Integer> indexList = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			// 0 ~ 19
	        int index = rand.nextInt(keyList.size());
	        
	        // index �ߺ� ����
	        if(indexList.contains(index)) {
	        	i--;
	        } else {
	        	
	        	indexList.add(index);
	        	
	        	String country = keyList.get(index);
	        	System.out.print(country + "�� ���� �̸���?");
	        	String answer = scan.nextLine();
	        	if(capitalMap.get(country).equals(answer)) {
	        		System.out.println("����");
	        		score += 20;
	        	} else {
	        		System.out.println("Ʋ�Ƚ��ϴ�.");
	        	}
	        	
	    		// �ƴϸ� index�� �ϴ°Ÿ��� ���������ϰ� �ش� country�� ����Ʈ���� �������ָ� ��!!
	    		// keyList.remove(country);
	        	// �׷��� �ε����� ���� �ʿ����~~
	        	
	        }
	        
		}
		System.out.println("�� ������ " + score);
	

		
		
		scan.close();

	}

}
