package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
				
		productList.add(new Product("�����", 1200, 150));
		productList.add(new Product("������", 850, 30));
		productList.add(new Product("�Ŷ��", 800, 15));
		productList.add(new Product("õ��ǥ����", 1500, 0));
		
		
		// Q1
		System.out.println(productList);
		System.out.println();
		
		
		// Q2
		// ����for���� ���� �Ұ�..!!!!
		// �����Ҷ� ���ͷ����� ���..^^^^
		Iterator<Product> iter = productList.iterator();
		while(iter.hasNext()) {
			Product product = iter.next();
			if(product.getStock() == 0) {
				// iter�� �ٶ󺸴� �� ���ӿ��!!!!
				iter.remove();
			}
		}
		System.out.println(productList);
		System.out.println();
		
		
		// Q3
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��ǰ�� : ");
		String name = scan.nextLine();
		System.out.print("���� : ");
		int count = scan.nextInt();
				
		// ���� for�� ����� ������ Ǯ��
		for(Product product:productList) {
			
			String productName = product.getName();
			if(productName.equals(name)) {
				int price = product.getPrice();
				System.out.println("���� : " + (price * count) + "��");
				int stock = product.getStock() - count;
				product.setStock(stock);
			}
		}
		
//		for(int i = 0; i < productList.size(); i++) {
//			
//			Product product = productList.get(i);						
//			
//			if(product.getName().equals(name)) {
//				int totalPrice = count * product.getPrice();
//				int before = product.getStock();
//				
//				// �׳� product.setStock �ص���! �ᱹ ����Ű�� �ּ�? ������ �Ȱ����ϱ�~
//				// ���� �򰥸��� �������� ����12 �̰ǵ�...�װ� String�� �ٷ�� ���̽��� �� �ٸ�..!
//				// productList.get(i).setStock(before - count);
//				
//				product.setStock(before - count);
//				System.out.println("���� : " + totalPrice + "��");
//				break;
//			}
//		}
		
		System.out.println(productList);
		System.out.println();

		
		// Q4
		// ���� for���� �̷��� �ѹ��� �� ���ƺ���!!
		
//		for(Product product : productList) {
//			if(product.getStock() <= 30) {
//				System.out.println(product);
//			}
//		}
		
		// ���ͷ����� ����� ���޴� Ǯ��
		iter = productList.iterator();
		
		while(iter.hasNext()) {
			
			Product product = iter.next();
			if(product.getStock() <= 30) {
				System.out.println(product);
			}
			
		}
		
		
		
		scan.close();
		
		
	}

}
