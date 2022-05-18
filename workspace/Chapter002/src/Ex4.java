import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float n1 = scanner.nextFloat();
		String oper = scanner.next();
		float n2 = scanner.nextFloat();

		float answer = 0.0f;
		int flag = 0;

		if (oper.equals("+") == true) {
			answer = n1 + n2;

			System.out.println(n1 + " " + oper + " " + n2 + " = " + answer);
		}

		else if (oper.equals("-") == true) {
			answer = n1 - n2;

			System.out.println(n1 + " " + oper + " " + n2 + " = " + answer);
		}

		else if (oper.equals("*") == true) {
			answer = n1 * n2;
			System.out.println(n1 + " " + oper + " " + n2 + " = " + answer);
		}

		else if (oper.equals("/") == true) {
			if (n2 == 0) {
				System.out.println("False");

				scanner.close();
				return;
			}
			answer = n1 / n2;
			System.out.println(n1 + " " + oper + " " + n2 + " = " + answer);
		}

	}
}