package test.test02;

public class Test02 {

	public static void main(String[] args) {
		
		Student me = new Student("�ȹ���", "�������б�", "010-2977-9323", "java");
		
		me.printStudentInfo();
		me.setSchool("������б�^^");
//		me.printChangeSchool();
		me.printStudentInfo();
		me.sendLessonMessage();
		me.sendMessage("������~~~~");
		
//		Galaxy mine = new Galaxy("�Ｚ", "Gallaxy", "1234657987", "010-2977-9323");
//		
//		mine.printPhoneInfo();
//		mine.phoneCall("010-0000-0000");
//		mine.sendMessage("010-1234-1213", "�ڴ�..?");
		
		Galaxy myphone = new Galaxy("2132435");
		myphone.setPhone("010-1234-5453");
		
		myphone.printPhoneInfo();
		
		myphone.phoneCall("010-2135-2134");
		
	}

}