package CH03;

import java.util.Random;
import java.util.Scanner;

public class P_121_OpenChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�� �ٿ� �����Դϴ�.");
		Random random = new Random();
		int randomNum = random.nextInt(99);


		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("���ڸ� �Է����ּ���");
			int userNum = scanner.nextInt();
			if (randomNum > userNum) {
				System.out.println("������");
			} else if (randomNum < userNum) {
				System.out.println("�� ����");
			} else {
				System.out.println("����");
				break;
			}
		} scanner.close();

	}

}
