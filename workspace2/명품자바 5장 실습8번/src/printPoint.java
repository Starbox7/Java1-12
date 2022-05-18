public class printPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}

class Point {
	private int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		if(x>0)
			return x;
		else
			return 0;
	}

	public int getY() {
		if(x>0)
			return y;
		else
			return 0;
	}

	public void setPoint(int x, int y) {
		if (x > 0) {
			if (y > 0) {
				this.x = x;
				this.y = y;
			}
		}

	}
}

class PositivePoint extends Point {
	PositivePoint() {
		super(0, 0);
	}

	PositivePoint(int x, int y) {
		super(x, y);
	}

	public void move(int x, int y) {
		setPoint(x, y);
	}

	public String toString() {
		return ("(" + getX() + "," + getY() + ")의 점입니다.");
	}
}
