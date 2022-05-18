import java.util.Scanner;

public class Ex3 {

   public static void main(String[] args) {
      int a, b, c, d;
      Scanner scanner = new Scanner(System.in);
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();
      d = scanner.nextInt();
      
      if((a >= 100 && a <= 200) && (b >= 100 && b <= 200)) {
         System.out.println("True");
      }
      else if((c >= 100 && c <= 200) && (d >= 100 && d <= 200)){
         System.out.println("True");
      }
      else {
         System.out.println("False");
      }

      scanner.close();
   }

}