import java.util.*;

public class Main {
	public static void printBig(Vector<Integer> v) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지)>> ");
		var v = new Vector<Integer>(20);

		while (true) {
			int num = sc.nextInt();
			if (num == -1)
				break;
			v.add(num);
		}
		//System.out.println();
		
		int Max=0;
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)>Max)
				Max = v.get(i);
		}
		
		System.out.println("가장 큰 수는 "+Max);
	}
}