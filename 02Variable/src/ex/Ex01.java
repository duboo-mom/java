package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// ������ ������ 900�� �̴�.
		int noodleCup = 900;
		System.out.println(noodleCup);
		
		// ������ ���� : 900��
		System.out.println("������ ���� : " + noodleCup + "��");
		
		// �ٹٲ�
		System.out.println("�ȳ��ϼ���\n�� �����׿�");
		// "�ȳ�"
		System.out.println("\"�ȳ�\"");
		
		// ������
		// ������ 3���� ����
		int sum = noodleCup * 3;
		
		System.out.println("������ 3���� ���� : " + sum);
		
		// ���� ���
		noodleCup = noodleCup + 50;
		System.out.println("���ο� ������ 3���� ���� : " + (noodleCup * 3));
		
		// 5000������ �ִ� ��� �������� �� �� �ִ���?
		int money = 5000;
		int count = money / noodleCup;
		System.out.println("���� : " + count);
		// �ܵ�?
		// 5000�� 950���� ���� ������
		int change = money % noodleCup;
		System.out.println("�ܵ� : " + change);
		
		
	}

}
