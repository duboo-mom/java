package test;

public class Product {
	
	String name;
	int price;
	String expiration;
	
	//ㅋㅋ유통기한단어 expiration
	
	// 개수에 따른 가격 계산
	int calTotalPrice(int count) {
//		int total = price * count;
//		return total;
//		굳이 변수 안만들고!
		
		return price * count;
	}
	
	// 제품 정보를 출력하는 기능
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("유통기한 : " + expiration);
	}
	
	
	
	void printTotalPrice(int count) {
		System.out.println("제품 " + count + "개의 가격 : " + calTotalPrice(count));
	}
	
	
	// 판매가능 여부 확인 기능
	// today format "2021-03-02"
	// 가능하면 리턴값이 있는 메소드가 좋음!! void말고~ 그러니 판매가능여부는 boolean으로 할것임
	
	boolean availableSale(String today) {
		
//		String[] todayArray = today.split("-");
//		String[] expirationArray = expiration.split("-");
//		
//		int todayYear = Integer.parseInt(todayArray[0]);
//		int todayMonth = Integer.parseInt(todayArray[1]);
//		int todayDay = Integer.parseInt(todayArray[2]);
//		
//		int year = Integer.parseInt(expirationArray[0]);
//		int month = Integer.parseInt(expirationArray[1]);
//		int day = Integer.parseInt(expirationArray[2]);
//		
//		if(todayYear < year) {
//			return true;
//		} else if(todayYear == year && todayMonth < month) {
//			return true;
//		} else if(todayYear == year && todayMonth == month && todayDay <= day) {
//			return true;
//		} 
//		
//		return false;
		
		// 20221028 이런식으로 숫자 8자리로 만들면..!! 숫자비교로 더 쉽게 가능함
		// 이런식으로!! 간단한게 진짜 좋음ㅎㅎ
		
//		int todayDate = todayYear * 10000 + todayMonth * 100 + todayDay;
//		int expirationDate = year * 10000 + month * 100 + day;
//		
//		if(todayDate < expirationDate) {
//			return true;
//		} else {
//			return false;
//		}
		
		// 완전 굿아이디어~
//		String todayDate = today.replace("-", "");
//		String expirationDate = expiration.replace("-", "");
//		
//		int todayDay = Integer.parseInt(todayDate);
//		int expirationDay = Integer.parseInt(expirationDate);
//		
//		if(todayDay < expirationDay) {
//			return true;
//		} else {
//			return false;
//		}
			
		// 크다, 작다, 같다...그래서 boolean으로 안됨!
		// A B 비교하려고 A.compareTo(B)
		// A - B 라고 생각하믄 됨..!
		// A > B  1
		// A < B -1
		// A = B  0
		// 문자도 비교할수 있음!!!! 
		
		int result = today.compareTo(expiration);
		
		if(result == 1) {
			return false;
		} else {
			return true;
		}
		
		
				
	}
		
	
	
	

}
