package test.test01;

public class Test01 {

	public static void main(String[] args) {
		
		IPhone mine = new IPhone("010-1234-5678");
		
		System.out.println(mine.infoString());
		mine.internetBrowsing("https://www.google.com");
		mine.call("010-000-0000");
		mine.sendMessage("010-1111-2222", "せせせせ");
		
		
	}

}
