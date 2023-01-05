package ex;

public class ThreadImplements implements Runnable {
	
	private String message;
	
	public ThreadImplements(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		
		// message �� 10�� ����ϱ�
		for(int i = 0; i < 10; i++) {
			
			System.out.println(this.message);
			
			// 0.5�� �����
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
