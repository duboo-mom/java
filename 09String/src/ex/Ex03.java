package ex;

public class Ex03 {

	public static void main(String[] args) {
		
		// ���ڿ� �Լ�(�޼ҵ�) �ǽ�

		String text = "Hello";
		
		// ���� ���ϱ�
		int textLength = text.length();
		System.out.println(textLength);
		
		// ���� �ϳ� ���
		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		System.out.println(text.charAt(4));
		
		// ���� �ϳ��� ���
		for(int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		System.out.println();
		
		// ���ڿ� �ڸ���
		// ����Ѱ� substring(start index, end index) �ε�...end�� ������ �ƴϰ� �׾տ��� �߷��� +1 ����ߵ�...����; ���̽㵵 �̷����� ����..
		text = "20010516";
		
		String yearString = text.substring(0, 4);
		System.out.println(yearString);
		
		String monthString = text.substring(4, 6);
		System.out.println(monthString);
		
		// �ε��� �ϳ��� ������ ���������� ������ �� ������ -> (6, 8) �ص� �ǰ�~
		String dayString = text.substring(6);
		System.out.println(dayString);
		
		// Ư�� ���ڿ��� �����ϴ���, ��������
		text = "���α�";
		
		if(text.startsWith("��")) {
			System.out.println("�达 �Դϴ�~~");
		} else {
			System.out.println("�达�� �ƴմϴ�");
		}
		
		if(text.endsWith("�α�")) {
			System.out.println("�� �αԱ���~?");
		} 
		
		// ���ڿ� �Ϻ� �ٲٱ�
		
		String replaceText = text.replace("��", "��");
		
		System.out.println(replaceText);
		System.out.println(text);
		
		// ������ ���� �ٲٰ� ������ ~ �̷��� ������ �ٽóֱ�
		text = text.replace("��", "��");
		System.out.println(text);
		
		// ���ڿ� �ɰ���
		text = "���α�,���缮,����,Ȳ����,����ȣ";
		
		String[] names = text.split(",");
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "��");
		}
		
		
		
		
	}

}
