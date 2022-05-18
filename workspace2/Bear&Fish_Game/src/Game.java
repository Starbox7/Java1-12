import java.util.*;

abstract class GameObject {
	protected int distance;
	protected int x, y;

	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/*
	 * public boolean collide(GameObject p) { if (this.x == p.getX() && this.y ==
	 * p.getY()) return true; else return false; }
	 */

	protected abstract void move(String control);

	// protected abstract void getShape();
}

public class Game extends GameObject {
	public Game(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	public void move(String control) {
		if (control.equals("d")) {
			y += 1;
		} else if (control.equals("w")) {
			x -= 1;
		} else if (control.equals("a")) {
			y -= 1;
		} else if (control.equals("s")) {
			x += 1;
		}

		distance++;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String gameBoard[][] = new String[10][20];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				gameBoard[i][j] = "_ ";
			}
		}

		Game bear = new Game(random.nextInt(10), random.nextInt(20), 0);
		Game fish = new Game(random.nextInt(10), random.nextInt(20), 0);
		int rA, rB;

		gameBoard[bear.getX()][bear.getY()] = "B";
		gameBoard[fish.getX()][fish.getY()] = "F";
		
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}

		while (true) {
			System.out.print("위(w) 왼쪽(a) 오른쪽(d) 아래(s) >>");
			bear.move(scanner.next());
			if (bear.getX() == fish.getX() && bear.getY() == fish.getY()) {
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 20; j++) {
						gameBoard[i][j] = "_ ";
					}
				}

				gameBoard[bear.getX()][bear.getY()] = "B";

				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 20; j++) {
						System.out.print(gameBoard[i][j]);
					}
					System.out.println();
				}
				System.out.println(bear.distance + "번 만에 사냥 성공!");
				System.out.println("Bear Wins!!");
				break;

			}

			else {
				rA = random.nextInt(5);
				rB = random.nextInt(4);

				if (rA == 3) {
					if (rB == 0) {
						fish.move("w");
					} else if (rB == 1) {
						fish.move("a");
					} else if (rB == 2) {
						fish.move("s");
					} else {
						fish.move("d");
					}
				} else if (rA == 4) {
					if (rB == 0) {
						fish.move("w");
					} else if (rB == 1) {
						fish.move("a");
					} else if (rB == 2) {
						fish.move("s");
					} else {
						fish.move("d");
					}
				}

				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 20; j++) {
						gameBoard[i][j] = "_ ";
					}
				}

				if ((fish.getX() == -1 || fish.getX() == 10) || (fish.getY() == -1 || fish.getY() == 20)) {
					System.out.println("물고기가 도망쳤습니다. . . ");
					System.out.println("Fish Wins!!");
					break;
				} else if (bear.getX() == fish.getX() && bear.getY() == fish.getY()) {
					gameBoard[fish.getX()][fish.getY()] = "F";
					for (int i = 0; i < 10; i++) {
						for (int j = 0; j < 20; j++) {
							System.out.print(gameBoard[i][j]);
						}
						System.out.println();
					}
					System.out.println("물고기에게 물렸습니다. 아야!!");
					System.out.println("물고기가 도망갔습니다. . .");
					System.out.println("Fish Wins!!");
					break;
				}
				
				gameBoard[bear.getX()][bear.getY()] = "B";
				gameBoard[fish.getX()][fish.getY()] = "F";

				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 20; j++) {
						System.out.print(gameBoard[i][j]);
					}
					System.out.println();
				}
			}
		}
	}
}
