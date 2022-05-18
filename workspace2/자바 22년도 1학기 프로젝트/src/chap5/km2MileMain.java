package chap5;

import java.util.Scanner;

public class km2MileMain {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}

abstract class Converter {
	abstract protected double convert(double src);

	abstract protected String getDestString();

	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		scanner.close();
	}
}

class Km2Mile extends Converter{

	Km2Mile(double ratio){
		this.ratio = ratio;
	}
	
	public double convert(double src) {
		return src/ratio;
	}
	public String getDestString() {
		return "Mile";
	}
}
