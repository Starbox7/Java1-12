package �߰�����III;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String big[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String small[] = {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int bigSum=0;
		int smallSum=0;
		
		
		int num = sc.nextInt();
		String word[] = new String[num];
		for(int i=0; i<num; i++) {
			word[i] = sc.next();
		}
		
		for(int i=0; i<26; i++) {
			for(int j=0; j<num; j++) {
				if(word[j].equals(big[i])) {
					bigSum++;
				}
			}
		}
		for(int i=0; i<26; i++) {
			for(int j=0; j<num; j++) {
				if(word[j].equals(small[i])) {
					smallSum++;
				}
			}
		}
		
		System.out.println(smallSum+"\n"+bigSum);
	}

}

