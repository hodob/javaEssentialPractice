package CH03;

import java.util.Scanner;

public class P_126_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("정수10개 입력");
		int[] tenNum = new int[10];
		Scanner scanner = new Scanner(System.in);
	
		for(int i = 0;i<tenNum.length;i++) {
			int userInput = scanner.nextInt();
			tenNum[i]=userInput;
		}
		System.out.println();
		for(int a : tenNum) {
			if(a%3==0) System.out.println(a);
		}
		
		
	}

}
