package 중간고사II;

public class Main {

	public static void main(String[] args) {
		int a[][] = new int[3][4];
		int b=1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				a[i][j] = b;
				b++;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
