package CH03;

import java.util.Random;
import java.util.Scanner;

public class P_128_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");
		System.out.println("가위 바위 보!");
		
		Random random = new Random();
		int pcNum = random.nextInt(3);
		String pc[]= {"가위","바위","보"};
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		System.out.println("컴퓨터는"+pc[pcNum]);
		if(pc[pcNum].equals("가위")) {
			if(userInput.equals("가위")) System.out.println("비김");
			if(userInput.equals("보")) System.out.println("짐");
			if(userInput.equals("바위")) System.out.println("이김");
			
		}
		if(pc[pcNum].equals("바위")) {
			if(userInput.equals("가위")) System.out.println("짐");
			if(userInput.equals("보")) System.out.println("이김");
			if(userInput.equals("바위")) System.out.println("비김");
			
		}
		if(pc[pcNum].equals("보")) {
			if(userInput.equals("가위")) System.out.println("짐");
			if(userInput.equals("보")) System.out.println("비김");
			if(userInput.equals("바위")) System.out.println("짐");
			
		}
		
	}

}
