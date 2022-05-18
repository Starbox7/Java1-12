package chap5;
interface Shape {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("___다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	public double getArea() {
		return radius * radius * PI;
	}

}

class Oval implements Shape {
	private int x, y;

	Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
	}

	public double getArea() {
		return x * y * PI;
	}
}

class Rect implements Shape{
	private int a, b;

	Rect(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(a + "x" + b + "크기의 사각형입니다.");
	}

	public double getArea() {
		return a * b;
	}
}

public class CirclePrograam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Shape donut = new Circle(10); donut.redraw();
		 * System.out.println("면적은 "+donut.getArea());
		 */
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);

		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("면적은 " + list[i].getArea());
	}
}
