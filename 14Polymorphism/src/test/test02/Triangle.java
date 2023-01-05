package test.test02;

public class Triangle extends Shape {
	
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
//		this.angle = 3;
	}
	
	@Override
	public double area() {
		return this.width * this.height / 2.0;
	}
	
	@Override
	public void printArea() {
		System.out.println("삼각형의 넓이는 " + this.area() + "cm^2 입니다.");
	}
	

}
