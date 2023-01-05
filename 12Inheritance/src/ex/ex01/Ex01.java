package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Person me = new Person("안미정", "19930203");
		me.introduce();

		Student student = new Student("안미정", "20001202", "낙성대학교"); 
		student.introduce();
		
	}

}
