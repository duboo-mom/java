package test.test01;

public class Test01 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(8);
		
		System.out.println("���� ���� : " + circle.calculateArea());
		System.out.println("���� �ѷ� : " + circle.calculateRound());
		System.out.println("�� 25���� ���� : " + circle.calculateArea(25));
		
		System.out.println();
		
		
		Product goods1 = new Product("�����", 1300, "2021-03-02");
		
		goods1.printInfo();
		goods1.printTotalPrice(5);
		goods1.printTotalPrice(13);
		if(goods1.availableSale("2022-10-28")) {
			System.out.println("�Ǹ� ���� ��ǰ");
		} else {
			System.out.println("�Ǹ� �Ұ�");
		}
		
	}

}
