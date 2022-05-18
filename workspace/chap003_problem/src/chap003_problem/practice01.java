package chap003_problem;
//자바 3장 교재실습 16번

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		int n = (int)(Math.random()*3);	
		
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위바위보!>>");
			String playerNum = sc.next();
			
			if(playerNum.equals("그만")) {
				System.out.println("게임을 종료합니다. . .");
				break;
			}
			
				else if(playerNum.equals("가위")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 비겼습니다.");
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 사용자가 졌습니다.");
				}
				else{
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 사용자가 이겼습니다.");
				}
			}
			else if(playerNum.equals("바위")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 사용자가 이겼습니다.");
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 비겼습니다.");
				}
				else{
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 사용자가 졌습니다.");
				}
			}
			else {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 사용자가 졌습니다.");
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 사용자가 이겼습니다.");
				}
				else{
					System.out.println("사용자 = "+playerNum+", 컴퓨터 = "+n+", 비겼습니다.");
				}
			}
			

			

			
		}

	}

}
