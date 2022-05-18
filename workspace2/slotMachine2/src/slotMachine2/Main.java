package slotMachine2;

import java.util.Random;
import java.util.Scanner;

class Person {
	private String name;
	private int num1, num2, num3;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNum(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public Boolean result() {
		if (num1 == num2 && num2 == num3 && num3 == num1) {
			return true;
		} else {
			return false;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		String name;
		String enter;
		int num;

		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		num = sc.nextInt();
		Person[] group;
		group = new Person[num];
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "번째 선수 이름>>");
			name = sc.next();
			group[i] = new Person(name);
			System.out.println();
		}

		while (true) {
			for (int i = 0; i < num; i++) {
				System.out.print("[" + group[i].getName() + "]:<Enter>");
				enter = sc.nextLine();
				System.out.println();
				int num1 = random.nextInt(3) + 1;
				int num2 = random.nextInt(3) + 1;
				int num3 = random.nextInt(3) + 1;
				group[i].setNum(num1, num2, num3);
				if (group[i].result() == true) {
					System.out.println(num1 + " " + num2 + " " + num3 + " " + group[i].getName() + "님이 이겼습니다!");
					num = 10;
					break;
				} else
					System.out.println(num1 + " " + num2 + " " + num3 + " " + "아쉽군요!");
			}
			if(num==10)
				break;
		}
	}
}
