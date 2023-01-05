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
//			System.out.println(this.name + "님의 학교가 " + this.school + "로 변경되었습니다.");
//		}
		
		this.school = school;
		System.out.println(this.name + "님의 학교가 " + this.school + "로 변경되었습니다." );
		
	}
	
	// 아니면 getSchool 만들어서 main함수에서 프린트 하는게 나을까??ㅎ
	
	// 이런식으로 원하는 부분만 떼어와도 ㅇㅋ 
//	public String getFirstName() {
//		return this.name.substring(0, 1);
//	}
//	
//	public String getPhoneNumber() {
//		return this.phone;
//	}
		
//	public void printChangeSchool() {
//		System.out.println(this.name + "님의 학교가 " + this.school + "로 변경되었습니다.");
//	}
	
	
	// 스앵님은 그냥 메인함수에서 print하심 getter로
	public void sendLessonMessage() {
		System.out.println(this.name + "학생에게 (" + this.phone + ") 수업일정 메시지를 전송 합니다.");
	}
	
	public void sendMessage(String text) {
		System.out.println(name + "학생에게 (" + phone + ") " + text + " 라고 전송 합니다.");
	}
	
	public void printStudentInfo() {
		System.out.println(lesson + " 수업 : " + school + " " + name + "학생");
	}
	

}
