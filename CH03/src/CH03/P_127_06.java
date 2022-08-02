package CH03;

import java.util.Scanner;

public class P_127_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };

		while (true) {
			System.out.println("영어 단어를 입력하세요");
			String userInput = sc.nextLine();
			if (userInput.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}

			for (int i = 0; i < eng.length; i++) {
				if (eng[i].equals(userInput)) {
					System.out.println(kor[i]);
					break;
				}
			}
		}

	}

}
