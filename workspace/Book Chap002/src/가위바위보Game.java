import java.util.Scanner;

public class ����������Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String player001, player002;
		
		System.out.print("ö�� >> ");
		player001 = scanner.nextLine();
		
		System.out.print("���� >> ");
		player002 = scanner.nextLine();
		
		
		if(player001.equals("����")) 
			if(player002.equals("����"))
				System.out.println("�����ϴ�.");
			else if(player002.equals("����"))	
				System.out.println("���� �̰���ϴ�.");
			else if(player002.equals("��"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("���� ��Ģ!");
		
		else if(player001.equals("����")) 
			if(player002.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(player002.equals("����"))	
				System.out.println("�����ϴ�.");
			else if(player002.equals("��"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("���� ��Ģ!");
		
		else if(player001.equals("��")) 
			if(player002.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(player002.equals("����"))	
				System.out.println("ö���� �̰���ϴ�.");
			else if(player002.equals("��"))
				System.out.println("�����ϴ�.");
			else
				System.out.println("���� ��Ģ!");
		
		else
			if(player002.equals("����")||player002.equals("����")||player002.equals("��"))
				System.out.println("ö�� ��Ģ!");
			else
				System.out.println("�� �� ��Ģ!");
		
		
		
	}

}
