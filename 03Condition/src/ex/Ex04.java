package ex;

public class Ex04 {

	public static void main(String[] args) {
		
		//Switch��~
		
		int ranking = 3;
		
		// 1���̸� �Ұ��
		// 2���̸� ����
		// 3���̸� ġŲ
		// �׿ܸ� ���
		
		switch(ranking) {
		case 1:
			System.out.println("�Ұ�� ����");
			break;
		case 2:
			System.out.println("���� ����");
			break;
		case 3:
			System.out.println("ġŲ ����");
			break;
		default:
			System.out.println("���");
		}
		
		switch(ranking) {
		case 1:
			System.out.println("�Ұ�� ����");
			
		case 2:
			System.out.println("���� ����");
			break;
		case 3:
			System.out.println("ġŲ ����");
			break;
		default:
			System.out.println("���");
		}
		

	}

}
