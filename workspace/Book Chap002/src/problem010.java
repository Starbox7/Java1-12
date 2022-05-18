import java.util.Scanner;

public class problem010 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
	int n =1;
	
	System.out.println(((n>5)?n:5));
	
	
	//011
	
	System.out.println(" \"를 출력하려면 / 다음에 \"를 붙여 \\\"과 같이 하면 됩니다.");
	
	System.out.println("나는 \"Java를"+100+"%\""+"사랑해");
	
	
	//014
	
	String var;
	var = scanner.nextLine();
	
	switch(var) {
	case "가위":
		System.out.println(1);
		break;
		
	case "바위":
		System.out.println(2);
		break;	
	case "보":
		System.out.println(3);
		break;
	default:
		System.out.println(0);
		break;
	}
	
    
	
		
		

	}

}
