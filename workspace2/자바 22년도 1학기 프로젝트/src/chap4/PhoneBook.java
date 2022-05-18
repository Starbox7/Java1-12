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

		System.out.print("�ο���>>");
		num = sc.nextInt();
		System.out.println();
		Phone phone[] = new Phone[num];
		for (int i = 0; i < num; i++) {
			phone[i] = new Phone();
		}
		for (int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			phone[i].setUserName(sc.next());
			phone[i].setPhoneNum(sc.next());
		}
		System.out.println("\n����Ǿ����ϴ�. . .");

		while (true) {
			System.out.print("�˻��� �̸�>>");
			userName = sc.next();
				for (int j = 0; j < num; j++) {
					if (userName.equals(phone[j].findUserName())) {
						System.out.println(userName + "�� ��ȣ��" + phone[j].findPhoneNum() + "�Դϴ�.");
						break;
					} 
					else if(j==num-1) {
						System.out.println(userName+"�� �����ϴ�.");
					}
				}
				if (userName.equals("�׸�")) {
					userName = "�׸�";
					break;
				}
		}
	}
}
