package ex.ex01;

public class Person {
	
	// 속성, 멤버변수 정하는게 1번임
	// 이름, 생년월일 (19990403)
	private String name;
	private String birthday;
	
	// 생성자는 특수한 형태의 메소드! 리턴타입 없음, 어디서든 사용하게!
	// this.멤버변수 = 파라미터값
	// 보통 생성자 안에 파라미터값은 이름 똑같게함!
	public Person(String name, String birthday){
		this.name = name;
		this.birthday = birthday;
	}
		
	// 자기 소개 기능
	public void introduce() {
		System.out.println("안녕하세요 저는 " + name + "입니다.");
		System.out.println("제 생년월일은 " + birthday + "입니다.");
	}
	
	// 이름 getter
	public String getName() {
		return this.name;
		// 그냥 name해도 되긴하는데 멤버변수를 불러온다는 것을 확실하게..!
	}
	
	// 이름 수정 기능
	// setter 파라미터 값 이름 보통 동일하게~
	public void setName(String name) {
		this.name = name;
	}
	

}
