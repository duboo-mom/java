package test;

public class Test01 {

	public static void main(String[] args) {
		
		
		// 1.
		PhoneInfo samsung = new PhoneInfo();
		samsung.company = "samsung";
		samsung.model = "������s10e";
		samsung.number = "01012345678";
		
		PhoneInfo apple = new PhoneInfo();
		apple.company = "apple";
		apple.model = "iPhoneSE";
		apple.number = "01024684312";
		
		System.out.println(samsung.company);
		System.out.println(samsung.model);
		System.out.println(samsung.number);
		System.out.println(apple.company);
		System.out.println(apple.model);
		System.out.println(apple.number);
		
		
		PhoneInfo myphone = new PhoneInfo();
		myphone.company = "apple";
		myphone.model = "iPhone 13mini";
		myphone.number = "01029779323";
		
		System.out.println(myphone.company);
		System.out.println(myphone.model);
		System.out.println(myphone.number);

		
		
		// 2.
		
		StudentData jaeseok = new StudentData();
		jaeseok.name = "���缮";
		jaeseok.age = 21;
		jaeseok.className = "java";
		jaeseok.phoneNumber = "01012345678";
		
		StudentData hyolee = new StudentData();
		hyolee.name = "��ȿ��";
		hyolee.age = 23;
		hyolee.className = "java";
		hyolee.phoneNumber = "01024571896";
		
//		System.out.println(jaeseok.name);
//		System.out.println(jaeseok.age);
//		System.out.println(jaeseok.className);
//		System.out.println(jaeseok.phoneNumber);
		
		// �迭�� ��ü�ֱ�...
		String[] name = {jaeseok.name, hyolee.name};
		int[] age = {jaeseok.age, hyolee.age};
		String[] className = {jaeseok.className, hyolee.className};
		String[] phoneNumber = {jaeseok.phoneNumber, hyolee.phoneNumber};		
		
		for(int i = 0; i < 2; i++) {
			System.out.println(name[i]);
			System.out.println(age[i]);
			System.out.println(className[i]);
			System.out.println(phoneNumber[i]);
		}
		
		// ���޴�
		StudentData student1 = new StudentData();
		student1.name = "�ȹ���";
		student1.className = "java";
		student1.age = 20;
		student1.phoneNumber = "010-2971-8322";
		
//		int[] numbers = new int[2];
//		numbers[0] = 1;
//		numbers[1] = 2;
//		�̷������� �ϴ°�!! ���� ������
		
		StudentData[] students = new StudentData[2];
		students[0] = student1;
		students[1] = jaeseok;
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].className);
		}

		
		
		
		

	}

}
