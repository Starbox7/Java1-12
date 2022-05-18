import java.util.*;

class Histogram {

	public String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			if (line.equals(";"))
				break;
			sb.append(line);
		}
		return sb.toString();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Histogram his = new Histogram();
		int numEng[]=new int[26]; //26
		int numA=0;
		
		String index = his.readString();
		for(int i=0; i<index.length(); i++) {
			if((index.substring(i,i+1)).equals("a")) {
				numA++;
			}
		}
		System.out.print("A");
		for(int i=0; i<numA; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
