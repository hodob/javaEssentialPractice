package p_228_openChallenge;


public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move(char a) {// 이동한 후의 새로운 위치로 x y 변경
		

			switch (a) {
			case 'a':
				if(y==0)System.out.println("이동할 수 없습니다.");
				else y--;
				break;
			case 's':
				if(x==Game.field.length-1)System.out.println("이동할 수 없습니다.");
				else x++;
				break;
			case 'd':
				if(y==Game.field[0].length-1) System.out.println("이동할 수 없습니다.");
				else y++;
				break;
			case 'w':
				if(x==0) System.out.println("이동할 수 없습니다.");
				else x--;
				break;
			}

		
		
	}

	@Override
	protected char getShape() {// 객체의 모양을 나타내는 문자 리턴

		return 'B';
	}

}
