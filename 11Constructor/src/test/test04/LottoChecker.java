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
		System.out.print("��÷ ��ȣ : ");
		for(int i = 0; i < this.winningNumber.length; i++) {
			System.out.print(this.winningNumber[i] + " ");
		}
	}
	
	// ��÷���� Ȯ�� ���
	// ���޴���
	// public String check(Lotto lotto) �̷������� ����� ���� string �� ���Ϲ���
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
			result = "��!";
		} else if(score == 2) {
			result = "5��";
		} else if(score == 3) {
			result = "4��";
		} else if(score == 4) {
			result = "3��";
		} else if(score == 5) {
			result = "2��";
		} else {
			result = "1��";
		}
		
		// �̷� ���� switch�� ǥ���� �� ������... ���� ���� void�� ���ϰ� ����Ʈ���� ���ֱ� ������ return �Ҽ�����.��..��.;;
		
//		switch(score) {
//		case 6:
//			return "1��";
//		case 5:
//			return "2��";
//		case 4:
//			return "3��";
//		case 3:
//			return "4��";
//		case 2:
//			return "5��";
//		default:
//			"��!";
//		}
		
		
		
		
		for(int i = 0; i < this.winningNumber.length; i++) {
			System.out.print(numbers.getNumbers()[i] + " ");
		}
		System.out.println(result);
				
	}
	
	

}
