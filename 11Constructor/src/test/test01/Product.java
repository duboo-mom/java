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
	
	// ��ǰ ������ ����ϴ� ���
	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price);
		System.out.println("������� : " + expiration);
	}
		
	void printTotalPrice(int count) {
		System.out.println("��ǰ " + count + "���� ���� : " + calTotalPrice(count));
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
