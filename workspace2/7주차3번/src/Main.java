import java.util.*;

public class Main {
	public static void main(String[] args) {
		CustomerManager man = new CustomerManager();
		man.run();
	}
}

class CustomerManager {

	public void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		String a;
		int b, c;
		String word[] = new String[10];
		for(int i=0; i<10; i++) {
			word[i] = "NULL";
		}

		while (true) {
			a = sc.next();
			if(a.equals("±×¸¸")) {
				break;
			}
			b = sc.nextInt();
			c = 0;

			for (int j = 0; j < 10; j++) {
				if (a.equals(word[j])) {
					c = h.get(a);
					c += b;
					h.put(a,c);
					break;
				}
				else if(word[j].equals("NULL")){
					word[j] = a;
					c = b;
					h.put(a,c);
					break;
				}
				
			}
			
			

			for (int j = 0; j < h.size(); j++) {
				System.out.print("(" + word[j] + "," + h.get(word[j]) + ")");

			}
			System.out.println();
		}
	}
}
