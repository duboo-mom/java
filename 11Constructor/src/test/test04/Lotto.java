package test.test04;

import java.util.Random;

public class Lotto {
	
	// �ζǹ�ȣ, �����ڵ�����

	private int[] numbers = new int[6];
	
	// �����Է�
	public void setNumbers(int num1, int num2, int num3, int num4, int num5, int num6) {
		this.numbers[0] = num1;
		this.numbers[1] = num2;
		this.numbers[2] = num3;
		this.numbers[3] = num4;
		this.numbers[4] = num5;
		this.numbers[5] = num6;
	}
	
	// �ڵ��Է�
	// ���޴��� public void auto() ��� �޼ҵ��̸� ����.. set�� ��������� �ѹ��� ����ؾ��ϳ�..?
	public void setAutoNumbers() {
		Random random = new Random();
		// ���� 6�� �̱� - �ߺ�����!!
		
		for(int i = 0; i < this.numbers.length; i++) {
			
			// random.nextInt(); �� �Ķ���� �Է��ص� �ǰ� ���ص��� <-�̰ŵ� �׷� ���� Ŭ�������� override ���ִ� ��!
			// 45 �Է��ϸ� 0 ~ 44 ����
			this.numbers[i] = random.nextInt(45) + 1;
			
			
			// �ߺ� �� ���ŵǴ��� Ȯ���Ϸ���~? ���� ������ Ȯ ���̸� ����! ������ 45�����ϱ� �� 8�̷��� �ٿ���~
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
