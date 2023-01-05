package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		
		Dog dog = new Dog();
		dog.eat();
		dog.cry();
		dog.lash();
		
		Cat cat = new Cat();
		cat.eat();
		cat.cry();
		cat.grooming();
		
		// Up Casting: 자식 -> 부모
		Animal animal2 = new Dog();
		animal2.eat();
//		animal2.lash(); 에러남
		
		Animal animal3 = cat;
		animal3.eat();
//		animal3.grooming(); 이거도 animal은 Animal 변수니까! 불가능
		
		// 배열에 저장하기
		Animal[] animals = new Animal[2];
		
		animals[0] = dog;
		animals[1] = cat;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry();
			
			// 해당 객체가 Dog 클래스로 만들어진 객체인지 확인
			if(animals[i] instanceof Dog) {
				Dog dog3 = (Dog)animals[i];
				dog3.lash();
			}
			// 강아지 꼬리 살랑살랑

			
		}
		
		cryAnimal(dog);
		
		// animal2 로 lash 호출하기
		// Down Casting (Dog)으로...
		
		Dog dog2 = (Dog)animal2;
		dog2.lash();
		
		
		
	}
	
	
	
	// 동물을 울게하는 함수
	// 동물 객체를 전달 받고 울린다.
	
	public static void cryAnimal(Animal animal) {
		animal.cry();
		
	}
	
	
	
	
	
	
	

}
