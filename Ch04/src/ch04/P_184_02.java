package ch04;

import java.util.Scanner;

public class P_184_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당ㅅ인의 이름과 전화번호 입력");
		Scanner scanner = new Scanner(System.in);

		Phone2 user1 = new Phone2(scanner.next(),scanner.next());		
		Phone2 user2 = new Phone2(scanner.next(),scanner.next());
		System.out.println(user1.getName()+user1.getTel());
		System.out.println(user2.getName()+user2.getTel());
		

		
	}

}
class Phone2{
	private String name, tel;
	public Phone2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}