package ex;

public class Rectangle {
	
	int width;
	int height;
	
	// ���
	// �Լ�
	// ���̸� ���ϴ� ���
	// Ŭ���� ���� ������ ����ҰŰ� �Է¹����� ������ () ���� ����~
	int calculateArea() {
		int area = width * height;
		return area;
	}
	
	// ������ ���� ���̸� ���ϴ� ���
//	int calculateAreaByCount(int count) {
//		int area = width * height * count;
//		return area;
//	}
	
	// int calculateArea(int count) = ���� �̸����� �޼ҵ� ���� �� ����!! ��! �Ķ���Ͱ��� �ٸ��� ������
	// overloading �����ε�
	int calculateArea(int count) {
		int area = calculateArea() * count;
		return area;
	}
	
	
	// ��� ������ ���� ������ִ� ���
	void printRectangle() {
		System.out.println("���� : " + width + " ���� : " + height);
	}
	

}
