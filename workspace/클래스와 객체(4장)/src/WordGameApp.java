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
		System.out.println("끝말잇기 게임을 시작합니다. . .");
		run();
	}

	static void run() {
		Scanner sc = new Scanner(System.in);
		int playerNum;
		String playerName;

		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		playerNum = sc.nextInt();
		Player playerList[] = new Player[playerNum];
		for (int i = 0; i < playerNum; i++)
			playerList[i] = new Player();
		for (int i = 0; i < playerNum; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			playerList[i].setPlayerName(sc.next());
		}
		System.out.println("시작하는 단어는 아버지 입니다");

		String word = "아버지";
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
					System.out.println(playerList[i].getPlayerName() + "이 졌습니다.");
					word = "게임종료";
					break;
				}
			}
			if (word == "게임종료") {
				break;
			}
		}
		sc.close();
	}

}