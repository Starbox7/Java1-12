import java.util.*;

class Player {
	String playerName;
	private String playerWord;
	char firstChar;

	/*
	 * public void getWordFromUser() { sc = new Scanner(System.in);
	 * System.out.print(playerName + ">>"); playerWord = sc.next(); }
	 */

	public void checkSuccess() {
		firstChar = playerWord.charAt(0);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public char getFirstChar() {
		return firstChar;
	}

	public void setFirstChar(char firstChar) {
		this.firstChar = firstChar;
	}

	public String getPlayerWord() {
		return playerWord;
	}

	public void setPlayerWord(String playerWord) {
		this.playerWord = playerWord;
	}

}

public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ձ� ������ �����մϴ�. . .");
		run();
	}

	static void run() {
		Scanner sc = new Scanner(System.in);
		int playerNum;
		String playerName;

		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		playerNum = sc.nextInt();
		Player playerList[] = new Player[playerNum];
		for (int i = 0; i < playerNum; i++)
			playerList[i] = new Player();
		for (int i = 0; i < playerNum; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			playerList[i].setPlayerName(sc.next());
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ��� �Դϴ�");

		String word = "�ƹ���";
		while (true) {
			for (int i = 0; i < playerNum; i++) {
				System.out.print(playerList[i].getPlayerName()+">>");
				playerList[i].setPlayerWord(sc.next());
				playerList[i].checkSuccess();
				int lastIndex = word.length() - 1;
				char lastChar = word.charAt(lastIndex);
				if (lastChar == playerList[i].getFirstChar()) {
					word = playerList[i].getPlayerWord();
				} else {
					System.out.println(playerList[i].getPlayerName() + "�� �����ϴ�.");
					word = "��������";
					break;
				}
			}
			if (word == "��������") {
				break;
			}
		}
		sc.close();
	}

}