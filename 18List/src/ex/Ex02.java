package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
		// ����Ʈ�� �ݺ���!!
		
		List<String> fruitList = new ArrayList<>();
		
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");
		fruitList.add("banana");
		fruitList.add("banana");
		
		
		// index ����� �ݺ���
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.print(fruitList.get(i) + " ");
			
			// �ٳ����� ������ ����
//			if(fruitList.get(i).equals("banana")) {
//				fruitList.remove(i);
//			}
		}
		System.out.println();
		System.out.println(fruitList);
		// index������� �����ϸ� i++�� ������ �ڷ� �Ѿ���� �����ϸ� �� ��ĭ��
		// ������ϱ�!! �������...!!
		
		// ���� for��
		// �ٸ� ������ foreach��� ���� �θ�
		// list�ȿ� �ִ� ���� �տ��ִ� ���� fruit�� �ϳ��� ����ǰ� ����ǰ� ������ ���� ��
		// ...������ �������� ���� ������
		// ����Ʈ ��ü �Ⱦ���� ����ϰ�..
		// ���� for���ȿ����� ����Ʈ ���� �Ұ���!!
		for(String fruit:fruitList) {
			System.out.print(fruit + " ");
			
//			if(fruit.equals("banana")) {
//				fruitList.remove(fruit); // ����̵Ǵ� ��ü�� �Է��ص� ��
//			}
			
		}
		System.out.println();
		
		
		// Iterator (���ͷ�����)
		// list �Ǿտ� index0 ���� �տ� ����������� iter��� �����ڷ�
		// �״��� ĭ�� ���� �ִ��� Ȯ�� = boolean
		// �����Ҷ� ������!!
		// �ݺ��� �ȿ��� list ��� �����Ϸ��� ������ ���ͷ�����!!
		// iter�� remove�ϸ� �ٷ� �ؽ�Ʈ �ϴ°� �ƴϱ� �׾��� �ٽùٶ����
		// �������� �Ⱦ�� ������!!
		
		// ����Ϸ��� ��ü �������ϰ� ����Ʈ ��ü�� ������ Ÿ������
		Iterator<String> iter = fruitList.iterator();
		while(iter.hasNext()) {
			
			// iter.next()�� �����ϴ� index�� �������� ����Ŵ
			String fruit = iter.next();
			System.out.print(fruit + " ");
			
			if(fruit.equals("banana")) {
				iter.remove();
			}
			
		}
		System.out.println();
		System.out.println(fruitList);
		
		
		
		
	}

}
