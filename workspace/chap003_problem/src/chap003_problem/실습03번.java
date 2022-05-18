package chap003_problem;
import java.util.*;

public class ½Ç½À03¹ø {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			num = sc.nextInt();
			if(num>0&&num<19) break;
			else System.out.println("-1");
		} while(true);
		
		for(int j=num; j>0; j--) {
			for(int i=0; i<j; i++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
