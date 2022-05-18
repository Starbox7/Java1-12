package chap5;

import java.util.Scanner;

public class stackMain {
	public static void main(String[] args) {
		StackApp.run();
	}
}

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 실수 저장

	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

class StringStack implements Stack {
	private String[] element; // 스택의 저장 메모리
	private int tos; // index, top of stack

	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}

	// Stack 인터페이스에 선언된 다음 3개의 메소드 오버라이딩 구현
	public int length() { // 현재 스택에 저장된 개수 리턴
		return tos + 1;
	}

	public int capacity() { // 현재 스택에 저장된 개수 리턴
		return element.length;
	}

	public String pop() {
		if (tos == -1) // 스택이 비었음
			return null;
		String s = element[tos]; // 톱에 있는 값
		tos--; // 스택 포인터 감소
		return s;
	}

	public boolean push(String str) {
		if (tos == element.length - 1)
			return false; // 스택이 다 찼음
		else {
			tos++;
			element[tos] = str; // 요소 스택에 저장 후 스택 포인터 증가
			return true;
		}
	}
}

class StackApp {
	public static void run() {
		// Add code here...
		Scanner sc = new Scanner(System.in);
		int stackNum = sc.nextInt();
		StringStack ss = new StringStack(stackNum);

		while (true) {
			String s= sc.next();
			if(s.equals("그만")) {
				break;
			}
			
			if (ss.push(s) == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i = 0; i<ss.capacity(); i++) {
			System.out.print(ss.pop()+" ");
		}
	}
}
