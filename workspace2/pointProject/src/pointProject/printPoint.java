package pointProject;

public class printPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");

		p.moveUp();
		System.out.println(p.toString() + "입니다.");

		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}

}

class Point {
	private int x, y, z;

	Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	
	public void setZ(int a) {
		if(a==0) {
			z++;
		}
		else {
			z--;
		}
	}

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setPoint(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

class Point3D extends Point {
	Point3D(int x, int y, int z) {
		super(x, y, z);
	}

	public void move(int x, int y) {
		setPoint(x, y);
	}

	public void move(int x, int y, int z) {
		setPoint(x, y, z);
	}

	public void moveUp() {
		setZ(0);
	}

	public void moveDown() {
		setZ(1);
	}

	public String toString() {
		return ("("+getX()+","+getY()+","+getZ()+")의 점입니다.");
	}
}