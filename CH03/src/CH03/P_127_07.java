package CH03;

public class P_127_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 100; i++) {

			int count = 0;
			int ten = i / 10;
			int num = i % 10;

			if (ten != 0) {
				if (ten % 3 == 0)
					count++;
			}
			if (num != 0) {
				if (num % 3 == 0)
					count++;
			}

			if (i % 3 == 0) {
				if (count == 2)
					System.out.println(i + "박수두번" + count);
				else
					System.out.println(i + "박수한번" + count);
			}
			count = 0;
		}

	}

}
