package ch04;

import java.util.Scanner;

public class P_179_OpenChanllenge {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		P_179_OpenChanllenge game = new P_179_OpenChanllenge();
		game.run();

	}

	// 생성자
	public P_179_OpenChanllenge() {

	}

	public void run() {
		String words = "아버지";
		
		System.out.println("게임에 참가하는 인원은 몇명입니까?");
		Player2[] player = new Player2[sc.nextInt()];
//		sc.next();
		System.out.println("참가자의 이름을 입력하세요");
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player2(sc.next());
		}
		System.out.println("시작하는 단어는 아버지 입니다.");
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
	String word = "아버지";
	char lastChar;
	char firstChar;

	public void getWordFromUser(String a) {
		System.out.println(a + "저장");
		word = a;

	}

	public boolean checkSuccess(String b) {
		int lastIndex = word.length() - 1;
		lastChar = word.charAt(lastIndex);
		System.out.println(lastChar + "이랑" + b.charAt(0) + "비교");
		if (lastChar == b.charAt(0)) {
			System.out.println("맞음 단어 저장");
			return false;
		} else {
			System.out.println("게임종료");
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