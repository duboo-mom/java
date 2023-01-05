package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(5);
		numberList.add(19);
		numberList.add(13);
		numberList.add(8);
		numberList.add(25);
		numberList.add(3);
		
		System.out.println(numberList);
		
		// ���� �����ϴ���?
		System.out.println(numberList.contains(8));
		// boolean ���� �����ϴϱ� �ַ� �̷��� ���ǹ��� ���
		if(numberList.contains(25)) {
			System.out.println("25�� ���Ե�");
		}
		
		
		// ����
		// sort�� ���� ����Ʈ�� ������ �ڹٲ�ϱ� ����!!!
		// ��������
		numberList.sort(Comparator.naturalOrder());
		System.out.println(numberList);
		
		// ��������
		numberList.sort(Comparator.reverseOrder());
		System.out.println(numberList);
		
		
		// ����Ʈ�� ����ִ��� Ȯ��
		if(numberList.isEmpty()) {
			System.out.println("�������");
		}
		
		// ����Ʈ�� ������� ������ Ȯ�� - �տ� !
		if(!numberList.isEmpty()) {
			System.out.println("������� ����");
		}
		
		
		

	}

}
