package 중간고사IV;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int num;

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				num = sc.nextInt();
			} catch (InputMismatchException ime) {
				continue;
			}

			if (num>=1&&num<=9) {
				break;
			}

		}

		for (int row = 1; row <= num; row++) {
			for (int col = num; col >= 1; col--) {
				if (col == 1 && row == 1) {
					System.out.print(col);
				} else if (row >= col) {
					System.out.print(col + " ");
				} else {
					System.out.print("  ");
				}
			}

			for (int col = 2; col <= num; col++) {
				if (row > col) {
					System.out.print(col + " ");
				} else if (row == col) {
					System.out.print(col);
				}
			}
			if (row < num)
				System.out.println();
		}

	}

}
