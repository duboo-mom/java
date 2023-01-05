package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {

		// ���ʸ��� ��� �����Ұ���~? ���� ���� Ŭ����!
		List<Member> memberList = new ArrayList<>();
		Member member1 = new Member("�ȹ���", "010-1234-5678");
		memberList.add(member1);
		// �̷��� �����ص� list�ȿ��� ��ü�� �ּҸ� ����Ǿ� ����Ǵ� ��!(heap��� ����Ǿ��ִ���?)
		// new Member�� ���� ��������� heap�� ����!
		Member member2 = new Member("���缮", "010-0000-0000");
		memberList.add(member2);
		
		// �̷��� �ٷ� �����ؼ� �־��൵ ��!
		// �ٵ� ������..new Member ���⼭ �ϸ� �� ��ü�� ����?�� ���� ���·� heap�޸𸮿� ������ �����ϴ°ǰ�?
		// �׷���
		// �����ڷ� �����ϸ� heap�� ��ü�� �����ǰ� ������ ������ ��ü �ּҸ� �����ؿ��°Ŵϱ�!!
		// ������ �ʿ�� ������ �����ϸ� �Ǵ°���
		memberList.add(new Member("��ȣ��", "010-4568-4135"));
		
		System.out.println(memberList);
		
		// index ��� �ݺ���
		for(int i = 0; i < memberList.size(); i++) {
			
			Member member = memberList.get(i);
			// �̸� ���
			System.out.print(member.getName() + " ");
			
			// ������ ��� �����Դϴ�. ���
			String name = member.getName();
			if(name.startsWith("��")) {
				System.out.println("�����Դϴ�.");
			}
			
		}
		System.out.println();
		
		
		// ���� for��
		for(Member member : memberList) {
			System.out.print(member.getName() + " ");
		}
		System.out.println();
		
		
		// ���ͷ�����
		Iterator<Member> iter = memberList.iterator();
		// iter�� ������ ���� �ִ�~? ��� �Ҹ�
		while(iter.hasNext()) {
			
			Member member = iter.next();
			System.out.print(member.getName() + " ");
						
		}
		System.out.println();
		
		
		

	}

}
