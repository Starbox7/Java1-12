package chap5;

import java.util.Scanner;

abstract class Calc {
	protected int a, b;

	abstract public void setValue(int a, int b);

	abstract public int calculate();
}

class Add extends Calc {
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a / b;
	}
}

public class Calculater {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();

		Calc calc;
		if (op.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		} else if (op.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		} else if (op.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		} else if (op.equals("/")) {
			if (b == 0) {
				System.out.println("계산할 수 없습니다.");
			} else {
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
			}
		} else {
			System.out.println("잘못된 연산자입니다.");
		}

	}

}
