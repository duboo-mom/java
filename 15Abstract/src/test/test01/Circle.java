package test.test01;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(int radius) {
		super.name = "¿ø";
		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		return radius * radius * 3.14;
	}

	@Override
	public double calculateRound() {
		
		return radius * 2 * 3.14;
	}

}
