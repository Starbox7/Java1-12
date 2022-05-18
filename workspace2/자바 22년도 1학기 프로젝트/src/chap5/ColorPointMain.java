package chap5;

import java.io.PrintStream;
import java.util.Scanner;

public class ColorPointMain {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // BLACK ���� (0,0) ��ġ�� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}
}

class Point {
	private int x, y;
	

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	String color;
	
	public ColorPoint(){
		super(0, 0);
		color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public String setColor(String color) {
		this.color = color;
		return color;
	}

	public String toString() {
		return (color+"���� "+"("+getX()+","+getY()+")"+"�� ��");
	}
}