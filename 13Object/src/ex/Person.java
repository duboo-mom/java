package ex;

public class Person {
	
	// 이름, 나이
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	// 부모클래스에 없는 메소드면 annotation 했을 때 에러남!
	@Override	
	public String toString() {
		return this.name + " " + this.age;
	}
	
	
	public void printInfo() {
		System.out.println(this.name + " " + this.age);
	}
	
	

}
