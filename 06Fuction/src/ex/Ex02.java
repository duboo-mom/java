package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		int price = getNoodlesPrice(5);
		
		System.out.println("���� : " + price);
		
		System.out.println(sum(10, 90));
						
		printHelloWorld();
		
		System.out.println(sumAll(10));
		
		int result = sumAll(35) + 20;
		System.out.println(result);
		
		

	}
	
	// ������ ������ ���� ���ݰ�� ���
	// �� ���°� �Լ� �����̶�� �� -> int getNoodlesPrice(int count)
	public static int getNoodlesPrice(int count) {
		
		int result = 900 * count;
		
		return result;
	}
	
	// �� ���� ���� �޾Ƽ� ���ϴ� ���
	// long = int���� �� ū ������ ���� ��� Ÿ��
	public static long sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// �Է°��� �����ִ� ���� ���� �Լ�
	// Hello World�� ���� ����ϴ� �Լ�
	public static void printHelloWorld() {
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
	}
	
	// 1���� ���޹��� ������ ���� ���ϴ� �Լ�
	public static int sumAll(int number) {
		// 1 ���� number ������ �� ���ϱ�
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	
	
	
}
