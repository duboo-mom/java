package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		
//		1. List �����
//		����Ʈ�� �־��� ������ ��������.
//		20 3 5 84 17
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(20);
		integerList.add(3);
		integerList.add(5);
		integerList.add(84);
		integerList.add(17);
				
//		2. �ּҰ� ���ϱ�
//		List���� ���� ���� ���� ����ϼ���.
//		for���� ����ϼ���.(���� for�� X)
//		��� ����
//		3
		int min = integerList.get(0);
		for(int i = 1; i < integerList.size(); i++) {
			if(min > integerList.get(i)) {
				min = integerList.get(i);
			}
		}
		System.out.println(min);
		
		
//		3. �հ� ���ϱ�
//		List ��ҵ��� �� �հ踦 ���ϼ���.
//		Iterator�� ����ϼ���.
//		��� ����
//		129
		
		// ���ͷ����� iter�� �ϳ��� ������ �������..!! ����**		
		Iterator<Integer> iter = integerList.iterator();
//		int sum = 0;
		Integer sum = 0;
		while(iter.hasNext()) {
			Integer number = iter.next();
			sum += number;
		}
		System.out.println(sum);
		
		
		
//		4. ����Ʈ ����
//		List ���� ¦�� �� ���� ��� �����ϰ� ��ü ���� ��� �ϼ���.
//		[3, 5, 17]
		
		// ������ �Ȱ��� ���� iterator ����ϸ�..! 
		// list �ε��� ������ �� ���·� ���� ���°ű⶧����.. �� �ڿ��� Ȯ���ϴ��� ������Ǵ� ������ ����
		// �ٽ� ���ͷ����� �ʱ�ȭ
		
		iter = integerList.iterator();
		while(iter.hasNext()) {
//			int number = iter1.next();
			// �̷��� int �ڷ����� �־ �����ȳ�!!
			Integer integer = iter.next();
			
			if(integer % 2 == 0) {
				iter.remove();
			}					
		}
		System.out.println(integerList);
		

		// for������ ������ ������ ���ͷ�����!!!
//		for(int i = 0; i < integerList.size(); i++) {
//			if(integerList.get(i) % 2 == 0) {
//				integerList.remove(i);
//				i--;
//			}
//		}
//		System.out.println(integerList);
		
		
	}
}
