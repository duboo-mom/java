package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Person me = new Person("�ȹ���", "19930203");
//		me.name = "�ȹ���";
//		me.birthday = "19930203";
		
		me.introduce();
		
		System.out.println(me.getName());
		
		me.setName("�ȹ̵�");
		
		me.introduce();
		

	}

}
