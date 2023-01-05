package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(5);
		numberList.add(19);
		numberList.add(13);
		numberList.add(8);
		numberList.add(25);
		numberList.add(3);
		
		System.out.println(numberList);
		
		// 값을 포함하는지?
		System.out.println(numberList.contains(8));
		// boolean 값을 리턴하니까 주로 이렇게 조건문에 사용
		if(numberList.contains(25)) {
			System.out.println("25가 포함됨");
		}
		
		
		// 정렬
		// sort는 실제 리스트의 순서가 뒤바뀌니까 주의!!!
		// 오름차순
		numberList.sort(Comparator.naturalOrder());
		System.out.println(numberList);
		
		// 내림차순
		numberList.sort(Comparator.reverseOrder());
		System.out.println(numberList);
		
		
		// 리스트가 비어있는지 확인
		if(numberList.isEmpty()) {
			System.out.println("비어있음");
		}
		
		// 리스트가 비어있지 않은지 확인 - 앞에 !
		if(!numberList.isEmpty()) {
			System.out.println("비어있지 않음");
		}
		
		
		

	}

}
