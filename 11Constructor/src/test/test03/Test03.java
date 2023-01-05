package test.test03;

public class Test03 {

	public static void main(String[] args) {
		
		OmrCard card1 = new OmrCard("안미정", "12345678");
		card1.setMarking(1, 2, 4, 4, 5);
//		int[] marking = {1, 2, 3, 4, 5};
//		card1.setMarking(marking);

//		card1.setMarking(1, 3);
//		card1.setMarking(2, 4);
//		card1.setMarking(4, 2);
//		card1.setMarking(5, 3);
//		card1.setMarking(3, 1);
		
//		card1.printInfo();
		
		
		OmrCard card2 = new OmrCard("김메가", "12345679");
		card2.setMarking(1, 2, 3, 4, 5);
		
		OmrCardReader test1 = new OmrCardReader();
		
		test1.setAnswer(1, 2, 4, 5, 5);
//		test1.printInfo();
		
		test1.printScore(card1);;
		
		System.out.println();
		test1.printScore(card2);
		
		
		
		

	}

}
