package ex;

public class Ex01 {

	public static void main(String[] args) {

		// �߻� Ŭ������ ��ü ���� �Ұ���
//		Animal animal = new Animal();
		
		// dog��� ������ ����Ȱ� ��ü�� �ּ�!
		Dog dog = new Dog();
		dog.cry();
		
		// ��ü�� �ϳ��� �ΰ��� ������ �����ϴ� ��!
		Dog dog2 = dog;
		
		Animal animal = new Dog();
		animal.cry();
		

	}

}
