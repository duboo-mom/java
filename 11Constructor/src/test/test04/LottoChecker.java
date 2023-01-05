package test.test04;

import java.util.Random;

public class LottoChecker {
	
	private int[] winningNumber = new int[6];
	
	
	public void setWinningNumber() {
		
		Random random = new Random();
		
		for(int i = 0; i < this.winningNumber.length; i++) {
			
			this.winningNumber[i] = random.nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(this.winningNumber[i] == this.winningNumber[j]) {
					i--;
					break;
				}
			}
			
		}
				
	}
	
	public void printWinninNumber() {
		System.out.print("당첨 번호 : ");
		for(int i = 0; i < this.winningNumber.length; i++) {
			System.out.print(this.winningNumber[i] + " ");
		}
	}
	
	// 당첨여부 확인 기능
	// 스앵님은
	// public String check(Lotto lotto) 이런식으로 결과에 대한 string 만 리턴받음
	public void checkNumber(Lotto numbers) {
		int score = 0;
		for(int i = 0; i < this.winningNumber.length; i++) {
			for(int j = 0; j < this.winningNumber.length; j++) {
				if(numbers.getNumbers()[i] == this.winningNumber[j]) {
					score++;
					
				}
			}
		}
		
		String result = "";
		if(score == 0 || score == 1) {
			result = "꽝!";
		} else if(score == 2) {
			result = "5등";
		} else if(score == 3) {
			result = "4등";
		} else if(score == 4) {
			result = "3등";
		} else if(score == 5) {
			result = "2등";
		} else {
			result = "1등";
		}
		
		// 이런 경우는 switch로 표현할 수 있지만... 나는 지금 void로 정하고 프린트까지 해주기 때문에 return 할수없음.ㅎ..ㅎ.;;
		
//		switch(score) {
//		case 6:
//			return "1등";
//		case 5:
//			return "2등";
//		case 4:
//			return "3등";
//		case 3:
//			return "4등";
//		case 2:
//			return "5등";
//		default:
//			"꽝!";
//		}
		
		
		
		
		for(int i = 0; i < this.winningNumber.length; i++) {
			System.out.print(numbers.getNumbers()[i] + " ");
		}
		System.out.println(result);
				
	}
	
	

}
