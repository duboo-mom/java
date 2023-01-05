package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		ScoreData korean = new ScoreData();
		korean.name = "국어";
		korean.score = 90;
		korean.ranking = 8;
		
		System.out.println(korean.name + " 점수는 " + korean.score + "점");
		
		ScoreData english = new ScoreData();
		english.name = "영어";
		english.score = 85;
		english.ranking = 13;
		
		System.out.println(english.name + " 점수는 " + english.score + "점");
		
		
		
		
	}

}
