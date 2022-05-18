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

	public String getLevel() {    //S,A,B �¼� ����̳� run()���� �̹� �����Ǿ� ���۵� �����̴�.
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
			System.out.println("--��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.--");
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int num1 = sc.nextInt();
			if (num1 == 1) {
				System.out.print("�¼�  ���� S(1), A(2), B(3)>>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					sSeat.viewSeat();
					System.out.print("�̸�>>");
					name = sc.next();
					System.out.print("��ȣ>>");
					seatNum = sc.nextInt();
					sSeat.bookSeat(name, seatNum);
				} else if (num2 == 2) {
					aSeat.viewSeat();
					System.out.print("�̸�>>");
					name = sc.next();
					System.out.print("��ȣ>>");
					seatNum = sc.nextInt();
					aSeat.bookSeat(name, seatNum);
				} else if (num2 == 3) {
					bSeat.viewSeat();
					System.out.print("�̸�>>");
					name = sc.next();
					System.out.print("��ȣ>>");
					seatNum = sc.nextInt();
					bSeat.bookSeat(name, seatNum);
				}
			} else if (num1 == 2) {
				sSeat.viewSeat();
				aSeat.viewSeat();
				bSeat.viewSeat();
			} else if (num1 == 3) {
				System.out.print("�¼�  ���� S(1), A(2), B(3)>>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					sSeat.viewSeat();  
					System.out.print("��ȣ>>");
					seatNum = sc.nextInt();
					sSeat.cancelSeat(seatNum);
				} else if (num2 == 2) {
					aSeat.viewSeat();
					System.out.print("��ȣ>>");
					seatNum = sc.nextInt();
					aSeat.cancelSeat(seatNum);
				} else if (num2 == 3) {
					bSeat.viewSeat();
					System.out.print("��ȣ>>");           
					seatNum = sc.nextInt();
					bSeat.cancelSeat(seatNum);
				}
			} else if (num1 == 4) {
				System.out.println("���� ���α׷��� �����մϴ�. .");
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
