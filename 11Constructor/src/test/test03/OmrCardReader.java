package test.test03;

public class OmrCardReader {

	private int[] answer= new int[5];
	
//	public OmrCardReader(int answer1, int answer2, int answer3, int answer4, int answer5) {
//		this.answer[0] = answer1;
//		this.answer[1] = answer2;
//		this.answer[2] = answer3;
//		this.answer[3] = answer4;
//		this.answer[4] = answer5;		
//				
//	}
	
	// ���޴� Ǯ��
	// ������� ����ü�� �ְ�, ����ڰ� �׶��׶� ���� �Է��ϴ� ���´ϱ�! setter�� �����Է�
	
	public void setAnswer(int answer1, int answer2, int answer3, int answer4, int answer5) {
		this.answer[0] = answer1;
		this.answer[1] = answer2;
		this.answer[2] = answer3;
		this.answer[3] = answer4;
		this.answer[4] = answer5;		

	}
	
	public void printInfo() {
		for(int i = 0; i < this.answer.length; i++) {
			System.out.print(this.answer[i] + " ");
		}
		System.out.println();
	}
	

//	public void correctAnswer(String name, String studentId, int[] studentAnswer) < �̰� ���� ÷�� �ߴ��ǵ� �̷��� �޴°ź��� ��ü�� �޾ƾ�!!
	
	// ä�� ��� + ���
	// ()�ȿ��� Ŭ������ ������ Ÿ���̴ϱ� ����...��ü ��ü�� �������ڴ�..! ��ü�̸��� ����ڰ� ������ �𸣴°���! ����»���� ������ ���ϰ� ������ �Ǵ°�
	public int correctAnswer(OmrCard card) {
		
		int[] rightAnswer = this.answer;
		
		int[] studentAnswer = card.getMarking();
		
		int score = 0;
		for(int i = 0; i < studentAnswer.length; i++) {
			if(studentAnswer[i] == rightAnswer[i]) {
				score += 20;
			}
		}
				
		return score;
		
	}
	
	// ��� ��� ���
	public void printScore(OmrCard card) {
		System.out.println("�̸� : " + card.getName());
		System.out.println("�й� : " + card.getStudentId());
		System.out.println("���� : " + this.correctAnswer(card));
	}
	
	
	// ���޴�
	// ä�� ���... �̰� ������ ����ڰ� �л��� ������ �ٽ��Է��ϴ� ���¶� ���ŷο�!
//	
//	public int checkScore(int[] marking) {
//		int score = 0;
//		for(int i = 0; i < this.answer.length; i++) {
//			if(this.answer[i] == marking[i]) {
//				score += 20;
//			}
//		}
//		
//		return score;
//		
//	}
//	
	
	
	
	
	

	
}
