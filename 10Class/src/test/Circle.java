package test;

public class Circle {
	
	int radius;

//	double pi = 3.14;
	
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
