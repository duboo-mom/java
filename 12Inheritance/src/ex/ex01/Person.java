package ex.ex01;

public class Person {

	// �̸�, �������
//	protected String name;
//	protected String birthday;
	private String name;
	private String birthday;
	
	
	// �⺻ ������
//	public Person() {
//		System.out.println("Person ����");
//	}
	
	public Person(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	// ��� ���
	public void introduce() {
		System.out.println("���� " + this.name + "�Դϴ�.");
		System.out.println("���� ������ " + this.birthday + " ����");
	}
	
	
}
