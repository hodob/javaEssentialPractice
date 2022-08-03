package p_238_Bouns_01;

public class Circle implements Shape {
	int radius = 12;
	double mash;
	
	Circle(int a) {
		radius = a;
	}
	
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("¹ÝÁö¸§"+radius);
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub

		return radius*radius*PI;
	}

}
