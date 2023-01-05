package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
	
		// list�� �����ϰ� �������
		// Listó�� Set�� �������̽��� �ְ�... ���߿� HashSet ���̻����
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(3);
		set1.add(5);
		System.out.println(set1);
		
		// �ߺ� �ȵ�
		set1.add(3);
		System.out.println(set1);
		
		// ���ĵ�
		set1.add(2);
		System.out.println(set1);
		
		
		// Set�� ����!!
		// �����δ� list�� �ַ� ���������..!
		// 1. �ߺ��� ���� ������� �ʴ´�.
		// 2. ���� ������ ������� �ʴ´�.(index ������ ����)
		
		for(Integer number:set1) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			
			System.out.print(number + " ");
		}
		System.out.println();
		
	}

}
