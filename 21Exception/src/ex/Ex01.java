package ex;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		String string = null;
		
		int[] intArray = new int[5];
		

		// try-catch 
		//  catch(NullPointerException e) 여기에서 NullPointerException이게 클래스
		try {
//			string.length();
			
			intArray[8] = 10;
		} catch(Exception e) {
			System.out.println("예외 발생!~!~!");
		}
			
//		} catch(NullPointerException e) {
//			System.out.println("null 포인터 예외 발생!!!");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index 범위 초과 예외 발생!!");
//		}
		
		// 특정 메소드를 사용할때, 주의가 필요할때 주로 사용함!! 
		// Thread.sleep의 경우 무조건 try-catch로 묶던... 아니면 다른 방법으로 예외처리 필수
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// throws InterruptedException main함수에 추가됨 -> 메소드 만든쪽으로 던져버리기
		// 이거보단 try-catch로 예외처리 하는게 좋음
		Thread.sleep(1000);
		

	}

}
