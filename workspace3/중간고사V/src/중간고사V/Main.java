package 중간고사V;

import java.util.Scanner;

class AlphaHisto {
	Alpha[] alpha;
	char a = 'a';

	public void setAlpha() { // 26개의 각 알파벳 클래스 생성
		alpha = new Alpha[26];
		for (int i = 0; i < 26; i++) {
			alpha[i] = new Alpha(a);
			a++;
		}
	}

	public String readString() { // 텍스트 입력받고 리턴.
		StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트링버퍼 생성
		Scanner scanner = new Scanner(System.in);
		int wordNum = scanner.nextInt();
		int a = 0;
		while (true) {
			String line = scanner.next(); // 텍스트 한 라인을 읽는다.
			
			if (line.length() < 2) {
				sb.append(line); // 읽은 라인 문자열을 스트링 버퍼에 추가한다.
			}
			if (a == wordNum-1)
				break;
			a++;
		}
		return sb.toString();
	}

	public void Count(String a) {
		int num = 0;
		char a1 = 'A';
		char a2 = 'a';

		while (num < 26) {
			int count = 0;
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == a1 || a.charAt(i) == a2) {
					count++;
				}
			}
			alpha[num].setCount(count);
			num++;
			a1++;
			a2++;
		}
	}

	public void Draw() {
		// System.out.println("\n히스토그램을 그립니다.");
		for (int i = 0; i < 26; i++) {

			int j;
			for (j = 0; j < alpha[i].getCount(); j++) {
			}
			if (j != 0) {
				System.out.print(alpha[i].getAlphabet() + ":");
				System.out.print(j);
				System.out.println();
			}

		}
	}
}

class Alpha {
	private char alphabet;
	private int count = 0;

	public Alpha(char a) {
		this.alphabet = a;
	}

	public char getAlphabet() {
		return alphabet;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}
}

public class Main {
	public static void main(String[] args) {
		AlphaHisto ah = new AlphaHisto();

		ah.setAlpha();
		// System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		ah.Count(ah.readString());
		ah.Draw();
	}
}