package p_228_openChallenge;

import java.util.Random;
import java.util.Scanner;

public class Game {
	Random random = new Random();
	public static char[][] field = new char[10][20];
	
	Bear bear = new Bear(0, 0, 1);
	Fish fish = new Fish(random.nextInt(field.length), random.nextInt(field[0].length), 1);
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}
	
	public void run() {
		System.out.println("Bear �� Fish �Ա� �����������մϴ�.");
		
		// �ʵ� �ʱ�ȭ
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				field[i][j] = '-';
			}
		}
		
		// bear ó����ġ�Է�
		field[bear.getX()][bear.getY()] = bear.getShape();
		
		// fish ó����ġ�Է�
		field[fish.getX()][fish.getY()] = fish.getShape();

		while (true) {
			fieldUpdate();
			System.out.print("����(a), �Ʒ�(s), ��(w), ������(d) >>");
			Scanner scanner = new Scanner(System.in);
			bear.move(scanner.next().charAt(0));
			fish.move('a');
			if (bear.collid(fish)) {
				fieldUpdate();
				break;
			}
		}
		
	}
	public void fieldUpdate() {
		//�ʵ��ʱ�ȭ
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				field[i][j] = '-';
			}
		}
		
			//�� ������ ��ġ(��ǥ) ������Ʈ
			field[fish.getX()][fish.getY()] = fish.getShape();
			field[bear.getX()][bear.getY()] = bear.getShape();

		
		//�ʵ�ǥ��
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}

	}
}
class getField{

	
	public static char[][] getField() {
		return Game.field;
	}

	public static void setField(char[][] field) {
		Game.field = field;
	}
	
	
}

