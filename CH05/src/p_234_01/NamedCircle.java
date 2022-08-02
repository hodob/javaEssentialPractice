package p_234_01;

public class NamedCircle extends Circle {
	
	private String name;
	
	
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	
	
	public static void main(String[] args) {

		NamedCircle w = new NamedCircle(5,"Waffle");
		w.show();
	}

	public void show() {
		System.out.println(getRadius()+name);
	}
}
