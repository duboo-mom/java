package test.test01;

public class IPhone extends IPodTouch {
	
	private String phoneNumber;
	
	public IPhone(String phoneNumber) {
//		super(); 안써줘도 알아서 들어감~
		super.setModel("iPhone");
		this.phoneNumber = phoneNumber;
	}
	
	// 오버라이드는 최대한 부모클래스의 메소드를 그대로 활용할 것..!! 
	@Override
	public String infoString() {
		return super.infoString() + "\n전화 번호 : " + this.phoneNumber;
	}
	
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + " 로 통화 중");
	}
	
	public void sendMessage(String phoneNumber, String message) {
		System.out.println(phoneNumber + " 로 " + message + "전송");
	}
	
	
	
}
