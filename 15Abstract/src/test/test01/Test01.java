package test.test01;

public class Test01 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];

	    shapes[0] = new Rectangle(10, 25);
	    shapes[1] = new Circle(8);

	    // TODO : ����
	    
	    for(int i = 0; i < shapes.length; i++) {
//	    	double area = shapes[i].calculateArea();
//	    	double round = shapes[i].calculateRound();
//	    	
//	    	System.out.println("���� : " + area + " �ѷ� : " + round);
	    	
	    	shapes[i].printInfo();
	    	
	    }

	}

}
