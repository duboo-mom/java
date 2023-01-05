package test.test03;

public class OmrCard {
	
	// 이름, 학번, 5개의 마킹한 답
	private String name;
	private String studentId;
	private int[] marking = new int[5];  // 답을 하나씩 받아서 저장할거면 배열 길이 지정 필요
//	private int[] marking; // 이렇게하면 setMarking(int[] marking) 사용가능! 대신 이거는 또 메인함수에서 배열 받아서 입력하는 형태로 가야함
		
	
	// 생성자
	public OmrCard(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	// 마킹 기능
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
	
	// 이거는 문제 번호 지정해서 하나씩 풀어 나가는 경우
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
		System.out.println("이름 : " + this.name + " 학번 : " + this.studentId);
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
