package ex.ex01;

public class Person {

	// 이름, 생년월일
//	protected String name;
//	protected String birthday;
	private String name;
	private String birthday;
	
	
	// 기본 생성자
//	public Person() {
//		System.out.println("Person 생성");
//	}
	
	public Person(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	// 출력 기능
	public void introduce() {
		System.out.println("저는 " + this.name + "입니다.");
		System.out.println("생년 월일은 " + this.birthday + " 에요");
	}
	
	
}
