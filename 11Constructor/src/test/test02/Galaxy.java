package test.test02;

public class Galaxy {
	
	String maker;
	String model;
	String serialNumber;
	String phone;
	
	public Galaxy(String phone) {
		this.maker = "삼성";
		this.model = "Flip3";
		this.serialNumber = "123145678";
		this.phone = phone;
	}
	
	public void printPhoneInfo() {
		System.out.println(this.maker + "에서 제조된 " + this.model + " 입니다.");
		System.out.println("전화 번호 : " + this.phone);
		System.out.println("일련 번호 : " + this.serialNumber);
			
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void phoneCall(String phoneNumber) {
		System.out.println(phoneNumber + " 로 전화를 겁니다 뚜르르르르.....");
	}
	
	public void sendMessage(String phoneNumber, String text) {
		System.out.println(phoneNumber + " 로 \"" + text + "\" 메시지를 전송 합니다." );
	}
	
	
	

}
