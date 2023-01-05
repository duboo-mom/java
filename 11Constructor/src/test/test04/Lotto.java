package test.test04;

import java.util.Random;

public class Lotto {
	
	// 로또번호, 수동자동선택

	private int[] numbers = new int[6];
	
	// 수동입력
	public void setNumbers(int num1, int num2, int num3, int num4, int num5, int num6) {
		this.numbers[0] = num1;
		this.numbers[1] = num2;
		this.numbers[2] = num3;
		this.numbers[3] = num4;
		this.numbers[4] = num5;
		this.numbers[5] = num6;
	}
	
	// 자동입력
	// 스앵님은 public void auto() 라고 메소드이름 정함.. set을 멤버변수당 한번만 사용해야하나..?
	public void setAutoNumbers() {
		Random random = new Random();
		// 랜덤 6개 뽑기 - 중복없이!!
		
		for(int i = 0; i < this.numbers.length; i++) {
			
			// random.nextInt(); 은 파라미터 입력해도 되고 안해도됨 <-이거도 그럼 내부 클래스에서 override 되있는 것!
			// 45 입력하면 0 ~ 44 나옴
			this.numbers[i] = random.nextInt(45) + 1;
			
			
			// 중복 잘 제거되는지 확인하려면~? 난수 범위를 확 줄이면 쉬움! 지금은 45까지니까 한 8이렇게 줄여서~
			for(int j = 0; j < i; j++) {
				if(this.numbers[i] == this.numbers[j]) {
					i--;
					break;
				}
			}			
		}
	}
	
	public int[] getNumbers() {
		return this.numbers;
	}
	
	public void printLotto() {
		for(int i = 0; i < this.numbers.length; i++) {
			System.out.print(this.numbers[i] + " ");
		}
		System.out.println();
	}
	

	
	
}
