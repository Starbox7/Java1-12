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

		System.out.print("인원수>>");
		num = sc.nextInt();
		Phone [] phone;
		phone = new Phone[num];
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			phone[i] = new Phone();
			phone[i].userName(sc.next());
			phone[i].userTel(sc.next());
			}
		
		System.out.println("저장되었습니다. . .");

		while (true) {
			System.out.print("검색할 이름");
			name = sc.next();
			for (int i = 0; i < num; i++) {
				 if (name==phone[i].name) 
					System.out.println(phone[i].name+" "+phone[i].tel);
				 if (name.equals("그만")) {
					name = "그만";
					break;
				} else
					System.out.println(name + "이 없습니다.");
			}
			if (name.equals("그만")) {
				break;
			}
		}
	}
}
