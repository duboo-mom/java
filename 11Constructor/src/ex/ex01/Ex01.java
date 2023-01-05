package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Person me = new Person("안미정", "19930203");
//		me.name = "안미정";
//		me.birthday = "19930203";
		
		me.introduce();
		
		System.out.println(me.getName());
		
		me.setName("안미동");
		
		me.introduce();
		

	}

}
