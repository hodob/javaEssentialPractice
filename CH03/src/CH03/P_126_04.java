package CH03;

import java.util.Scanner;

public class P_126_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char day[] = { '��', '��', 'ȭ', '��', '��', '��', '��' };

		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("������ �Է��ϼ���");
				int userInput = sc.nextInt();
				System.out.println(day[userInput % 7]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����");
		}
		sc.close();

	}

}
