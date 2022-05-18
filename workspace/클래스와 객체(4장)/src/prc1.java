import java.util.*;

class Seat {
	private String level;
	private String[] seat;

	public Seat(String level) {
		this.level = level;
		seat = new String[10];
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new String("___");
		}
	}

	public void viewSeat() {
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}

	public void bookSeat(String name, int num) {
		seat[num - 1] = name;
	}

	public void cancelSeat(int num) {
		seat[num - 1] = "___";
	}

	public String getLevel() {    //S,A,B 좌석 출력이나 run()에서 이미 구현되어 미작동 상태이다.
		return this.level;
	}
}

class BookSystem2 {
	private Scanner sc;
	private Seat sSeat;
	private Seat aSeat;
	private Seat bSeat;

	public BookSystem2() {
		sc = new Scanner(System.in);
		sSeat = new Seat("S");
		aSeat = new Seat("A");
		bSeat = new Seat("B");
	}

	public void run() {
		String name;
		int seatNum;

		while (true) {
			System.out.println("--명품콘서트홀 예약 시스템입니다.--");
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int num1 = sc.nextInt();
			if (num1 == 1) {
				System.out.print("좌석  구분 S(1), A(2), B(3)>>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					sSeat.viewSeat();
					System.out.print("이름>>");
					name = sc.next();
					System.out.print("번호>>");
					seatNum = sc.nextInt();
					sSeat.bookSeat(name, seatNum);
				} else if (num2 == 2) {
					aSeat.viewSeat();
					System.out.print("이름>>");
					name = sc.next();
					System.out.print("번호>>");
					seatNum = sc.nextInt();
					aSeat.bookSeat(name, seatNum);
				} else if (num2 == 3) {
					bSeat.viewSeat();
					System.out.print("이름>>");
					name = sc.next();
					System.out.print("번호>>");
					seatNum = sc.nextInt();
					bSeat.bookSeat(name, seatNum);
				}
			} else if (num1 == 2) {
				sSeat.viewSeat();
				aSeat.viewSeat();
				bSeat.viewSeat();
			} else if (num1 == 3) {
				System.out.print("좌석  구분 S(1), A(2), B(3)>>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					sSeat.viewSeat();  
					System.out.print("번호>>");
					seatNum = sc.nextInt();
					sSeat.cancelSeat(seatNum);
				} else if (num2 == 2) {
					aSeat.viewSeat();
					System.out.print("번호>>");
					seatNum = sc.nextInt();
					aSeat.cancelSeat(seatNum);
				} else if (num2 == 3) {
					bSeat.viewSeat();
					System.out.print("번호>>");           
					seatNum = sc.nextInt();
					bSeat.cancelSeat(seatNum);
				}
			} else if (num1 == 4) {
				System.out.println("예약 프로그램을 종료합니다. .");
				break;
			}
		}
	}

}

public class prc1 {

	public static void main(String[] args) {
		BookSystem2 book = new BookSystem2();
		book.run();
	}

}
