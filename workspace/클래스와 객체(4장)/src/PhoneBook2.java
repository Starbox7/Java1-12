import java.util.*;

class Phone {
	 String name;
	 String tel;

	Phone() {

	}
	
	public String userName(String name) {
		this.name = name;
		return name;
	}
	public String userTel(String tel) {
		this.tel = tel;
		return tel;
	}
}

public class PhoneBook2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		String name, tel;

		System.out.print("�ο���>>");
		num = sc.nextInt();
		Phone [] phone;
		phone = new Phone[num];
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			phone[i] = new Phone();
			phone[i].userName(sc.next());
			phone[i].userTel(sc.next());
			}
		
		System.out.println("����Ǿ����ϴ�. . .");

		while (true) {
			System.out.print("�˻��� �̸�");
			name = sc.next();
			for (int i = 0; i < num; i++) {
				 if (name==phone[i].name) 
					System.out.println(phone[i].name+" "+phone[i].tel);
				 if (name.equals("�׸�")) {
					name = "�׸�";
					break;
				} else
					System.out.println(name + "�� �����ϴ�.");
			}
			if (name.equals("�׸�")) {
				break;
			}
		}
	}
}
