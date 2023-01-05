package test.test01;

public class Product {
	
	private String name;
	private int price;
	private String expiration;
	
	public Product(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String expiration() {
		return this.expiration;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	
	
	int calTotalPrice(int count) {
		return price * count;
	}
	
	// 제품 정보를 출력하는 기능
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("유통기한 : " + expiration);
	}
		
	void printTotalPrice(int count) {
		System.out.println("제품 " + count + "개의 가격 : " + calTotalPrice(count));
	}
	
	

	boolean availableSale(String today) {
		int result = today.compareTo(expiration);
		
		if(result == 1) {
			return false;
		} else {
			return true;
		}
	}

}
