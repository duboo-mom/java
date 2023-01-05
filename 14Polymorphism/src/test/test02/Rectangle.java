package test.test02;

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
//		this.angle = 4;
	}
	
	// 보통 기능이니까.. calculateArea 머 이런식으로 하잣
	@Override
	public double area() {
		return this.width * this.height;
	}
	
	@Override
	public void printArea() {
		System.out.println("사각형의 넓이는 " + this.area() + "cm^2 입니다.");
	}
	
}
