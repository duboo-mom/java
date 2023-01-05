package ex.ex01;

public class Student extends Person {
	
	// 이름, 생년월일, 학교이름
	private String school;		

	// 부모 클래스의 생성자가 호출되어야 하는데 지정을 안해주면 에러남
	
	public Student(String name, String birthday, String school) {
//		this.name = name;
//		this.birthday = birthday;
		super(name, birthday);	// <- 요게 부모클래스의 생성자를 호출하는 것. 그래서 부모클래스 생성자 라인이 젤 위! new Person("안미정", "19930203");	
		this.school = school;
	}
	
	// annotation 오버라이드에 맞지 않는 형태?면 에러 띄워줌
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("저는 " + this.school + "다닙니다.");
	}
	
	
	

}
