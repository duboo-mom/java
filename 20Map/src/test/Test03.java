package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test03 {

    public static void main(String[] args) {
    	
    	
//    	 å�̸����� �۰��� ã��
//    	 å �̸��� �Է� ������ å�� �۰����� ����ϴ� ���α׷�
//    	 �帣���� å�� �۰��� ���� n�� ����ִ�.
//    	 ����ڷκ��� å�̸��� �Է� �޴´�.
//    	 å�̸��� �ش��ϴ� �۰����� ����Ѵ�.
//    	 ��) ������� �۰����� �������丮
    	
        // {�帣1={å����1=�۰�1, å����2=�۰�2}, �帣2={å����1=�۰�1, å����2=�۰�2}}

        // {
        //    �ڱ���={�� �غ�=�̼���,ȫ�ֿ�, �� �׸�=������, �޸��� ����=������ ����},
        //    �Ҽ�={�����=�������丮, �Ƹ��=�տ���, ���̾� ��ȭ���� ����=�����ó� ���̰�, �غ��� ī��ī=����ī�� �Ϸ�Ű},
        //    ����={�ð��� �帣�� �ʴ´�=ī���� �κ���, �ڽ���=Į ���̰�, �������=��ġ�� ī��}
        // }

        Map<String, Map<String, String>> bookMap = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("�� �غ�", "�̼���,ȫ�ֿ�");
        map1.put("�� �׸�", "������");
        map1.put("�޸��� ����", "������ ����");

        Map<String, String> map2 = new HashMap<>();
        map2.put("�����", "�������丮");
        map2.put("�Ƹ��", "�տ���");
        map2.put("���̾� ��ȭ���� ����", "�����ó� ���̰�");
        map2.put("�غ��� ī��ī", "����ī�� �Ϸ�Ű");

        Map<String, String> map3 = new HashMap<>();
        map3.put("�ð��� �帣�� �ʴ´�", "ī���� �κ���");
        map3.put("�ڽ���", "Į ���̰�");
        map3.put("�������", "��ġ�� ī��");

        bookMap.put("�ڱ���", map1);
        bookMap.put("�Ҽ�", map2);
        bookMap.put("����", map3);
//        System.out.println(bookMap);

        // å �̸� �Է�
        Scanner scan = new Scanner(System.in);
        System.out.print("å�̸��� �Է����ּ���: ");
        String searchBook = scan.nextLine();

        // TODO: �����ϱ�
        
        // å�̸� -> bookMap�� value�� map -> map�� key..!
        // �켱 bookMap�� set ���� �� key�� value�� key�� ��ȸ�ϸ�~?
        
        
        Set<String> bookKey = bookMap.keySet();
        
        // bookKey�� �ڱ���, �Ҽ�, �����̰� �̰ſ� ���� value -> map1, map2, map3�� ��
        // �� ������ �ʿ��� key�� Ȱ���ؼ� valueȮ��
        
        for(String key:bookKey) {        	
        	Map<String, String> books = bookMap.get(key);
        	
        	if(books.containsKey(searchBook)) {
            	System.out.println(searchBook + "�� �۰����� " + books.get(searchBook));
        	}
        }
        
        // null �� ������ִ� ���¸� �ǹ�
        // ��ü�� ������ ���� �������� null..
        
        
        
        
        
    }
}
