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
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
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
			System.out.println("현재 평균 " + sum / i);
			j++;
		}
	}
}
