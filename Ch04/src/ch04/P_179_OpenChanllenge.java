package ch04;

import java.util.Scanner;

public class P_179_OpenChanllenge {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		P_179_OpenChanllenge game = new P_179_OpenChanllenge();
		game.run();

	}

	// ������
	public P_179_OpenChanllenge() {

	}

	public void run() {
		String words = "�ƹ���";
		
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�?");
		Player2[] player = new Player2[sc.nextInt()];
//		sc.next();
		System.out.println("�������� �̸��� �Է��ϼ���");
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player2(sc.next());
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ��� �Դϴ�.");
		int i = 0;
		while (true) {
			player[i].getWordFromUser(words);
			String userInput = sc.next();
			System.out.println(player[i].name + ">>");
			if (player[i].checkSuccess(userInput)) {
				break;
			} else {
				words = userInput;
			}
			i++;
			i = i % player.length;
		}

	}
}

class Player2 {
	String name;
	String word = "�ƹ���";
	char lastChar;
	char firstChar;

	public void getWordFromUser(String a) {
		System.out.println(a + "����");
		word = a;

	}

	public boolean checkSuccess(String b) {
		int lastIndex = word.length() - 1;
		lastChar = word.charAt(lastIndex);
		System.out.println(lastChar + "�̶�" + b.charAt(0) + "��");
		if (lastChar == b.charAt(0)) {
			System.out.println("���� �ܾ� ����");
			return false;
		} else {
			System.out.println("��������");
			return true;
		}

	}

	public Player2(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}