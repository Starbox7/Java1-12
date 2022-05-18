import java.util.Scanner;

public class 코드_실습3번{
  public static void main(String [] arg) {	
    PhoneBook phonebook = new PhoneBook();
    phonebook.run();
  }
}

class PhoneBook {

private Scanner scanner;
private Phone [] pArray;

public PhoneBook() {
	scanner = new Scanner(System.in);
	int numP;
	
	while(true) {
	numP = scanner.nextInt();
	if(numP>0)
		break;
	}
	pArray = new Phone[numP];
	for(int i=0; i<pArray.length; i++) {
		String name = scanner.next();
		String tel = scanner.next();
		pArray[i] = new Phone(name, tel);
	}
	System.out.println("저장되었습니다. . .");
	
	
}
void run() {
	//Scanner scanner = new Scanner(System.in);
	  while(true) {
		  String name = scanner.next();
		  if(name.equals("그만"))
			  break;
		  String tel = search(name);
		  if(tel==null)
			  System.out.println(name + " 이 없습니다.");
		  else
			  System.out.println(name+"의 번호는 "+tel+" 입니다.");
	            }
	         

	}
String search(String name) {
	for(int i=0; i<pArray.length; i++) {
		if(pArray[i].getName().equals(name))
			return pArray[i].getTel();
		}
	return null;
	}
}


class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}