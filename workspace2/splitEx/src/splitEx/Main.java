package splitEx;


import java.util.*;

public class Main{
  public static void main(String[] args){
  	// add code...
	  Scanner scanner = new Scanner(System.in);
	  
	  while(true){
	  String a = new String(scanner.nextLine());
	  if (a.equals("�׸�")) {
			System.out.println("�����մϴ�...");
			break;
		}
	  int i;
	  String s[] = a.split(" "); // ���ڿ� �и�
	  for (i=0; i<s.length; i++) {}
	  System.out.println("���� ������ " + i);
	  }
  }
}