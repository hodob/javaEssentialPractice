package CH03;

import java.util.Scanner;

public class P_127_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };

		while (true) {
			System.out.println("���� �ܾ �Է��ϼ���");
			String userInput = sc.nextLine();
			if (userInput.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}

			for (int i = 0; i < eng.length; i++) {
				if (eng[i].equals(userInput)) {
					System.out.println(kor[i]);
					break;
				}
			}
		}

	}

}
