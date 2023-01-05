package test;

public class Test01 {

	public static void main(String[] args) {
		
//		1. 주사위 문제
//		두개의 주사위를 굴렸을때, 나올 수 있는 모든 경우의 수를 출력 하세요.
//		출력 예시
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
		
//		2. 구구단
//		구구단을 2단에서 부터 9단 까지 모두 출력하세요.
		
		
				
//		별찍기
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
		
		
		// 스앵님 풀이
		
//		for(int i = 0; i < 5; i++) {
//			// + 기호 찍기 -> 나중에 공백으로 바꾸기 
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
			// 홀수 : 2n + 1
					
			int count2 = 2 * i + 1;
						
			for(int j = 0; j < count2; j++) {
				System.out.println("*");
			}
			System.out.println();
		
		
		}
	
	}
}
