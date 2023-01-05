package test.test02;

public class Test02 {
	public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);
	
        
        // �̰� ���� Ǯ���Ѱǵ�.. print�޴°� downcasting�� ���ϴϲ�..
//        for(int i = 0; i < shape.length; i++) {
//        	shape[i].printArea();
//        }
        
        for(int i = 0; i < shape.length; i++) {
        	System.out.println("���� : " + shape[i].area());
        }
        
        
        for(int i = 0; i < shape.length; i++) {
        	if(shape[i] instanceof Triangle) {
        		Triangle triangle = (Triangle)shape[i];
        		System.out.println("�ﰢ���� ���̴� "+ triangle.area() + "cm^2 �Դϴ�." );
        	}
        	if(shape[i] instanceof Rectangle) {
        		Rectangle rectangle = (Rectangle)shape[i];
        		System.out.println("�簢���� ���̴� " + rectangle.area() + "cm^2 �Դϴ�.");
        	}
        	if(shape[i] instanceof Circle) {
        		Circle circle = (Circle)shape[i];
        		System.out.println("���� ���̴� " + circle.area() + "cm^2 �Դϴ�.");
        	}
        }
        
        
        
        
	}
	
}
