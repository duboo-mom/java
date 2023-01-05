package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
	
		// list와 유사하게 만들어짐
		// List처럼 Set도 인터페이스가 있고... 그중에 HashSet 많이사용함
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(3);
		set1.add(5);
		System.out.println(set1);
		
		// 중복 안됨
		set1.add(3);
		System.out.println(set1);
		
		// 정렬됨
		set1.add(2);
		System.out.println(set1);
		
		
		// Set은 집합!!
		// 실제로는 list를 주로 사용하지만..!
		// 1. 중복된 값이 저장되지 않는다.
		// 2. 값의 순서가 보장되지 않는다.(index 개념이 없음)
		
		for(Integer number:set1) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			
			System.out.print(number + " ");
		}
		System.out.println();
		
	}

}
