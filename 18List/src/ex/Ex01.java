package ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		// list�� Ŭ������ ������ ����
//		ArrayList<Integer> integerList1 = new ArrayList<>();
		
//		LinkedList<Integer> integerList2 = new LinkedList<>();
		
		// upcasting�� ���� List ������ �� ���� ����!!
		// <> ���ʸ��� ����Ŭ���� �����Ѵ�θ� �Է��Ҽ� ����
		List<Integer> integerList = new ArrayList<>();
		
		// �� �߰��ϱ�
		integerList.add(4);
		integerList.add(8);
//		integerList.add("adsf"); - Integer��� �����ϲ�!!
//		toString�� override�Ǿ� �־ ���� ���ϰ� ��µǴ°���
		System.out.println(integerList);
		
		// �� �����ϱ� - index, ��
		integerList.add(1, 5);
		System.out.println(integerList);
		
		// �� ����
		integerList.set(2, 6);
		
		// �ϳ��� �� ������
		Integer number = integerList.get(2);
		System.out.println(number);
		
		// �� �����
		integerList.remove(1);
		System.out.println(integerList);
		
		
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("bear");
		
		System.out.println(stringList);
		
		// ��� ��� �����
		stringList.clear();
		System.out.println(stringList);
		
		
		
		

	}

}
