package test;

public class Triangle {
	
	// �غ�, ����
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		double area = this.width * this.height * 0.5;
		return area;
	}
	
	@Override
	public String toString() {
		return "�غ� : " + this.width + " ���� : " + this.height + " ���� : " + this.calcArea();
	}

}
