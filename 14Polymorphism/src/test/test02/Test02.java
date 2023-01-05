package test.test02;

public class Test02 {
	public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);
	
        
        // 이건 내가 풀이한건데.. print받는건 downcasting을 못하니께..
//        for(int i = 0; i < shape.length; i++) {
//        	shape[i].printArea();
//        }
        
        for(int i = 0; i < shape.length; i++) {
        	System.out.println("넓이 : " + shape[i].area());
        }
        
        
        for(int i = 0; i < shape.length; i++) {
        	if(shape[i] instanceof Triangle) {
        		Triangle triangle = (Triangle)shape[i];
        		System.out.println("삼각형의 넓이는 "+ triangle.area() + "cm^2 입니다." );
        	}
        	if(shape[i] instanceof Rectangle) {
        		Rectangle rectangle = (Rectangle)shape[i];
        		System.out.println("사각형의 넓이는 " + rectangle.area() + "cm^2 입니다.");
        	}
        	if(shape[i] instanceof Circle) {
        		Circle circle = (Circle)shape[i];
        		System.out.println("원의 넓이는 " + circle.area() + "cm^2 입니다.");
        	}
        }
        
        
        
        
	}
	
}
