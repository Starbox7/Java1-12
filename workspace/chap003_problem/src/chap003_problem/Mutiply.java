package chap003_problem;

import java.util.*;

public class Mutiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 while(true) {
				try {
				
				
				
				int n = sc.nextInt();
				int m = sc.nextInt();
				
				
				System.out.println(n*m);
				
				break;
				}
				catch(InputMismatchException i){
					System.out.println("-1");
					sc.nextLine() ;
					}
				}
		}
	}
		
		

	

