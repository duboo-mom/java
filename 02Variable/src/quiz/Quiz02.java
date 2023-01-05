package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		
		int score = 90;
		char grade = 'A';
		double rate = 4;
		System.out.println("시험 성적이 " + score + "점 이상이면 \'" + grade + "\'학점이고 평점은 " + rate + "입니다." );
		
		score = 80;
		grade = 'B';
		rate = 3;
		System.out.println("시험 성적이 " + score + "점 이상이면 \'" + grade + "\'학점이고 평점은 " + rate + "입니다." );
		
		//두 수의 곱 : 1165.7250000000001
		int number1 = 33;
		double number2 = 35.325;
		double multiply = number1 * number2;
		
		System.out.println("두 수의 곱 : " + multiply);
		
		// 시간계산: 943시간은 39일 입니다.
		int hour = 943;
		int day = hour / 24;
		System.out.println(hour + "시간은 " + day + "일 입니다.");
		
		// 가로 길이 8 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요
		int width = 7;
		int height = 3;
		int square = width * height;
		double triangle = (width * height) / (double)2;
		System.out.println("사각형의 넓이: " + square);
		System.out.println("삼각형의 넓이: " + triangle);
		
		// 국어 93점, 수학 88, 영어 94점
		// 평균 : 91.66666666666667
		
		int korean = 93;
		int math = 88;
		int english = 94;
		double average = (korean + math + english) / 3.0;
		System.out.println("국어 " + korean + "점, 수학 " + math + "점, 영어 " + english);
		System.out.println("평균 : " + average);
		
		// 화씨 온도 = 9 / 5 * 섭씨 온도 + 32
		// 섭씨 30도는 화씨 86.0도 입니다.
		int celsius = 30;
		double fahrenheit = (double)9 / 5 * celsius + 32;
		// 여기서 9/5*celsius 로만 하면 9/5가 int라서 아무리 double로 화씨를 선언해도 1.0으로 인식되어서 값에 차이가 발생할 수있음!! 
		System.out.println("섭씨 " + celsius + "도는 화씨 " + fahrenheit + "도 입니다.");
		
		
		
		
		
	}

}
