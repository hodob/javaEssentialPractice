package p_228_openChallenge;


public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move(char a) {// �̵��� ���� ���ο� ��ġ�� x y ����
		

			switch (a) {
			case 'a':
				if(y==0)System.out.println("�̵��� �� �����ϴ�.");
				else y--;
				break;
			case 's':
				if(x==Game.field.length-1)System.out.println("�̵��� �� �����ϴ�.");
				else x++;
				break;
			case 'd':
				if(y==Game.field[0].length-1) System.out.println("�̵��� �� �����ϴ�.");
				else y++;
				break;
			case 'w':
				if(x==0) System.out.println("�̵��� �� �����ϴ�.");
				else x--;
				break;
			}

		
		
	}

	@Override
	protected char getShape() {// ��ü�� ����� ��Ÿ���� ���� ����

		return 'B';
	}

}