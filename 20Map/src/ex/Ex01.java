package ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Map<String, String> memberMap = new HashMap<>();
		
		// value�� �ߺ� ����~~
		memberMap.put("hagulu", "���α�");
		memberMap.put("mizzong", "�ȹ���");
		memberMap.put("ohndar", "���α�");
		
		System.out.println(memberMap);

		// �� ����
		memberMap.put("ohndar", "���缮");
		System.out.println(memberMap);
		
		System.out.println(memberMap.get("mizzong"));
		String name = memberMap.get("ohndar");
		System.out.println(name);
		
		// �ʿ��� ���Ǵ� �޼ҵ�
		// Ư�� Ű�� �����ϴ��� Ȯ���ϴ� �޼ҵ�
		if(memberMap.containsKey("hagulu")) {
			System.out.println("�ش� Ű�� �ֽ��ϴ�.");
			System.out.println(memberMap.get("hagulu"));
		}
		
		// �ʿ� �ִ� ��� �� Ȯ���ϱ�
		// �ݺ��� ���
		// �ִ��� ������� �ʵ��� �ϼ���!!!!!
		// ���� ������ �ִ°� �ƴϰ� Ű���� �˰� �����͸� ����Ѵٴ� �����̴ϱ�..! ��ü�� �Ⱦ�°� �� ����� ����
		// ����ü�� �ݺ��Ҽ��� ����
		
		// �� �ȿ� ��� Ű ��� ����
		// key�� ���׸��� ��ġ��Ű��~
		// �� set���� ���ñ�..? -> �ߺ�����, ���� ��������ϱ�~
		// Ű�� ���� ��Ȳ�� ��~~�� ����.. Ű�� ���ؼ� ����� ��� ����!
		
		Set<String> keySet = memberMap.keySet();
		
		for(String id:keySet) {
			
			System.out.print(memberMap.get(id) + " ");
		}
		System.out.println();
		
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String id = iter.next();
			
			System.out.print(memberMap.get(id) + " ");
		}
		
		
		
	}

}
