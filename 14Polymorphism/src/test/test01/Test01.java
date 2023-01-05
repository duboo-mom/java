package test.test01;

public class Test01 {

	public static void main(String[] args) {
				
		Animal[] animals = new Animal[2];
	    // up casting -> 하나의 배열에 다른 종류?의 객체 보관하려고
		animals[0] = new Cat();
	    animals[1] = new Dog();
			    
	    
	    for(int i = 0; i < animals.length; i++) {
	    	for(int j = 0; j < 3; j++) {
	    		animals[i].cry();
	    	} 		
	    }
	    
	    // down casting은 하기전에 상속되는지 먼저 확인해야함!
	    for(int i = 0; i < animals.length; i++) {
		    if(animals[i] instanceof Cat) {
	    		Cat cat = (Cat)animals[i];
	    		cat.grooming();
	    	} else {
	    		Dog dog = (Dog)animals[i];
	    		dog.lash();
	    	}
		    
		    // 나는 else로 했는데, 선생님은 if 하나 더 만들어서 함..!
	    }

	    
	    
	    

	}

}
