package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(); // ��ü �����
		rect1.width = 10;
		rect1.height = 5;
		
		// ���� ���ϱ�
		int area = rect1.width * rect1.height;
		System.out.println(area);
		
		area = rect1.calculateArea();
		System.out.println("�޼ҵ带 ���� ���� ��� " + area);
		
		int result = rect1.calculateArea(8);
		System.out.println("8���� ���� " + result);
		
		rect1.printRectangle();
		
	}

}
