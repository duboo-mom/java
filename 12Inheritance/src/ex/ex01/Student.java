package ex.ex01;

public class Student extends Person {
	
	// �̸�, �������, �б��̸�
	private String school;		

	// �θ� Ŭ������ �����ڰ� ȣ��Ǿ�� �ϴµ� ������ �����ָ� ������
	
	public Student(String name, String birthday, String school) {
//		this.name = name;
//		this.birthday = birthday;
		super(name, birthday);	// <- ��� �θ�Ŭ������ �����ڸ� ȣ���ϴ� ��. �׷��� �θ�Ŭ���� ������ ������ �� ��! new Person("�ȹ���", "19930203");	
		this.school = school;
	}
	
	// annotation �������̵忡 ���� �ʴ� ����?�� ���� �����
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("���� " + this.school + "�ٴմϴ�.");
	}
	
	
	

}
