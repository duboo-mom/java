package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		// ��ü ����� �Ұ���~
//		Animal animal = new Animal();
		// dog ������ ����Ǵ°� Dog��� ��ü�� �ּ�!! cac736f
		Dog dog = new Dog();
		dog.cry();
		
		System.out.println(dog);
		
		Animal animal = dog;
		animal.eat();
		// �׷��ϱ� animal�̶� �������� Dog�� ��ü �ּҰ� �����ϰ� �����
		System.out.println(animal);

	}

}
