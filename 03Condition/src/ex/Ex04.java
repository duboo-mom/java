package ex;

public class Ex04 {

	public static void main(String[] args) {
		
		//Switch문~
		
		int ranking = 3;
		
		// 1등이면 소고기
		// 2등이면 삼겹살
		// 3등이면 치킨
		// 그외면 라면
		
		switch(ranking) {
		case 1:
			System.out.println("소고기 먹자");
			break;
		case 2:
			System.out.println("삼겹살 먹자");
			break;
		case 3:
			System.out.println("치킨 먹자");
			break;
		default:
			System.out.println("라면");
		}
		
		switch(ranking) {
		case 1:
			System.out.println("소고기 먹자");
			
		case 2:
			System.out.println("삼겹살 먹자");
			break;
		case 3:
			System.out.println("치킨 먹자");
			break;
		default:
			System.out.println("라면");
		}
		

	}

}
