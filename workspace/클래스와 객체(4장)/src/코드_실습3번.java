import java.util.Scanner;

public class �ڵ�_�ǽ�3��{
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
	System.out.println("����Ǿ����ϴ�. . .");
	
	
}
void run() {
	//Scanner scanner = new Scanner(System.in);
	  while(true) {
		  String name = scanner.next();
		  if(name.equals("�׸�"))
			  break;
		  String tel = search(name);
		  if(tel==null)
			  System.out.println(name + " �� �����ϴ�.");
		  else
			  System.out.println(name+"�� ��ȣ�� "+tel+" �Դϴ�.");
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