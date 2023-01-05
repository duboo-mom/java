package test.test01;

public class Test01 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(8);
		
		System.out.println("원의 넓이 : " + circle.calculateArea());
		System.out.println("원의 둘레 : " + circle.calculateRound());
		System.out.println("원 25개의 넓이 : " + circle.calculateArea(25));
		
		System.out.println();
		
		
		Product goods1 = new Product("새우깡", 1300, "2021-03-02");
		
		goods1.printInfo();
		goods1.printTotalPrice(5);
		goods1.printTotalPrice(13);
		if(goods1.availableSale("2022-10-28")) {
			System.out.println("판매 가능 상품");
		} else {
			System.out.println("판매 불가");
		}
		
	}

}
