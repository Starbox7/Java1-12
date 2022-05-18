import java.util.*;

public class Main�ڵ�04��{
  public static void main(String [] arg) {
	DicApp dicapp = new DicApp();
	dicapp.run();
  }
}

class Dictionary {
  private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���" };
  private static String [] eng = {"love", "baby", "money", "future", "hope"};
  public static String kor2Eng(String word) {
		  for(int i=0; i<5; i++) {
			if(word.equals(kor[i]))
				return eng[i];		
			}
		  return null;
  }
}

class DicApp{
	
  public static void run() {
	  Scanner sc = new Scanner(System.in);
	  Dictionary dictionary = new Dictionary();
	  System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
	  
	  while(true) {
		  String name = sc.next();
		  if(name.equals("�׸�")) {
			  break;
	  }
		  else if(null == dictionary.kor2Eng(name))
			  System.out.println(name + " : ���� ������ �����ϴ�.");
		  else
			 System.out.println(name + " : "+dictionary.kor2Eng(name));
	            }
  }
}