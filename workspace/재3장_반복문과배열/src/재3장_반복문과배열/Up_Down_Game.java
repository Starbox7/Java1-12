package 재3장_반복문과배열;

import java.util.Scanner;
import java.util.Random;

public class Up_Down_Game {
	
	Scanner scanner = new Scanner(System.in);
	Random r = new Random();
	int k = r.nextInt(100);
	
	
	int n = scanner.nextInt();
	
	while(n==k) {
		System.out.println("맞았습니다.");
	}
	if(n>k)
		System.out.println("더 낮게");
	else
		System.out.println("더 높게");
	
	
	scanner.close();
}

