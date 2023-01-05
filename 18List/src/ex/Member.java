package ex;

public class Member {
	
	// 이름, 전화번호
	private String name;
	private String phoneNumber;
	
	public Member(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return this.name;
	}
		
	// 안해두면..! 객체주소 print됨
	@Override
	public String toString() {
		return this.name + " : " + this.phoneNumber;
	}

}
