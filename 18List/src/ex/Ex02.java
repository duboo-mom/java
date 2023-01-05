package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
		// 리스트와 반복문!!
		
		List<String> fruitList = new ArrayList<>();
		
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");
		fruitList.add("banana");
		fruitList.add("banana");
		
		
		// index 기반의 반복문
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.print(fruitList.get(i) + " ");
			
			// 바나나를 만나면 삭제
//			if(fruitList.get(i).equals("banana")) {
//				fruitList.remove(i);
//			}
		}
		System.out.println();
		System.out.println(fruitList);
		// index기반으로 삭제하면 i++로 무조건 뒤로 넘어가지만 삭제하면 그 빈칸을
		// 당겨지니까!! 어려워짐...!!
		
		// 향상된 for문
		// 다른 언어에서는 foreach라고 많이 부름
		// list안에 있는 값이 앞에있는 변수 fruit에 하나씩 저장되고 실행되고 끝나면 다음 값
		// ...마지막 변수까지 돌고 나오기
		// 리스트 전체 훑어볼때만 사용하고..
		// 향상된 for문안에서는 리스트 수정 불가능!!
		for(String fruit:fruitList) {
			System.out.print(fruit + " ");
			
//			if(fruit.equals("banana")) {
//				fruitList.remove(fruit); // 대상이되는 객체를 입력해도 됨
//			}
			
		}
		System.out.println();
		
		
		// Iterator (이터레이터)
		// list 맨앞에 index0 보다 앞에 가상공간에서 iter라는 관찰자로
		// 그다음 칸에 값이 있는지 확인 = boolean
		// 삭제할때 유용함!!
		// 반복문 안에서 list 요소 삭제하려면 무조건 이터레이터!!
		// iter는 remove하면 바로 넥스트 하는거 아니구 그앞을 다시바라봐서
		// 빠짐없이 훑어보는 형태임!!
		
		// 사용하려면 객체 만들어야하고 리스트 객체랑 동일한 타입으로
		Iterator<String> iter = fruitList.iterator();
		while(iter.hasNext()) {
			
			// iter.next()는 관찰하는 index를 다음으로 가리킴
			String fruit = iter.next();
			System.out.print(fruit + " ");
			
			if(fruit.equals("banana")) {
				iter.remove();
			}
			
		}
		System.out.println();
		System.out.println(fruitList);
		
		
		
		
	}

}
