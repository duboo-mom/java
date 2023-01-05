package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {

		// 제너릭에 어떤거 저장할건지~? 내가 만든 클래스!
		List<Member> memberList = new ArrayList<>();
		Member member1 = new Member("안미정", "010-1234-5678");
		memberList.add(member1);
		// 이렇게 저장해도 list안에는 객체의 주소만 복사되어 저장되는 것!(heap어디에 저장되어있는지?)
		// new Member로 새로 생성해줘야 heap에 생김!
		Member member2 = new Member("유재석", "010-0000-0000");
		memberList.add(member2);
		
		// 이렇게 바로 생성해서 넣어줘도 됨!
		// 근데 질문은..new Member 여기서 하면 이 객체의 변수?는 없는 상태로 heap메모리에 공간만 차지하는건가?
		// 그러취
		// 생성자로 생성하면 heap에 객체가 생성되고 변수는 무조건 객체 주소만 복사해오는거니까!!
		// 변수는 필요시 언제든 생성하면 되는거임
		memberList.add(new Member("강호동", "010-4568-4135"));
		
		System.out.println(memberList);
		
		// index 기반 반복문
		for(int i = 0; i < memberList.size(); i++) {
			
			Member member = memberList.get(i);
			// 이름 출력
			System.out.print(member.getName() + " ");
			
			// 유씨인 경우 유씨입니다. 출력
			String name = member.getName();
			if(name.startsWith("유")) {
				System.out.println("유씨입니다.");
			}
			
		}
		System.out.println();
		
		
		// 향상된 for문
		for(Member member : memberList) {
			System.out.print(member.getName() + " ");
		}
		System.out.println();
		
		
		// 이터레이터
		Iterator<Member> iter = memberList.iterator();
		// iter야 다음에 값이 있니~? 라는 불린
		while(iter.hasNext()) {
			
			Member member = iter.next();
			System.out.print(member.getName() + " ");
						
		}
		System.out.println();
		
		
		

	}

}
