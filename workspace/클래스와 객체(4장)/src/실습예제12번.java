import java.util.*;

class BookSystem{
	private Scanner sc;
	//private Seat[] sArea;
	
	public BookSystem() {
		
	}
	
	public void run() {
		sc = new Scanner(System.in);
		
		String name;
		int seatNum;
		
		String sSeat[] = {"___", "___", "___", "___", "___", "___", "___", "___", "___", "___",};
		String aSeat[] = {"___", "___", "___", "___", "___", "___", "___", "___", "___", "___",};
		String bSeat[] = {"___", "___", "___", "___", "___", "___", "___", "___", "___", "___",};
		
		while(true) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
		int num1 = sc.nextInt();
		if(num1==1) {
			System.out.print("좌석  구분 S(1), A(2), B(3)>>");
			int num2 = sc.nextInt();
			if(num2==1) {
				for(int i=0; i<10; i++) {
					System.out.print(sSeat[i]+" ");
				}
				System.out.println();
				System.out.print("이름>>");
				name = sc.next();
				System.out.print("번호>>");
				seatNum = sc.nextInt();
				sSeat[seatNum-1] = name;
			}
			else if(num2==2) {
				for(int i=0; i<10; i++) {
					System.out.print(aSeat[i]+" ");
				}
				System.out.println();
				System.out.print("이름>>");
				name = sc.next();
				System.out.print("번호>>");
				seatNum = sc.nextInt();
				aSeat[seatNum-1] = name;
			}
			else if(num2==3) {
				for(int i=0; i<10; i++) {
					System.out.print(bSeat[i]+" ");
				}
				System.out.println();
				System.out.print("이름>>");
				name = sc.next();
				System.out.print("번호>>");
				seatNum = sc.nextInt();
				bSeat[seatNum-1] = name;
			}
		}
		else if(num1==2) {
			for(int i=0; i<10; i++) {
				System.out.print(sSeat[i]+" ");
			}
			System.out.println();
			for(int i=0; i<10; i++) {
				System.out.print(aSeat[i]+" ");
			}
			System.out.println();
			for(int i=0; i<10; i++) {
				System.out.print(bSeat[i]+" ");
			}
			System.out.println();
		}
		else if(num1==3) {
			System.out.print("좌석  구분 S(1), A(2), B(3)>>");
			int num2 = sc.nextInt();
			if(num2==1) {
				for(int i=0; i<10; i++) {
					System.out.print(sSeat[i]+" ");
				}
				System.out.println();
				System.out.print("번호>>");
				seatNum = sc.nextInt();
				sSeat[seatNum-1] = "___";
			}
			else if(num2==2) {
				for(int i=0; i<10; i++) {
					System.out.print(aSeat[i]+" ");
				}
				System.out.println();
				System.out.print("번호>>");
				seatNum = sc.nextInt();
				aSeat[seatNum-1] = "___";
			}
			else if(num2==3) {
				for(int i=0; i<10; i++) {
					System.out.print(bSeat[i]+" ");
				}
				System.out.println();
				System.out.print("번호>>");
				seatNum = sc.nextInt();
				bSeat[seatNum-1] = "___";
			}
		}
		else if(num1==4) {
			System.out.println("예약 프로그램을 종료합니다. .");
			break;
		}
	}
}
}

/*
 * class Seat{ private String name; private String seat; Seat(String seat){
 * this.seat =seat; }
 * 
 * }
 */

public class 실습예제12번 {

	public static void main(String[] args) {
		BookSystem book = new BookSystem();
		book.run();
		
	}
}
