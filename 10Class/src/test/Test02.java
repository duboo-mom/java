package test;

public class Test02 {

	public static void main(String[] args) {
	
		Circle circle1 = new Circle();
		                     // ������!
		circle1.radius = 8;
		
		double area = circle1.calculateArea();
		System.out.println("���� ���� : " + area);
		
		double round = circle1.calculateRound();
		System.out.println("���� �ѷ� : " + round);
		
		area = circle1.calculateArea(25);
		System.out.println("�� 25���� ���� : " + area);
		
		System.out.println();
		
		Product goods1 = new Product();
		goods1.name = "�����";
		goods1.price = 1300;
		goods1.expiration = "2022-01-01";
		
		goods1.printInfo();
		System.out.println();
		goods1.printTotalPrice(5);
		goods1.printTotalPrice(13);
		
		if(goods1.availableSale("2022-10-28")) {
			System.out.println("�Ǹ� ���� ��ǰ");
		} else {
			System.out.println("�Ǹ� �Ұ�");
		}
		

	}

}
