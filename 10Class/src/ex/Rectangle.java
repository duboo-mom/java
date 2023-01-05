package ex;

public class Rectangle {
	
	int width;
	int height;
	
	// 기능
	// 함수
	// 넓이를 구하는 기능
	// 클래스 내에 변수만 사용할거고 입력받을게 없으면 () 비우기 가능~
	int calculateArea() {
		int area = width * height;
		return area;
	}
	
	// 개수에 따른 넓이를 구하는 기능
//	int calculateAreaByCount(int count) {
//		int area = width * height * count;
//		return area;
//	}
	
	// int calculateArea(int count) = 같은 이름으로 메소드 만들 수 있음!! 단! 파라미터값만 다를때 가능함
	// overloading 오버로딩
	int calculateArea(int count) {
		int area = calculateArea() * count;
		return area;
	}
	
	
	// 멤버 변수의 값을 출력해주는 기능
	void printRectangle() {
		System.out.println("가로 : " + width + " 세로 : " + height);
	}
	

}
