import java.util.*;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> v = new Vector<Shape>(20);
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int num;
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			num = sc.nextInt();
			if(num==4) {
				System.out.println("프로그램종료");
				break;
			}
			if(num==1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				num = sc.nextInt();
				if(num==1) {
					Shape shape = new Line();
					v.add(shape);
				}
				else if(num==2) {
					Shape shape = new Rect();
					v.add(shape);
				}
				else {
					Shape shape = new Circle();
					v.add(shape);
				}
			}
			else if(num==2) {
				System.out.print("삭제할 도형의 위치>>");
				num = sc.nextInt();
				if(v.size()==0 ||(num-1)>=v.size())
					System.out.println("삭제할 수 없습니다.");
				else
					v.remove(num-1);
			}
			else if(num==3) {	
				for(int i= 0; i<v.size(); i++) {
					v.get(i).draw();
				}
			}
		}
	}

}

abstract class Shape {
	private Shape next;
	public Shape() { next = null;}

	public abstract void draw();
}





class Circle extends Shape {
	public void draw() {
		 System.out.println("Circle");
	}
	
	/*
	 * public String getDraw() { return "Circle"; }
	 */

}
class Line extends Shape {
	public void draw() {
		 System.out.println("Line");
	}
	/*
	 * public String getDraw() { return "Line"; }
	 */
}
class Rect extends Shape {
	public void draw() {
		 System.out.println("Rect");
	}
	/*
	 * public String getDraw() { return "Rect"; }
	 */

}

