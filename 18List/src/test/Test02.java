package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		
//		1. List 만들기
//		리스트에 주어진 값들을 넣으세요.
//		20 3 5 84 17
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(20);
		integerList.add(3);
		integerList.add(5);
		integerList.add(84);
		integerList.add(17);
				
//		2. 최소값 구하기
//		List에서 가장 작은 값을 출력하세요.
//		for문을 사용하세요.(향상된 for문 X)
//		출력 예시
//		3
		int min = integerList.get(0);
		for(int i = 1; i < integerList.size(); i++) {
			if(min > integerList.get(i)) {
				min = integerList.get(i);
			}
		}
		System.out.println(min);
		
		
//		3. 합계 구하기
//		List 요소들의 총 합계를 구하세요.
//		Iterator를 사용하세요.
//		출력 예시
//		129
		
		// 이터레이터 iter도 하나의 변수를 만든것임..!! 주의**		
		Iterator<Integer> iter = integerList.iterator();
//		int sum = 0;
		Integer sum = 0;
		while(iter.hasNext()) {
			Integer number = iter.next();
			sum += number;
		}
		System.out.println(sum);
		
		
		
//		4. 리스트 삭제
//		List 에서 짝수 인 값을 모두 삭제하고 전체 값을 출력 하세요.
//		[3, 5, 17]
		
		// 위에서 똑같은 변수 iterator 사용하면..! 
		// list 인덱스 끝까지 본 상태로 돌고 나온거기때문에.. 그 뒤에서 확인하느라 리무브되는 값없이 나옴
		// 다시 이터레이터 초기화
		
		iter = integerList.iterator();
		while(iter.hasNext()) {
//			int number = iter1.next();
			// 이렇게 int 자료형에 넣어도 에러안남!!
			Integer integer = iter.next();
			
			if(integer % 2 == 0) {
				iter.remove();
			}					
		}
		System.out.println(integerList);
		

		// for문보다 삭제는 무조건 이터레이터!!!
//		for(int i = 0; i < integerList.size(); i++) {
//			if(integerList.get(i) % 2 == 0) {
//				integerList.remove(i);
//				i--;
//			}
//		}
//		System.out.println(integerList);
		
		
	}
}
