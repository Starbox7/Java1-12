package chap003_problem;
//�ڹ� 3�� ����ǽ� 16��

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		int n = (int)(Math.random()*3);	
		
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		
		while(true) {
			System.out.print("����������!>>");
			String playerNum = sc.next();
			
			if(playerNum.equals("�׸�")) {
				System.out.println("������ �����մϴ�. . .");
				break;
			}
			
				else if(playerNum.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", �����ϴ�.");
				}
				else if(str[n].equals("����")) {
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", ����ڰ� �����ϴ�.");
				}
				else{
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", ����ڰ� �̰���ϴ�.");
				}
			}
			else if(playerNum.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", ����ڰ� �̰���ϴ�.");
				}
				else if(str[n].equals("����")) {
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", �����ϴ�.");
				}
				else{
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", ����ڰ� �����ϴ�.");
				}
			}
			else {
				if(str[n].equals("����")) {
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", ����ڰ� �����ϴ�.");
				}
				else if(str[n].equals("����")) {
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", ����ڰ� �̰���ϴ�.");
				}
				else{
					System.out.println("����� = "+playerNum+", ��ǻ�� = "+n+", �����ϴ�.");
				}
			}
			

			

			
		}

	}

}
