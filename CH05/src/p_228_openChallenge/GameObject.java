package p_228_openChallenge;

public abstract class GameObject {
	protected int distance;//ȭ���̵��Ÿ�
	protected int x,y; //������ġ(ȭ�� �� ���� ��ġ)

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
	public boolean collid(GameObject p) {//�� ��ü�� ��ü p �Ǿ� �浹������ true ����
		if(this.x ==p.getX()&&this.y==p.getY()) {
			System.out.println("�¸��ϼ̽��ϴ�.");
			return true;
		} else {
			return false;
		}
	}
	protected abstract void move(char a);//�̵��� ���� ���ο� ��ġ�� x y ����
	protected abstract char getShape();		//��ü�� ����� ��Ÿ���� ���� ����
	
}