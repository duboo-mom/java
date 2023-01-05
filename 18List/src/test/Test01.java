package test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
//		1. List 만들기
//		리스트에 주어진 값들을 넣고 출력하세요.
//		3, 8, 9, 4, 2, 1, 7, 5
//		출력 예시
//
//		[3, 8, 9, 4, 2, 1, 7, 5]
		
		List<Integer> integerList1 = new ArrayList<>();
		integerList1.add(3);
		integerList1.add(8);
		integerList1.add(9);
		integerList1.add(4);
		integerList1.add(2);
		integerList1.add(1);
		integerList1.add(7);
		integerList1.add(5);
		System.out.println(integerList1);
		
		
//		2. 값 수정하기
//		List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
//		출력 예시
//
//		[3, 8, 9, 6, 2, 1, 7, 5]
		
		integerList1.set(3, 6);
		System.out.println(integerList1);
		
		
//		3. 값 삽입하기
//		List의 세번째 위치에 10을 삽입 하고 전체를 출력 하세요.
//		[3, 8, 10, 9, 6, 2, 1, 7, 5]
		
		integerList1.add(2, 10);
		System.out.println(integerList1);
		
//		4. 값 삭제하기
//		List에서 8과 7을 삭제하고 전체를 출력하세요.
//		출력 예시
//
//		[3, 10, 9, 6, 2, 1, 5]
//		뒤에서부터 지우면 인덱스 앞에거 변경안되니까 요령~
		integerList1.remove(7);
		integerList1.remove(1);
		System.out.println(integerList1);
		
		

	}

}
