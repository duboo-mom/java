package test;

public class Test01 {

	public static void main(String[] args) {

		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
//		1. �迭 �� ����
//		�迭�� 4��° ���� 6���� �ٲټ���.
		
		numbers[3] = 6;
		
//		2. �迭 ���
//		�迭�� ���� ������ ����ϼ���.
//		��� ����
//
//		3 8 9 6 2 1 7 5
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		3. �迭 ���
//		�迭�� ���� �ݴ� ����(����)�� ����ϼ���.
//		��� ����
//
//		5 7 1 2 6 9 8 3 
		
		for(int i = (numbers.length - 1); i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		4. �迭 ���
//		�迭�� ¦����° ��ġ�� �ִ� ������ ��� �ϼ���.
//		��� ����
//
//		8 6 1 5 
		
		for(int i = 1; i < numbers.length; i += 2) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		5. index
//		�迭�� ���� �� 2�� ��� �ִ� index�� ����ϼ���.
//		��� ����
//
//		2�� ��� �ִ� index : 4
		
		for(int i = 0; i <numbers.length; i++) {
			if(numbers[i] == 2) {
				System.out.println("2�� ����ִ� index : " + i);
				break;
				// Ȥ�� ������ Ȯ���ؾ� �ϴ� ����� break ���־ߵ�
			}
		}

		
//		6. �ִ밪
//		�迭�� ���� �� ���� ū ���� ��� �ϼ���
//		��� ����
//
//		���� ū �� : 9
		int max = numbers[0];	
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("���� ū �� : " + max);
		
				
//		7. �ּҰ� index
//		�迭�� ���� �� ���� ���� ���� ����� index�� ����ϼ���.
//		��� ����
//
//		�ּҰ��� index : 5
		
//		int min = numbers[0];
//		int minIndex = 0;
//		for(int i = 1; i < numbers.length; i++) {
//			if(min > numbers[i]) {
//				min = numbers[i];
//				minIndex = i;
//			}			
//		}
//		System.out.println("�ּҰ��� index : " + minIndex);
		
//		���� min���ϰ� �� index�� ã�°ŷ� �ߴµ�, ������ min�� �����ϸ鼭 i �� ����ǰ� �ϸ��!!		
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] == min) {
//				System.out.println("�ּҰ��� index : " + i);
//			}
//		}
		
		// ���޴� Ǯ�� 2 - min ���� ���̵� ����~~
		int minIndex = 0;
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[minIndex] > numbers[i]) {
				minIndex = i;
			}			
		}
		System.out.println("�ּҰ��� index : " + minIndex);
					
				
//		8. �հ�
//		�迭�� ��� ���� ���� ��� �ϼ���
//		��� ����
//
//		���� �� : 41
				
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("���� �� : " + sum);
				
		
		
		
	}

}
