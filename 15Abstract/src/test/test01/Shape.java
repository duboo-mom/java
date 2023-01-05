package test.test01;

public abstract class Shape {
	
	protected String name;
	
	// 넓이
	public abstract double calculateArea();
		
	// 둘레
	public abstract double calculateRound();
	
	// 넓이와 둘레를 출력하는 기능
	public void printInfo() {
		System.out.println(name + "넓이 : " + this.calculateArea() + " 둘레 : " + this.calculateRound());
	}
	
		
}
