package p_228_openChallenge;

public abstract class GameObject {
	protected int distance;//화면이동거리
	protected int x,y; //현제위치(화면 맵 상의 위치)

	public GameObject(int startX, int startY, int distance) {
		this.x =startX;
		this.y=startY;
		this.distance = distance;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean collid(GameObject p) {//이 객체가 객체 p ㅗ아 충돌했으면 true 리턴
		if(this.x ==p.getX()&&this.y==p.getY()) {
			System.out.println("승리하셨습니다.");
			return true;
		} else {
			return false;
		}
	}
	protected abstract void move(char a);//이동한 후의 새로운 위치로 x y 변경
	protected abstract char getShape();		//객체의 모양을 나타내는 문자 리턴
	
}
