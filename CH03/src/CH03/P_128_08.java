package CH03;

import java.util.Random;
import java.util.Scanner;

public class P_128_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �����մϴ�.");
		System.out.println("���� ���� ��!");
		
		Random random = new Random();
		int pcNum = random.nextInt(3);
		String pc[]= {"����","����","��"};
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		System.out.println("��ǻ�ʹ�"+pc[pcNum]);
		if(pc[pcNum].equals("����")) {
			if(userInput.equals("����")) System.out.println("���");
			if(userInput.equals("��")) System.out.println("��");
			if(userInput.equals("����")) System.out.println("�̱�");
			
		}
		if(pc[pcNum].equals("����")) {
			if(userInput.equals("����")) System.out.println("��");
			if(userInput.equals("��")) System.out.println("�̱�");
			if(userInput.equals("����")) System.out.println("���");
			
		}
		if(pc[pcNum].equals("��")) {
			if(userInput.equals("����")) System.out.println("��");
			if(userInput.equals("��")) System.out.println("���");
			if(userInput.equals("����")) System.out.println("��");
			
		}
		
	}

}