package ex;

public class Member {
	
	// �̸�, ��ȭ��ȣ
	private String name;
	private String phoneNumber;
	
	public Member(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return this.name;
	}
		
	// ���صθ�..! ��ü�ּ� print��
	@Override
	public String toString() {
		return this.name + " : " + this.phoneNumber;
	}

}
