package substringEx;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // add code...
	  Scanner sc = new Scanner(System.in);
	  String words = sc.nextLine();
	  
	  int len = words.length();
	  for(int i=0; i<len; i++) {
		  String first = words.substring(0,1);
		  String last = words.substring(1);
		  
		  System.out.println(last+first);
		  words = last+first;
	  }
  }
}
