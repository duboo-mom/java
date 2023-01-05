package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
				
		productList.add(new Product("새우깡", 1200, 150));
		productList.add(new Product("육개장", 850, 30));
		productList.add(new Product("신라면", 800, 15));
		productList.add(new Product("천마표팝콘", 1500, 0));
		
		
		// Q1
		System.out.println(productList);
		System.out.println();
		
		
		// Q2
		// 향상된for문은 수정 불가..!!!!
		// 삭제할땐 이터레이터 사용..^^^^
		Iterator<Product> iter = productList.iterator();
		while(iter.hasNext()) {
			Product product = iter.next();
			if(product.getStock() == 0) {
				// iter가 바라보는 거 ㅈㅣ우기!!!!
				iter.remove();
			}
		}
		System.out.println(productList);
		System.out.println();
		
		
		// Q3
		
		Scanner scan = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = scan.nextLine();
		System.out.print("개수 : ");
		int count = scan.nextInt();
				
		// 향상된 for문 사용한 선생님 풀이
		for(Product product:productList) {
			
			String productName = product.getName();
			if(productName.equals(name)) {
				int price = product.getPrice();
				System.out.println("가격 : " + (price * count) + "원");
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
//				// 그냥 product.setStock 해도됨! 결국 가리키는 주소? 방향은 똑같으니까~
//				// 내가 헷갈린건 동명이인 루피12 이건디...그건 String을 다루는 케이스라 좀 다름..!
//				// productList.get(i).setStock(before - count);
//				
//				product.setStock(before - count);
//				System.out.println("가격 : " + totalPrice + "원");
//				break;
//			}
//		}
		
		System.out.println(productList);
		System.out.println();

		
		// Q4
		// 향상된 for문은 이렇게 한바퀴 쭉 돌아볼때!!
		
//		for(Product product : productList) {
//			if(product.getStock() <= 30) {
//				System.out.println(product);
//			}
//		}
		
		// 이터레이터 사용한 스앵님 풀이
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
