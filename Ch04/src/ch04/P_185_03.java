package ch04;

import java.util.Scanner;

public class P_185_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rect[] r;
		r = new Rect[4];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요");

		for(int i = 0;i<r.length;i++) {
			r[i]=new Rect(sc.nextInt(),sc.nextInt());
		}
		
		int sum=0;
		for(int i = 0; i<r.length;i++) {
			sum+=r[i].getArea();
		}
	System.out.println(sum);
		
//		Rect rect1 = new Rect(sc.nextInt(), sc.nextInt());
//		Rect rect2 = new Rect(sc.nextInt(), sc.nextInt());
//		Rect rect3 = new Rect(sc.nextInt(), sc.nextInt());
//		Rect rect4 = new Rect(sc.nextInt(), sc.nextInt());

//		System.out.println(rect1.getArea() + rect2.getArea() + rect3.getArea() + rect4.getArea());

	}

}

class Rect {
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}
