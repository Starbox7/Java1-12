import java.util.*;

class Person{
	private String name;
	private int num1, num2, num3;
	
	Person(String name){
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
		if(num1==num2&&num2==num3&&num3==num1) {
			return true;
		}
		else {
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
		System.out.print("1번째 선수 이름>>");
		name = sc.next();
		Person player1 = new Person(name);
		System.out.print("2번째 선수 이름>>");
		name = sc.next();
		Person player2 = new Person(name);
		
		while(true) {
			System.out.print("["+player1.getName()+"]:<Enter>");
			enter = sc.nextLine();
			System.out.println();
			int num1 = random.nextInt(3)+1;
			int num2 = random.nextInt(3)+1;
			int num3 = random.nextInt(3)+1;
			player1.setNum(num1, num2, num3);
			if(player1.result()==true) {
				System.out.println(num1+" "+num2+" "+num3+" "+player1.getName()+"님이 이겼습니다!");
				break;
			}
			else
				System.out.println(num1+" "+num2+" "+num3+" "+"아쉽군요!");
			
			System.out.print("["+player2.getName()+"]:<Enter>");
			enter = sc.nextLine();
			int num4 = random.nextInt(3)+1;
			int num5 = random.nextInt(3)+1;
			int num6 = random.nextInt(3)+1;
			player2.setNum(num4, num5, num6);
			
			if(player2.result()==true) {
				System.out.println(num4+" "+num5+" "+num6+" "+player2.getName()+"님이 이겼습니다!");
				break;
			}
			else
				System.out.println(num4+" "+num5+" "+num6+" "+"아쉽군요!");
		}
	}
}
