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
			System.out.println("�����Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����Ҽ� �����ϴ�.");
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
		System.out.println("����(1), ����(2), ��κ���(3), ����(4)");
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
		System.out.println("���� ���� Line(1),Rect(2),Circle(3) 4�� �ڷΰ���");
		while (true) {
			switch (sc.nextInt()) {
			case 1:
				add(new Line());
				System.out.println("Line ���� �Ϸ�");
				break;
			case 2:
				add(new Rect());
				System.out.println("Rect ���� �Ϸ�");
				break;
			case 3:
				add(new Circle());
				System.out.println("Circle ���� �Ϸ�");
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
		System.out.println("������ ������ ��ġ");
		new Shape().remove(sc.nextInt());
		main();
		
	}
	

}
