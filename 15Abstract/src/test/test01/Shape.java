package test.test01;

public abstract class Shape {
	
	protected String name;
	
	// ����
	public abstract double calculateArea();
		
	// �ѷ�
	public abstract double calculateRound();
	
	// ���̿� �ѷ��� ����ϴ� ���
	public void printInfo() {
		System.out.println(name + "���� : " + this.calculateArea() + " �ѷ� : " + this.calculateRound());
	}
	
		
}
