package test;

public class Test02 {

	public static void main(String[] args) {
		
//		*+*+*+*
//		-*+*+*-
//		--*+*--
//		---*---
//		--*+*--
//		-*+*+*-
//		*+*+*+*

		// 우선 다 *과 -로만 생각
		//		*******
		//		-*****-
		//		--***--
		//		---*---
		// 먼저 절반까지만 그리기
		
		int line = 15;
		int halfLine = line / 2;
		
		
		for(int i = 0; i < halfLine + 1; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			
			// 3 3 3 3
			// 0 1 2 3
			// 3 2 1 0
			// 2n + 1
			// 7 5 3 1 *규칙
			
			int count = 2 * (halfLine - i) + 1;
			for(int j = 0; j < count; j++) {
				if(j % 2 != 0) {
					System.out.print("+");
				} else {
					System.out.print("*");
				}				
			}
			
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			
			System.out.println();
			
		}
		
		
//		--***--
//		-*****-
//		*******
		for(int i = 0; i < halfLine; i++) {
			// 2 2 2
			// 0 1 2
			// 2 1 0
			for(int j = 0; j < (halfLine - 1) - i; j++) {
				System.out.print("-");
			}
			
			// 0 1 2
			// +1
			// 1 2 3
			// 3 5 7
			
			int count = 2 * (i + 1) + 1;
			for(int j = 0; j < count; j++) {
				if(j % 2 != 0) {
					System.out.print("+");
				} else {
					System.out.print("*");
				}			
			}
			
			for(int j = 0; j < (halfLine - 1) - i; j++) {
				System.out.print("-");
			}
			
			System.out.println();
			
		}
		
//		1
//		2 5
//		3 6 8
//		4 7 9 10
		
		line = 13; 
		
		for(int i = 0; i < line; i++) {
			
			int number = i + 1;
			for(int j = 0; j < i + 1; j++) {
				System.out.print(number + " ");
				number += (line - 1 - j);
			}
			System.out.println();
		}
		
		
		
	}

}
