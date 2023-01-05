package test;

public class Test01 {

	public static void main(String[] args) {
		
		ThreadImplementsZoo animal1 = new ThreadImplementsZoo("¾îÈï");
		ThreadImplementsZoo animal2 = new ThreadImplementsZoo("À½¸Þ~");
		ThreadImplementsZoo animal3 = new ThreadImplementsZoo("È÷À×");
		
		Thread thread1 = new Thread(animal1);
		Thread thread2 = new Thread(animal2);
		Thread thread3 = new Thread(animal3);

		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
		thread3.start();

	}

}
