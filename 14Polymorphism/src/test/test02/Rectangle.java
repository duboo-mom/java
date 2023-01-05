package test.test02;

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
//		this.angle = 4;
	}
	
	// ���� ����̴ϱ�.. calculateArea �� �̷������� ����
	@Override
	public double area() {
		return this.width * this.height;
	}
	
	@Override
	public void printArea() {
		System.out.println("�簢���� ���̴� " + this.area() + "cm^2 �Դϴ�.");
	}
	
}
