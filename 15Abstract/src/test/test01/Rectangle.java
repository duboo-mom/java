package test.test01;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super.name = "»ç°¢Çü";
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return this.width * this.height;
	}
	
	@Override
	public double calculateRound() {
		return (this.width + this.height) * 2.0;
	}

}
