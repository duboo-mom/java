package test.test04;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		
		Lotto lotto1 = new Lotto();
		lotto1.setNumbers(2, 3, 12, 29, 33, 42);
		lotto1.printLotto();
		
		Lotto lotto2 = new Lotto();
		lotto2.setAutoNumbers();
		lotto2.printLotto();
		
		LottoChecker round1 = new LottoChecker();
		round1.setWinningNumber();
		round1.printWinninNumber();
		System.out.println();
		
		round1.checkNumber(lotto1);
		round1.checkNumber(lotto2);
		
//		Lotto mylotto = new Lotto();
//		
//		������ 1��Ƿ���..~? �ٵ� ���� ����� �����ϴ� �޼ҵ尡 ��� ���� check��� �޼ҵ� ��������~
		
//		for(int i = 0; i < 10000; i++) {
//			mylotto.setAutoNumbers();
//			String ranking = round1.check(mylotto);
//			
//			if(ranking.equals("1��")) {
//				System.out.println(ranking);
//			}
//		}
		
		
		
		
	}

}
