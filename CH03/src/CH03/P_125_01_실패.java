package CH03;

import java.util.Scanner;

public class P_125_01_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ĺ��ҹ��ڸ� �Է����ּ���");
//		char userInput = scanner.nextLine().charAt(0);
		char userInput = 'e';

		for(int i = 'a'; i <= userInput; i++) {
			if(i <= userInput) {
				System.out.print((char)i);
			}
			for(int j = i+1; j <= userInput; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
