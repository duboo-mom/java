package ex;

public class Person {
	
	// �̸�, ����
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	// �θ�Ŭ������ ���� �޼ҵ�� annotation ���� �� ������!
	@Override	
	public String toString() {
		return this.name + " " + this.age;
	}
	
	
	public void printInfo() {
		System.out.println(this.name + " " + this.age);
	}
	
	

}
