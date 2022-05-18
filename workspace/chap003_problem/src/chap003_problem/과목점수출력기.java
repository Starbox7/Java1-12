package chap003_problem;
import java.util.*;

public class 과목점수출력기 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
			
			String course [] = {"Java", "C++", "HTML5", "ComputerStructure", "Android"};
			int score [] = {95, 88, 76, 62, 55};
			
			
			int i = 0;
			String name;
			
		
			
			while(true) {
				
				name = sc.next();
				
				
				if(name.equals("-1")) {
					break;
				}
				
				
				for(i=0; i<5; i++) {
					if(course[i].equals(name)) {
						System.out.println(course[i]+" : "+score[i]);
						break;
					}
				}
				if(i==5) {
					System.out.println("N/A");
				}
					
			}

	}

}
