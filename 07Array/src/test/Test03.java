package test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. 위치 변경 (swap)
//		두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
//		int[] numbers = {3, 5, 2, 10, 39};
//		입력 예시
//
//		두 개의 index를 입력 하세요 : 2 4
//		출력 예시
//
//		3 5 39 10 2 
		
//		int[] numbers = {3, 5, 2, 10, 39};
//		
//		System.out.print("두 개의 index를 입력하세요 : ");
//		int index1 = scan.nextInt();
//		int index2 = scan.nextInt();
//		
//		int tempNum = numbers[index1];
//		numbers[index1] = numbers[index2];
//		numbers[index2] = tempNum;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		
		
		
//		2. 셔플
//		1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤 섞어서 그 결과를 출력 하세요.
//		힌트
//		rand() 함수를 이용해서, 0번째 index의 값과 rand() 번째 index의 값의 서로 교체 하면 된다.
//
//		Random rand = new Random();
//
//		for (int i = 0; i < 100; i++) {
//		    int randomNumber = rand.nextInt(10);
//		    // swap 구현
//		}
//		출력 예시
//
//		4 5 7 8 9 1 3 6 2 10
//		
		Random rand = new Random();
		
		int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// 여기서의 100 은 섞어주는 횟수이므로 클수록 마니마니 섞임 
		for (int i = 0; i < 100; i++) {
		    int randomNumber = rand.nextInt(10);
		    // swap 구현
		    
		    int tmp = oneToTen[0];
		    oneToTen[0] = oneToTen[randomNumber];
		    oneToTen[randomNumber] = tmp;
   		    
		}
		
		for(int i = 0; i < oneToTen.length; i++) {
			System.out.print(oneToTen[i] + " ");
		}
		System.out.println();
		
		
		
//		3. 없는 수 찾기
//		아래 배열에 1 ~ 9 의 숫자들이 들어있는데 하나의 수가 빠져 있다.
//		빠진 수를 찾아서 출력하세요.
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
//
//		출력 예시
//
//		없는 수는 7 입니다 
		
//		int sum = 0;
//		int result = 0;
//		
//		for(int i = 0; i < numbers2.length; i++) {
//			sum += numbers2[i];
//		}
//		
//		for(int i = 1; i < 10; i++) {
//			result += i;
//		}
//		result = result - sum;
//		System.out.println("없는 수는 " + result + "입니다.");
		
		// 스앵님 풀이
		
		// 1 2 3 4 5 6 7 8 9 이런 체크할 수 있는 것을 만들고
		// v v v v v v   v v  이렇게 체크해서 빈거 찾기
		
		// 0 1 2 3 4 5 6 7 8 9 이렇게 만들고 싶은것!
		// 처음 만들면 zeros처럼 0으로 쭉 깔아짐
		int[] count = new int[10];
		
		for(int i = 0; i < numbers2.length; i++) {
			count[numbers2[i]] = 1;
		}
		
		for(int i = 1; i < count.length; i++) {
			if(count[i] == 0) {
				System.out.println("없는 수는 " + i + "입니다.");
				break;
			}
		}
		
		
		
		
//		4. 빈도수 구하기
//		1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장 되어 있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장 되어 있는지 출력 하세요.
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//
//		출력 예시
//
//		1 : 2
//		2 : 3
//		3 : 3
//		4 : 1
//		5 : 1

		// 스앵님 풀이
		// 1 2 3 4 5
		// 확인하면서 하나하나 더하기!
		
		// 0 1 2 3 4 5
		// 0 0 0 0 0 0
		int[] numberCounts = new int[6];
		
		for(int i = 0; i < numbers3.length; i++) {
			numberCounts[numbers3[i]]++;
		}
		
		for(int i = 1; i < numberCounts.length; i++) {
			System.out.println(i + " : " + numberCounts[i]);
		}
		
		
		
//		int num1 = 0;
//		int num2 = 0;
//		int num3 = 0;
//		int num4 = 0;
//		int num5 = 0;
//		
//		int[] dupleNum = new int[5];
//		
//		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//		
//		for(int i = 0; i < numbers3.length; i++) {
//			if (numbers3[i] == 1) {
//				num1++;
//			} else if(numbers3[i] == 2) {
//				num2++;
//			} else if(numbers3[i] == 3) {
//				num3++;
//			} else if(numbers3[i] == 4) {
//				num4++;
//			} else {
//				num5++;
//			}
//		}
//		System.out.println("1 : " + num1);
//		System.out.println("2 : " + num2);
//		System.out.println("3 : " + num3);
//		System.out.println("4 : " + num4);
//		System.out.println("5 : " + num5);

		
		
	}

}
