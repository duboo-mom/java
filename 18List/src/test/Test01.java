package test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
//		1. List �����
//		����Ʈ�� �־��� ������ �ְ� ����ϼ���.
//		3, 8, 9, 4, 2, 1, 7, 5
//		��� ����
//
//		[3, 8, 9, 4, 2, 1, 7, 5]
		
		List<Integer> integerList1 = new ArrayList<>();
		integerList1.add(3);
		integerList1.add(8);
		integerList1.add(9);
		integerList1.add(4);
		integerList1.add(2);
		integerList1.add(1);
		integerList1.add(7);
		integerList1.add(5);
		System.out.println(integerList1);
		
		
//		2. �� �����ϱ�
//		List�� �׹�° ���� 6���� �ٲٰ� ��ü�� ����ϼ���.
//		��� ����
//
//		[3, 8, 9, 6, 2, 1, 7, 5]
		
		integerList1.set(3, 6);
		System.out.println(integerList1);
		
		
//		3. �� �����ϱ�
//		List�� ����° ��ġ�� 10�� ���� �ϰ� ��ü�� ��� �ϼ���.
//		[3, 8, 10, 9, 6, 2, 1, 7, 5]
		
		integerList1.add(2, 10);
		System.out.println(integerList1);
		
//		4. �� �����ϱ�
//		List���� 8�� 7�� �����ϰ� ��ü�� ����ϼ���.
//		��� ����
//
//		[3, 10, 9, 6, 2, 1, 5]
//		�ڿ������� ����� �ε��� �տ��� ����ȵǴϱ� ���~
		integerList1.remove(7);
		integerList1.remove(1);
		System.out.println(integerList1);
		
		

	}

}
