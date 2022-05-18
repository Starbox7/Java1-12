import java.util.Scanner;

public class 가위바위보Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String player001, player002;
		
		System.out.print("철수 >> ");
		player001 = scanner.nextLine();
		
		System.out.print("영희 >> ");
		player002 = scanner.nextLine();
		
		
		if(player001.equals("가위")) 
			if(player002.equals("가위"))
				System.out.println("비겼습니다.");
			else if(player002.equals("바위"))	
				System.out.println("영희가 이겼습니다.");
			else if(player002.equals("보"))
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("영희 반칙!");
		
		else if(player001.equals("바위")) 
			if(player002.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if(player002.equals("바위"))	
				System.out.println("비겼습니다.");
			else if(player002.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("영희 반칙!");
		
		else if(player001.equals("보")) 
			if(player002.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else if(player002.equals("바위"))	
				System.out.println("철수가 이겼습니다.");
			else if(player002.equals("보"))
				System.out.println("비겼습니다.");
			else
				System.out.println("영희 반칙!");
		
		else
			if(player002.equals("가위")||player002.equals("바위")||player002.equals("보"))
				System.out.println("철수 반칙!");
			else
				System.out.println("둘 다 반칙!");
		
		
		
	}

}
