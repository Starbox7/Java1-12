package chap003_problem;
import java.util.*;

public class ½Ç½À3¹ø {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			char c;
			
			do {
				String str = sc.next();
				c = str.charAt(0);
				
				if(c>='a'&&c<='z') break;
				else System.out.println("-1");
			} while(true);
			
			  for(int i = 0; i<=c-'a'; i++) {
			         for(char j = 'a'; j<= c-i; j++) {
			            System.out.print(j);
			         }
			         System.out.println();
			      }
		
	}

}
