package test;

public class EntertainerApplicant implements Act, Sing {
	
	// ���� �� �־ �Ǳ� ��� �ǰ�
	private String name;
	private int age;

	@Override
	public void methodAct() {
		System.out.println("�����ϴ� ���");
	}

	@Override
	public void singASong() {
		System.out.println("�뷡�θ���~~~");
	}

}
