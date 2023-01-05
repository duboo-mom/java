package ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		// list는 클래스만 담을수 있음
//		ArrayList<Integer> integerList1 = new ArrayList<>();
		
//		LinkedList<Integer> integerList2 = new LinkedList<>();
		
		// upcasting을 통한 List 생성이 젤 마니 사용됨!!
		// <> 제너릭에 래퍼클래스 지정한대로만 입력할수 있음
		List<Integer> integerList = new ArrayList<>();
		
		// 값 추가하기
		integerList.add(4);
		integerList.add(8);
//		integerList.add("adsf"); - Integer라고 했으니께!!
//		toString이 override되어 있어서 보기 편하게 출력되는거임
		System.out.println(integerList);
		
		// 값 삽입하기 - index, 값
		integerList.add(1, 5);
		System.out.println(integerList);
		
		// 값 수정
		integerList.set(2, 6);
		
		// 하나의 값 얻어오기
		Integer number = integerList.get(2);
		System.out.println(number);
		
		// 값 지우기
		integerList.remove(1);
		System.out.println(integerList);
		
		
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("bear");
		
		System.out.println(stringList);
		
		// 모든 요소 지우기
		stringList.clear();
		System.out.println(stringList);
		
		
		
		

	}

}
