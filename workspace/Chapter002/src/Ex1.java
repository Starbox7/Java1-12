import java.util.Scanner;

//자바 2주차 실습 문제

public class Ex1 {

	public static void main(String[] args) {
		int res, money;
		Scanner scanner = new Scanner(System.in);
		money = scanner.nextInt();
		
		res = money/50000;
		money = money%50000;
		if(res > 0) {
			System.out.print(res + " " +"50,000won bill");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
		
		
		res = money/10000;
		money = money%10000;
		if(res > 0) {
			System.out.print(res + " " +"10,000won bill");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
		
		
		res = money/1000;
		money = money%1000;
		if(res > 0) {
			System.out.print(res + " " +"1,000won bill");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
		
		
		res = money/500;
		money = money%500;
		if(res > 0) {
			System.out.print(res + " " +"500won coin");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
		
		
		res = money/100;
		money = money%100;
		if(res > 0) {
			System.out.print(res + " " +"100won coin");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
		
		
		res = money/50;
		money = money%50;
		if(res > 0) {
			System.out.print(res + " " +"50won coin");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
		
		
		res = money/10;
		money = money%10;
		if(res > 0) {
			System.out.print(res + " " +"10won coin");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
		
		
		res = money/1;
		money = money%1;
		if(res > 0) {
			System.out.print(res + " " +"1won coin");
			if(res >1) System.out.println("(s)");
			else System.out.println("");
		}
	
	
	
	
	
		scanner.close();
	
	}

}
