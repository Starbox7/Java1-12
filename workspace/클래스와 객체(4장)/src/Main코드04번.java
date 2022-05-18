import java.util.*;

public class Main코드04번{
  public static void main(String [] arg) {
	DicApp dicapp = new DicApp();
	dicapp.run();
  }
}

class Dictionary {
  private static String [] kor = {"사랑", "아기", "돈", "미래", "희망" };
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
	  System.out.println("한영 단어 검색 프로그램입니다.");
	  
	  while(true) {
		  String name = sc.next();
		  if(name.equals("그만")) {
			  break;
	  }
		  else if(null == dictionary.kor2Eng(name))
			  System.out.println(name + " : 저의 사전에 없습니다.");
		  else
			 System.out.println(name + " : "+dictionary.kor2Eng(name));
	            }
  }
}