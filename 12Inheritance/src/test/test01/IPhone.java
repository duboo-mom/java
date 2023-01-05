package test.test01;

public class IPhone extends IPodTouch {
	
	private String phoneNumber;
	
	public IPhone(String phoneNumber) {
//		super(); �Ƚ��൵ �˾Ƽ� ��~
		super.setModel("iPhone");
		this.phoneNumber = phoneNumber;
	}
	
	// �������̵�� �ִ��� �θ�Ŭ������ �޼ҵ带 �״�� Ȱ���� ��..!! 
	@Override
	public String infoString() {
		return super.infoString() + "\n��ȭ ��ȣ : " + this.phoneNumber;
	}
	
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + " �� ��ȭ ��");
	}
	
	public void sendMessage(String phoneNumber, String message) {
		System.out.println(phoneNumber + " �� " + message + "����");
	}
	
	
	
}
