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
		
		// 파이썬 동시성 프로그래밍 같은 느낌인건가..ㅎ.ㅎ??;;
		
		// 11/11

		
		ThreadImplements threadImpl1 = new ThreadImplements("###");
		ThreadImplements threadImpl2 = new ThreadImplements("@@@");
		
		// 1. 쓰레드 객체 만들기
		// Thread는 기본 클래스 중 하나 
		// ThreadImplements 이거랑 Thread클래스랑 연결하려면?
		// Thread 생성자에 Runnable를 implement 한 클래스만 전달 받도록
		Thread thread1 = new Thread(threadImpl1);
		Thread thread2 = new Thread(threadImpl2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("!!!!!");
		
		
		// 특정 쓰레드가 끝나야 실행되도록
		try {
			thread1.join();
			thread2.join();
			// 같은 exception 처리하는거면 같은 try에 넣어도 오케이~
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("$$$$");
		
		
	}

}
