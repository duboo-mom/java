package test.test02;

public class Student {
	
	private String name;
	private String school;
	private String phone;
	private String lesson;
	
	public Student(String name, String school, String phone, String lesson) {
		this.name = name;
		this.school = school;
		this.phone = phone;
		this.lesson = lesson;		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSchool(String school) {
				
//		if(this.school != school) {
//			this.school = school;
//			System.out.println(this.name + "���� �б��� " + this.school + "�� ����Ǿ����ϴ�.");
//		}
		
		this.school = school;
		System.out.println(this.name + "���� �б��� " + this.school + "�� ����Ǿ����ϴ�." );
		
	}
	
	// �ƴϸ� getSchool ���� main�Լ����� ����Ʈ �ϴ°� ������??��
	
	// �̷������� ���ϴ� �κи� ����͵� ���� 
//	public String getFirstName() {
//		return this.name.substring(0, 1);
//	}
//	
//	public String getPhoneNumber() {
//		return this.phone;
//	}
		
//	public void printChangeSchool() {
//		System.out.println(this.name + "���� �б��� " + this.school + "�� ����Ǿ����ϴ�.");
//	}
	
	
	// ���޴��� �׳� �����Լ����� print�Ͻ� getter��
	public void sendLessonMessage() {
		System.out.println(this.name + "�л����� (" + this.phone + ") �������� �޽����� ���� �մϴ�.");
	}
	
	public void sendMessage(String text) {
		System.out.println(name + "�л����� (" + phone + ") " + text + " ��� ���� �մϴ�.");
	}
	
	public void printStudentInfo() {
		System.out.println(lesson + " ���� : " + school + " " + name + "�л�");
	}
	

}
