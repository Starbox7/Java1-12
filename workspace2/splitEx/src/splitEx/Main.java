package splitEx;


import java.util.*;

public class Main{
  public static void main(String[] args){
  	// add code...
	  Scanner scanner = new Scanner(System.in);
	  
	  while(true){
	  String a = new String(scanner.nextLine());
	  if (a.equals("그만")) {
			System.out.println("종료합니다...");
			break;
		}
	  int i;
	  String s[] = a.split(" "); // 문자열 분리
	  for (i=0; i<s.length; i++) {}
	  System.out.println("어절 개수는 " + i);
	  }
  }
}