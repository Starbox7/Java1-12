import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int playerNum = sc.nextInt();
			int aiNum = random.nextInt(3)+1;
			
			if(playerNum==aiNum) {
				System.out.println("비겼습니다.");
			}
			else if(playerNum==4) {
				break;
			}
			
			else if(playerNum==1) {
				if(aiNum==2) {
					System.out.println("철수(가위) : 컴퓨터(바위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if(aiNum==3) {
					System.out.println("철수(가위) : 컴퓨터(보)");
					System.out.println("철수가 이겼습니다.");
				}
			}
			else if(playerNum==2) {
				if(aiNum==1) {
					System.out.println("철수(바위) : 컴퓨터(가위)");
					System.out.println("철수가 이겼습니다.");
				}
				else if(aiNum==3) {
					System.out.println("철수(바위) : 컴퓨터(보)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
			else if(playerNum==3) {
				if(aiNum==2) {
					System.out.println("철수(보) : 컴퓨터(바위)");
					System.out.println("철수가 이겼습니다.");
				}
				else if(aiNum==1) {
					System.out.println("철수(보) : 컴퓨터(가위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
		}
	}

}
