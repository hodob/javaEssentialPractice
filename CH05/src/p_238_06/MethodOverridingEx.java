package p_238_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Shape {
	static List<String> list = new ArrayList<String>();

	public void draw() {
		System.out.println("Shape");
	}

	public void add() {
		list.add("Shape");
	}
	public void view() {
		for (int i = 0; i<list.size();i++)
			System.out.println(list.get(i));
	}
	public void remove(int a) {
		try {
			list.remove(a-1);
			System.out.println("삭제완료");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("삭제할수 없습니다.");
		}
	
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}

	public void add() {
		list.add("Line");
	}


}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}

	public void add() {
		list.add("Rect");
	}


}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}

	public void add() {
		list.add("Circle");
	}


}

public class MethodOverridingEx {
	static Scanner sc = new Scanner(System.in);

	static void paint(Shape p) {
		p.draw();
	}

	static void add(Shape p) {
		p.add();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());

		MethodOverridingEx main = new MethodOverridingEx();
		main.main();
	}

	public void main() {
		System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)");
		while (true) {
			switch (sc.nextInt()) {
			case 1:
				insert();
				break;
			case 2:
				remove();
				break;
			case 3:
				view();
				break;
			default:
				break;
			}
		}
	}

	public void insert() {
		System.out.println("도형 종류 Line(1),Rect(2),Circle(3) 4번 뒤로가기");
		while (true) {
			switch (sc.nextInt()) {
			case 1:
				add(new Line());
				System.out.println("Line 저장 완료");
				break;
			case 2:
				add(new Rect());
				System.out.println("Rect 저장 완료");
				break;
			case 3:
				add(new Circle());
				System.out.println("Circle 저장 완료");
				break;
			default:
				main();
				break;
			}
		}
	}
	public void view() {
		new Shape().view();
	}
	public void remove() {
		System.out.println("삭제할 도형의 위치");
		new Shape().remove(sc.nextInt());
		main();
		
	}
	

}
