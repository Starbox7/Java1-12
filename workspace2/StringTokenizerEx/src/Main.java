import java.util.*;

public class Main {
	public static void main(String[] args) {
		// add code...
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String query = scanner.nextLine();

			if (query.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}

			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
	}
}
