package ��3��_�ݺ������迭;

import java.util.Scanner;
import java.util.Random;

public class Up_Down_Game {
	
	Scanner scanner = new Scanner(System.in);
	Random r = new Random();
	int k = r.nextInt(100);
	
	
	int n = scanner.nextInt();
	
	while(n==k) {
		System.out.println("�¾ҽ��ϴ�.");
	}
	if(n>k)
		System.out.println("�� ����");
	else
		System.out.println("�� ����");
	
	
	scanner.close();
}

