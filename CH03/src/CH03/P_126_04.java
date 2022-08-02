package CH03;

import java.util.Scanner;

public class P_126_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char day[] = { '일', '월', '화', '수', '목', '금', '토' };

		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("정수를 입력하세요");
				int userInput = sc.nextInt();
				System.out.println(day[userInput % 7]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("종료");
		}
		sc.close();

	}

}
