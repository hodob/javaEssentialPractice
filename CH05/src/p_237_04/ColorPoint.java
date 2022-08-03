package p_237_04;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}



public class ColorPoint extends Point{

	String z;
	
	public ColorPoint(int x, int y, String z) {
		super(x, y);
		this.z=z;
	}
	public void setPoint(int a,int b) {
		move(a,b);
	}
	public void setColor(String c) {
		this.z=c;
	}
	public void show(){
		System.out.println(z+"»öÀ¸·Î"+getX()+getY());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorPoint cp = new ColorPoint (5,5,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("GREEN");
		cp.show();
		
	}

}
