package ex;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		String string = null;
		
		int[] intArray = new int[5];
		

		// try-catch 
		//  catch(NullPointerException e) ���⿡�� NullPointerException�̰� Ŭ����
		try {
//			string.length();
			
			intArray[8] = 10;
		} catch(Exception e) {
			System.out.println("���� �߻�!~!~!");
		}
			
//		} catch(NullPointerException e) {
//			System.out.println("null ������ ���� �߻�!!!");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index ���� �ʰ� ���� �߻�!!");
//		}
		
		// Ư�� �޼ҵ带 ����Ҷ�, ���ǰ� �ʿ��Ҷ� �ַ� �����!! 
		// Thread.sleep�� ��� ������ try-catch�� ����... �ƴϸ� �ٸ� ������� ����ó�� �ʼ�
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// throws InterruptedException main�Լ��� �߰��� -> �޼ҵ� ���������� ����������
		// �̰ź��� try-catch�� ����ó�� �ϴ°� ����
		Thread.sleep(1000);
		

	}

}
