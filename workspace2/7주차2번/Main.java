import java.util.*;

public class Main {
	public static void print(Vector<Integer> v) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var v = new Vector<Integer>(100);
		int sum = 0;
		int i = 0;
		int j = 0;

		while (true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			v.add(num);
			for (i = 0; i < v.size(); i++) {
				System.out.print(v.get(i) + " ");

			}
			sum += v.get(j);
			System.out.println();
			System.out.println("���� ��� " + sum / i);
			j++;
		}
	}
}
