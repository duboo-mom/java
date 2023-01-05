package test.test03;

public class OmrCard {
	
	// �̸�, �й�, 5���� ��ŷ�� ��
	private String name;
	private String studentId;
	private int[] marking = new int[5];  // ���� �ϳ��� �޾Ƽ� �����ҰŸ� �迭 ���� ���� �ʿ�
//	private int[] marking; // �̷����ϸ� setMarking(int[] marking) ��밡��! ��� �̰Ŵ� �� �����Լ����� �迭 �޾Ƽ� �Է��ϴ� ���·� ������
		
	
	// ������
	public OmrCard(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	// ��ŷ ���
	public void setMarking(int num1, int num2, int num3, int num4, int num5) {
		this.marking[0] = num1;
		this.marking[1] = num2;
		this.marking[2] = num3;
		this.marking[3] = num4;
		this.marking[4] = num5;
	}
	
	public void setMarking(int[] marking) {
		this.marking = marking;
	}
	
	// �̰Ŵ� ���� ��ȣ �����ؼ� �ϳ��� Ǯ�� ������ ���
	public void setMarking(int number, int mark) {
		this.marking[number - 1] = mark;
	}
	
	
	
	
	public String getName() {
		return this.name;
	}
	
	public String getStudentId() {
		return this.studentId;
	}
	
	public int[] getMarking() {
		return this.marking;
	}
	
	public void printInfo() {
		System.out.println("�̸� : " + this.name + " �й� : " + this.studentId);
		for(int i = 0; i < this.marking.length; i++) {
			System.out.print(this.marking[i] + " ");
		}
		System.out.println();		
	}
	
	
//	public OmrCard(String name, String studentId, int num1, int num2, int num3, int num4, int num5) {
//		this.name = name;
//		this.studentId = studentId;
//		this.marking[0] = num1;
//		this.marking[1] = num2;
//		this.marking[2] = num3;
//		this.marking[3] = num4;
//		this.marking[4] = num5;
//		
//	}
	
//	public int[] studentAnswer() {
//		
//		int[] studentAnswer = {num1, num2, num3, num4, num5};
//				
//		return studentAnswer; 
//	}

	
}
