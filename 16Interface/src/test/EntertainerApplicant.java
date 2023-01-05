package test;

public class EntertainerApplicant implements Act, Sing {
	
	// 지금 머 있어도 되구 없어도 되고
	private String name;
	private int age;

	@Override
	public void methodAct() {
		System.out.println("연기하는 모습");
	}

	@Override
	public void singASong() {
		System.out.println("노래부르기~~~");
	}

}
