package test.test02;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return 3.14 * this.radius * this.radius;
	}
	
	
	@Override
	public void printArea() {
		System.out.println("원의 넓이는 " + this.area() + "cm^2 입니다.");
	}
	

}
