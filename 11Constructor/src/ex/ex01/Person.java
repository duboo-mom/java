package ex.ex01;

public class Person {
	
	// �Ӽ�, ������� ���ϴ°� 1����
	// �̸�, ������� (19990403)
	private String name;
	private String birthday;
	
	// �����ڴ� Ư���� ������ �޼ҵ�! ����Ÿ�� ����, ��𼭵� ����ϰ�!
	// this.������� = �Ķ���Ͱ�
	// ���� ������ �ȿ� �Ķ���Ͱ��� �̸� �Ȱ�����!
	public Person(String name, String birthday){
		this.name = name;
		this.birthday = birthday;
	}
		
	// �ڱ� �Ұ� ���
	public void introduce() {
		System.out.println("�ȳ��ϼ��� ���� " + name + "�Դϴ�.");
		System.out.println("�� ��������� " + birthday + "�Դϴ�.");
	}
	
	// �̸� getter
	public String getName() {
		return this.name;
		// �׳� name�ص� �Ǳ��ϴµ� ��������� �ҷ��´ٴ� ���� Ȯ���ϰ�..!
	}
	
	// �̸� ���� ���
	// setter �Ķ���� �� �̸� ���� �����ϰ�~
	public void setName(String name) {
		this.name = name;
	}
	

}
