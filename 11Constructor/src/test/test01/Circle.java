package test.test01;

public class Circle {
	
	private int radius;

	public Circle(int radius){
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	double calculateArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	double calculateRound() {
		double round = 2 * 3.14 * radius;
		return round;
	}
	
	double calculateArea(int count) {
		double area = calculateArea() * count;
		return area;
	}
	

}