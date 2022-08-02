package CH03;

import java.util.Random;
import java.util.Scanner;

public class P_121_OpenChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("업 다운 게임입니다.");
		Random random = new Random();
		int randomNum = random.nextInt(99);


		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력해주세요");
			int userNum = scanner.nextInt();
			if (randomNum > userNum) {
				System.out.println("더높게");
			} else if (randomNum < userNum) {
				System.out.println("더 낮게");
			} else {
				System.out.println("정답");
				break;
			}
		} scanner.close();

	}

}
