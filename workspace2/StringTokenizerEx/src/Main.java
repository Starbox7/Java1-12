import java.util.*;

public class Main {
	public static void main(String[] args) {
		// add code...
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String query = scanner.nextLine();

			if (query.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}

			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("���� ������ " + st.countTokens());
		}
	}
}
