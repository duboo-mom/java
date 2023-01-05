package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(); // 객체 만들기
		rect1.width = 10;
		rect1.height = 5;
		
		// 넓이 구하기
		int area = rect1.width * rect1.height;
		System.out.println(area);
		
		area = rect1.calculateArea();
		System.out.println("메소드를 통한 넓이 계산 " + area);
		
		int result = rect1.calculateArea(8);
		System.out.println("8개의 넓이 " + result);
		
		rect1.printRectangle();
		
	}

}
