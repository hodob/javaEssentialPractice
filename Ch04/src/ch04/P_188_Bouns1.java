package ch04;

import java.util.Scanner;

public class P_188_Bouns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Player[] p = new Player[2];
		for (int i = 0; i < p.length; i++) {
			System.out.println("선수이름입력");
			p[i] = new Player(scanner.next());
		}
		int n = 0;
		while (true) {
			System.out.print(p[n].getName() + ", 엔터외 치세오ㅛ");
			scanner.next();
			int[] val = new int[3];
			for (int i = 0; i < val.length; i++) {
				val[i] = (int) (Math.random() * 3);
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if (val[0] == val[1] && val[1] == val[2]) {
				System.out.println(p[n].getName() + "씨의 승리");
				break;
			}
			n++;
			n=n%2;
		}
		scanner.close();
	}

}

class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}