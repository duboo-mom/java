package test.test02;

public class Galaxy {
	
	String maker;
	String model;
	String serialNumber;
	String phone;
	
	public Galaxy(String phone) {
		this.maker = "�Ｚ";
		this.model = "Flip3";
		this.serialNumber = "123145678";
		this.phone = phone;
	}
	
	public void printPhoneInfo() {
		System.out.println(this.maker + "���� ������ " + this.model + " �Դϴ�.");
		System.out.println("��ȭ ��ȣ : " + this.phone);
		System.out.println("�Ϸ� ��ȣ : " + this.serialNumber);
			
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void phoneCall(String phoneNumber) {
		System.out.println(phoneNumber + " �� ��ȭ�� �̴ϴ� �Ѹ�������.....");
	}
	
	public void sendMessage(String phoneNumber, String text) {
		System.out.println(phoneNumber + " �� \"" + text + "\" �޽����� ���� �մϴ�." );
	}
	
	
	

}
