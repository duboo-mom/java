package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		// 객체 만들기 불가능~
//		Animal animal = new Animal();
		// dog 변수에 저장되는건 Dog라는 객체의 주소!! cac736f
		Dog dog = new Dog();
		dog.cry();
		
		System.out.println(dog);
		
		Animal animal = dog;
		animal.eat();
		// 그러니까 animal이란 변수에도 Dog의 객체 주소가 동일하게 저장됨
		System.out.println(animal);

	}

}
