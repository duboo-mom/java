package ex;

public class Ex01 {

	public static void main(String[] args) {

		// 추상 클래스는 객체 생성 불가능
//		Animal animal = new Animal();
		
		// dog라는 변수에 저장된건 객체의 주소!
		Dog dog = new Dog();
		dog.cry();
		
		// 객체는 하나고 두개의 변수로 관리하는 것!
		Dog dog2 = dog;
		
		Animal animal = new Dog();
		animal.cry();
		

	}

}
