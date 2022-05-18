
import java.util.Scanner;

public class eating_fish {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
      Game Bear = new Game(0, 0, 1, 'B');
      Game Fish = new Game(5, 5, 1, '@');
      for(int count = 0; true; count++) {
         //화면 띄우기
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
               if (Bear.getX() == j && Bear.getY() == i) {
                  System.out.print(Bear.getShape());
               }
               else if (Fish.getX() == j && Fish.getY() == i) {
                  System.out.print(Fish.getShape());
               }
               else {
                  System.out.print("-");
               }
            }
            System.out.println("");
         }
         // 움직임
         System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
         String vector = sc.next();
         if (vector.equals("a")) {
            Bear.move(Bear.getX() - 1, Bear.getY());
         }
         else if (vector.equals("s")) {
            Bear.move(Bear.getX(), Bear.getY() + 1);
         }
         else if (vector.equals("d")) {
            Bear.move(Bear.getX(), Bear.getY() - 1);
         }
         else if (vector.equals("f")) {
            Bear.move(Bear.getX() + 1, Bear.getY());
         }
         
         //충돌 확인
         if (Bear.collide(Fish)) {
            System.out.println("Bear Win!");
            break;
         }
         
         // 물고기 움직임
         if(2 < count % 5) {
            int random = (int) (Math.random() * 4);
            if(random == 0) {
               Fish.move(Fish.getX() - 1, Fish.getY());
            }
            else if(random == 1) {
               Fish.move(Fish.getX() + 1, Fish.getY());
            }
            else if(random == 2) {
               Fish.move(Fish.getX(), Fish.getY() - 1);
            }
            else if(random == 3) {
               Fish.move(Fish.getX(), Fish.getY() + 1);
            }
         }
      }

   }

}

abstract class GameObject {
   protected int distance;
   protected int x, y;
   public GameObject(int startX, int startY, int distance) {
      this.x = startX;
      this.y = startY;
      this.distance = distance;
   }
   public int getX() {
      return x;
   }
   public int getY() {
      return y;
   }
   public boolean collide(GameObject p) {
      if(this.x == p.getX() && this.y == p.getY())
         return true;
      else
         return false;
   }
   protected abstract void move(int x, int y);
   protected abstract char getShape();
   
}

class Game extends GameObject {
   private char shape;
   public void move(int x, int y) {
      if(x < 0 || x > 19) {
         
      } else {         
         this.x = x;
      }
      if(y < 0 || y > 9) {
         
      } else {
      
         this.y = y;
      }
   }
   public Game(int startX, int startY, int distance, char shape) {
      super(startX, startY, distance);
      this.shape = shape;
   }
   public char getShape() {
      return this.shape;
   }
}