package chap003_problem;


import java.util.Scanner;
import java.util.Random;

public class Up_Down_Game {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			
			int num, min, max = 0;
			
			while(true) {
				
				min = 0;
				max = 99;
				int cnt = 1;
				int randomNum = r.nextInt(100);
				
				System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
				System.out.println(min+"-"+max);
				System.out.print(cnt+">> ");
				num = sc.nextInt();
				
				while(randomNum!=num) {
					if(randomNum<num) {
						System.out.println("�� �۰�");
						max = num;
					}
					else {
						System.out.println("�� ũ��");
						min = num;
					}
					cnt++;
					System.out.println(min+"-"+max);
					System.out.print(cnt+">> ");
					num = sc.nextInt();
				}
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n)>> ");
				String text = sc.next();
				
				if(text.equals("n"))
					break;
			}
	}
	
}
			
			
	
		
				
		
			
			
			





