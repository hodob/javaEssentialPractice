package p_236_03;

import java.util.Scanner;

abstract class Calculator {
	protected int a, b;

	abstract protected int calc(); // �߻�޼ҵ�

	protected void input() { // �� ������ �Է¹޴� �޼ҵ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}

	public void run() { // �� ������ �Է¹޾� ����ϰ� ����� ����ϴ� �޼ҵ�
		input();
		int res = calc();
		System.out.println("���� ���� " + res);
	}
}

class Adder {
	
}

class Subtracter {

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();

	}

}