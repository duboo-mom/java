package test;

public class Product {
	
	String name;
	int price;
	String expiration;
	
	//����������Ѵܾ� expiration
	
	// ������ ���� ���� ���
	int calTotalPrice(int count) {
//		int total = price * count;
//		return total;
//		���� ���� �ȸ����!
		
		return price * count;
	}
	
	// ��ǰ ������ ����ϴ� ���
	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price);
		System.out.println("������� : " + expiration);
	}
	
	
	
	void printTotalPrice(int count) {
		System.out.println("��ǰ " + count + "���� ���� : " + calTotalPrice(count));
	}
	
	
	// �ǸŰ��� ���� Ȯ�� ���
	// today format "2021-03-02"
	// �����ϸ� ���ϰ��� �ִ� �޼ҵ尡 ����!! void����~ �׷��� �ǸŰ��ɿ��δ� boolean���� �Ұ���
	
	boolean availableSale(String today) {
		
//		String[] todayArray = today.split("-");
//		String[] expirationArray = expiration.split("-");
//		
//		int todayYear = Integer.parseInt(todayArray[0]);
//		int todayMonth = Integer.parseInt(todayArray[1]);
//		int todayDay = Integer.parseInt(todayArray[2]);
//		
//		int year = Integer.parseInt(expirationArray[0]);
//		int month = Integer.parseInt(expirationArray[1]);
//		int day = Integer.parseInt(expirationArray[2]);
//		
//		if(todayYear < year) {
//			return true;
//		} else if(todayYear == year && todayMonth < month) {
//			return true;
//		} else if(todayYear == year && todayMonth == month && todayDay <= day) {
//			return true;
//		} 
//		
//		return false;
		
		// 20221028 �̷������� ���� 8�ڸ��� �����..!! ���ں񱳷� �� ���� ������
		// �̷�������!! �����Ѱ� ��¥ ��������
		
//		int todayDate = todayYear * 10000 + todayMonth * 100 + todayDay;
//		int expirationDate = year * 10000 + month * 100 + day;
//		
//		if(todayDate < expirationDate) {
//			return true;
//		} else {
//			return false;
//		}
		
		// ���� �¾��̵��~
//		String todayDate = today.replace("-", "");
//		String expirationDate = expiration.replace("-", "");
//		
//		int todayDay = Integer.parseInt(todayDate);
//		int expirationDay = Integer.parseInt(expirationDate);
//		
//		if(todayDay < expirationDay) {
//			return true;
//		} else {
//			return false;
//		}
			
		// ũ��, �۴�, ����...�׷��� boolean���� �ȵ�!
		// A B ���Ϸ��� A.compareTo(B)
		// A - B ��� �����Ϲ� ��..!
		// A > B  1
		// A < B -1
		// A = B  0
		// ���ڵ� ���Ҽ� ����!!!! 
		
		int result = today.compareTo(expiration);
		
		if(result == 1) {
			return false;
		} else {
			return true;
		}
		
		
				
	}
		
	
	
	

}
