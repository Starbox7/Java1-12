package 중간고사I;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 0;

		if (i == 10) {
			j += 5;
		} else if (i == 20) {
			j += 10;
		} else {
			j += 100;
		}
		System.out.print(j);

	}

}
