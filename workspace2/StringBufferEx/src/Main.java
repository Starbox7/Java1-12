import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		StringBuffer sb = new StringBuffer(text);

		while (true) {
			System.out.print("���: ");
			String cmd = scanner.nextLine();
			
			if (cmd.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			String [] tokens = cmd.split("!");
			if(tokens[0]=="" || tokens.length !=2) {
				System.out.println("�߸��� ����Դϴ�!");
				continue;
			}
			else {
				int index = sb.indexOf(tokens[0]);
				if(index==-1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				sb.replace(index, index+tokens[0].length(), tokens[1]);
			}
			System.out.println(sb);
		}
	}
}
