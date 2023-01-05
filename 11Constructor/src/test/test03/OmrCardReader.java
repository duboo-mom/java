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
	
	// 스앵님 풀이
	// 리더기는 그자체로 있고, 사용자가 그때그때 값을 입력하는 형태니까! setter로 정답입력
	
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
	

//	public void correctAnswer(String name, String studentId, int[] studentAnswer) < 이건 내가 첨에 했던건데 이렇게 받는거보단 객체로 받아야!!
	
	// 채점 기능 + 출력
	// ()안에는 클래스도 일종의 타입이니까 적고...객체 자체를 가져오겠다..! 객체이름은 사용자가 어차피 모르는거임! 만드는사람은 본인이 편하게 지으면 되는것
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
	
	// 결과 출력 기능
	public void printScore(OmrCard card) {
		System.out.println("이름 : " + card.getName());
		System.out.println("학번 : " + card.getStudentId());
		System.out.println("점수 : " + this.correctAnswer(card));
	}
	
	
	// 스앵님
	// 채점 기능... 이건 리더기 사용자가 학생의 정답을 다시입력하는 형태라 번거로움!
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
