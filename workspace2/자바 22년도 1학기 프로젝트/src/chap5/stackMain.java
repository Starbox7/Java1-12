package chap5;

import java.util.Scanner;

public class stackMain {
	public static void main(String[] args) {
		StackApp.run();
	}
}

interface Stack {
	int length(); // ���� ���ÿ� ����� ���� ����

	int capacity(); // ������ ��ü ���� ������ ���� ����

	String pop(); // ������ ��(top)�� �Ǽ� ����

	boolean push(String val); // ������ ��(top)�� ����� �Ǽ� ����
}

class StringStack implements Stack {
	private String[] element; // ������ ���� �޸�
	private int tos; // index, top of stack

	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}

	// Stack �������̽��� ����� ���� 3���� �޼ҵ� �������̵� ����
	public int length() { // ���� ���ÿ� ����� ���� ����
		return tos + 1;
	}

	public int capacity() { // ���� ���ÿ� ����� ���� ����
		return element.length;
	}

	public String pop() {
		if (tos == -1) // ������ �����
			return null;
		String s = element[tos]; // �鿡 �ִ� ��
		tos--; // ���� ������ ����
		return s;
	}

	public boolean push(String str) {
		if (tos == element.length - 1)
			return false; // ������ �� á��
		else {
			tos++;
			element[tos] = str; // ��� ���ÿ� ���� �� ���� ������ ����
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
			if(s.equals("�׸�")) {
				break;
			}
			
			if (ss.push(s) == false) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for(int i = 0; i<ss.capacity(); i++) {
			System.out.print(ss.pop()+" ");
		}
	}
}
