import java.util.Scanner;


public class Ex2 {
public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	
	if((a+b)>c && (b+c)>a && (c+a)>b) {
		 System.out.println("True");
		 }
	else {
		 System.out.println("True");
	}
	

	
	
		scanner.close();



}
}