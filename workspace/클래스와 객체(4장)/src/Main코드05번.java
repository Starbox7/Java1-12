import java.util.Scanner;

public class Main코드05번{
  public static void main(String [] arg){
	  Scanner sc = new Scanner(System.in);
      //add code here;
	  int x,y;
	   String z;
	   
	   x = sc.nextInt();
	   y = sc.nextInt();
	   z = sc.next();
	   
	   Cal cal = new Cal();
	   cal.setValue(x, y);
	   
	   if(z.equals("+")) {
		   cal.calculate_add();
		   System.out.println(cal.calculate_add());
	   }
	   else if(z.equals("-")) {
		   cal.calculate_sub();
		   System.out.println(cal.calculate_sub());
	   }
	   else if(z.equals("*")) {
		   cal.calculate_mul();
		   System.out.println(cal.calculate_mul());
	   }
	   else if(z.equals("/")) {
		   
		   if(y!=0) {
			   cal.calculate_div();
			   System.out.println(cal.calculate_div());
		   }
		   else if(y==0) {
			   System.out.println(y + "으로 나눌 수 없습니다.");
		   }
	   }
	   else {
		   System.out.println("해당하는 연산이 없습니다.");
	   }
	   
		   
  }
}
class Cal{
  int a, b;
  void setValue(int a, int b) {
      this.a = a; this.b = b;
  }
  int calculate_add() {
      return a+b;
  }
  int calculate_sub() {
      return a-b;
  }
  int calculate_mul() {
      return a*b;
  }
  int calculate_div() {
      return a/b;
  }
}
