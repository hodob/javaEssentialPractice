package CH03;

import java.util.Scanner;

public class P_126_05_��Ʈ����ǰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("����10�� �Է�");
		int[] tenNum = new int[10];
		int[] tenCount = new int[tenNum.length];
		
		
		
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < tenNum.length; i++) {
			int userInput = scanner.nextInt();
			tenNum[i] = userInput;
		}
		System.out.println();

		for (int i = 0; i < tenNum.length; i++) {
			for (int j = 0; j < tenNum.length; j++) {
				
				if(tenNum[i]<tenNum[j]) {
					int text = tenNum[i];
					tenNum[i]=tenNum[j];
					tenNum[j]=text;
				}
			}
		}
		for( int s : tenNum) {
			System.out.println(s);
		}

	}

}
