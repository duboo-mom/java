package ex;

public class Ex01 {

	public static void main(String[] args) {

//		for(int i = 0; i < 5; i++) {
//			System.out.println("@@@");
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("###");
//		}

//		ThreadExtends thread1 = new ThreadExtends("###");
//		ThreadExtends thread2 = new ThreadExtends("@@@");
//		
//		thread1.start();
//		thread2.start();
//		
//		System.out.println("!!!!!");
		
		// ���̽� ���ü� ���α׷��� ���� �����ΰǰ�..��.��??;;
		
		// 11/11

		
		ThreadImplements threadImpl1 = new ThreadImplements("###");
		ThreadImplements threadImpl2 = new ThreadImplements("@@@");
		
		// 1. ������ ��ü �����
		// Thread�� �⺻ Ŭ���� �� �ϳ� 
		// ThreadImplements �̰Ŷ� ThreadŬ������ �����Ϸ���?
		// Thread �����ڿ� Runnable�� implement �� Ŭ������ ���� �޵���
		Thread thread1 = new Thread(threadImpl1);
		Thread thread2 = new Thread(threadImpl2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("!!!!!");
		
		
		// Ư�� �����尡 ������ ����ǵ���
		try {
			thread1.join();
			thread2.join();
			// ���� exception ó���ϴ°Ÿ� ���� try�� �־ ������~
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("$$$$");
		
		
	}

}
