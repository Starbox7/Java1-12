package chap4;
import java.util.*;

class Phone {
	private String userName;
	private String phoneNum;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String findUserName() {
		return userName;
	}

	public String findPhoneNum() {
		return phoneNum;
	}
}

public class PhoneBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userName, phoneNum;
		int num;

		System.out.print("인원수>>");
		num = sc.nextInt();
		System.out.println();
		Phone phone[] = new Phone[num];
		for (int i = 0; i < num; i++) {
			phone[i] = new Phone();
		}
		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			phone[i].setUserName(sc.next());
			phone[i].setPhoneNum(sc.next());
		}
		System.out.println("\n저장되었습니다. . .");

		while (true) {
			System.out.print("검색할 이름>>");
			userName = sc.next();
				for (int j = 0; j < num; j++) {
					if (userName.equals(phone[j].findUserName())) {
						System.out.println(userName + "의 번호는" + phone[j].findPhoneNum() + "입니다.");
						break;
					} 
					else if(j==num-1) {
						System.out.println(userName+"이 없습니다.");
					}
				}
				if (userName.equals("그만")) {
					userName = "그만";
					break;
				}
		}
	}
}
