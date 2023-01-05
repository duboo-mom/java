package test.testTeacher;

public class Test {

	public static void main(String[] args) {
		
		
		Animal tiger = new Animal("����!");
		Animal cow = new Animal("����~");
		
		Animal horse = new Animal("����~");
		
		Thread tigerCry = new Thread(tiger);
		Thread cowCry = new Thread(cow);
		
		Thread horseCry = new Thread(horse);
		
		
		tigerCry.start();
		cowCry.start();
		
		try {
			tigerCry.join();
			cowCry.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		horseCry.start();

	}

}
