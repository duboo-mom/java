package test;

public class Test01 {

	public static void main(String[] args) {
		
//		1. �ֻ��� ����
//		�ΰ��� �ֻ����� ��������, ���� �� �ִ� ��� ����� ���� ��� �ϼ���.
//		��� ����
//
//		(1, 1) (1, 2) (1, 3) (1, 4) (1, 5) (1, 6)  
//		(2, 1) (2, 2) (2, 3) (2, 4) (2, 5) (2, 6) 
//		(3, 1) (3, 2) (3, 3) (3, 4) (3, 5) (3, 6) 
//		(4, 1) (4, 2) (4, 3) (4, 4) (4, 5) (4, 6) 
//		(5, 1) (5, 2) (5, 3) (5, 4) (5, 5) (5, 6) 
//		(6, 1) (6, 2) (6, 3) (6, 4) (6, 5) (6, 6) 
		
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6; j++ ) {
//				System.out.print("(" + i + ", " + j + ") ");
//			}
//			System.out.println();
//		}
		
//		2. ������
//		�������� 2�ܿ��� ���� 9�� ���� ��� ����ϼ���.
		
		
				
//		�����
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// ���޴� Ǯ��
		
//		for(int i = 0; i < 5; i++) {
//			// + ��ȣ ��� -> ���߿� �������� �ٲٱ� 
//			// 4 4 4 4 4
//			// 0 1 2 3 4
//			// 4 3 2 1 0
//			int count = 4 - i;
//			for(int j = 0; j < count; j++) {
//				System.out.println("+");
//			}
//			
//			for(int j = 0; j < i + 1; j++) {
//				System.out.println("*");
//			}
//			System.out.println();
//			
//		}

		for(int i = 0; i < 5; i++) {

			int count = 4 - i;
			for(int j = 0; j < count; j++) {
				System.out.println(" ");
			}
			
			// 0 1 2 3 4
			// 1 3 5 7 9
			// Ȧ�� : 2n + 1
					
			int count2 = 2 * i + 1;
						
			for(int j = 0; j < count2; j++) {
				System.out.println("*");
			}
			System.out.println();
		
		
		}
	
	}
}
