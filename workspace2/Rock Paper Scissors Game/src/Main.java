import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
			int playerNum = sc.nextInt();
			int aiNum = random.nextInt(3)+1;
			
			if(playerNum==aiNum) {
				System.out.println("�����ϴ�.");
			}
			else if(playerNum==4) {
				break;
			}
			
			else if(playerNum==1) {
				if(aiNum==2) {
					System.out.println("ö��(����) : ��ǻ��(����)");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(aiNum==3) {
					System.out.println("ö��(����) : ��ǻ��(��)");
					System.out.println("ö���� �̰���ϴ�.");
				}
			}
			else if(playerNum==2) {
				if(aiNum==1) {
					System.out.println("ö��(����) : ��ǻ��(����)");
					System.out.println("ö���� �̰���ϴ�.");
				}
				else if(aiNum==3) {
					System.out.println("ö��(����) : ��ǻ��(��)");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(playerNum==3) {
				if(aiNum==2) {
					System.out.println("ö��(��) : ��ǻ��(����)");
					System.out.println("ö���� �̰���ϴ�.");
				}
				else if(aiNum==1) {
					System.out.println("ö��(��) : ��ǻ��(����)");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
		}
	}

}
