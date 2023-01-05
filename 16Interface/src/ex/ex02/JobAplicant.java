package ex.ex02;

public class JobAplicant implements JavaProgramming {
	
	// 이름, 학점, toeic
	
	private String name;
	private double grade;
	private int toeic;
	
	// 자소서를 읽는 기능
	public void readLetter() {
		System.out.println("저는 서울 모처에서 태어나 엄격하신 아버지와 인자하신 어머니 사이에서... ");
	}

	@Override
	public void objectOriented() {	
		System.out.println("클래스로 객체를 지향해서 프로그래밍 합니다.");
	}
	
	
	

}
