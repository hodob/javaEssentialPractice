package ch04;

import java.util.Scanner;

public class P_185_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("�ο���");
		Phone[] phone = new Phone[sc.nextInt()];
		for (int i = 0; i < phone.length; i++) {
			System.out.println("�̸� ��ȭ��ȣ �Է�");
			phone[i] = new Phone(sc.next(), sc.next());
		}
		System.out.println("����Ϸ�");

		while (true) {
			System.out.println("�˻����̸�");
			String userInput = sc.next();
			if(userInput.equals("exit"))break;
			for(int i = 0; i < phone.length;i++) {
				if(userInput.equals(phone[i].getName())) System.out.println(phone[i].getTel());
			}
		}
	}

}

class Phone {
	String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}