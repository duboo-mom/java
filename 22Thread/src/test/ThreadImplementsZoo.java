package test;

// 스앵님은 그냥 class이름 Animal로 함ㅋㅎ~ 굳이 이름에 ThreadImplement 안해도 되는듯!
public class ThreadImplementsZoo implements Runnable {
	
	private String cry;
	
	public ThreadImplementsZoo(String cry) {
		this.cry = cry;
	}
	
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(this.cry);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
