package test.test02;

public class Test02 {

	public static void main(String[] args) {
		
		//∏∏≥‚« 
		FountainPen myFountainPen = new FountainPen();
		
		myFountainPen.setAmount(100);
		myFountainPen.setColor("black");
				
		System.out.println("∏∏≥‚«  : " + myFountainPen.getAmount() + myFountainPen.getColor());
		myFountainPen.refill(200);
		System.out.println("∏∏≥‚«  : " + myFountainPen.getAmount() + myFountainPen.getColor());
		
		// ∫º∆Ê
		Ballpen myBallpen = new Ballpen();
		
		myBallpen.setColor("red");
		myBallpen.setAmount(50);
		
		System.out.println("∫º∆Ê : " + myBallpen.getAmount() + myBallpen.getColor());
		
		//ª˛«¡
		SharpPencil mine = new SharpPencil();
		mine.setAmount(10);
		
		System.out.println("ª˛«¡ : " + mine.getAmount());
		
		
		
		
		
	}

}
