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
		
		// Up Casting: �ڽ� -> �θ�
		Animal animal2 = new Dog();
		animal2.eat();
//		animal2.lash(); ������
		
		Animal animal3 = cat;
		animal3.eat();
//		animal3.grooming(); �̰ŵ� animal�� Animal �����ϱ�! �Ұ���
		
		// �迭�� �����ϱ�
		Animal[] animals = new Animal[2];
		
		animals[0] = dog;
		animals[1] = cat;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry();
			
			// �ش� ��ü�� Dog Ŭ������ ������� ��ü���� Ȯ��
			if(animals[i] instanceof Dog) {
				Dog dog3 = (Dog)animals[i];
				dog3.lash();
			}
			// ������ ���� ������

			
		}
		
		cryAnimal(dog);
		
		// animal2 �� lash ȣ���ϱ�
		// Down Casting (Dog)����...
		
		Dog dog2 = (Dog)animal2;
		dog2.lash();
		
		
		
	}
	
	
	
	// ������ ����ϴ� �Լ�
	// ���� ��ü�� ���� �ް� �︰��.
	
	public static void cryAnimal(Animal animal) {
		animal.cry();
		
	}
	
	
	
	
	
	
	

}
