import java.util.*;

public class Main {
     public static void main(String[] args) {
      CustomerManager man = new CustomerManager();
      man.run();
   }
}
class CustomerManager{

   public static void run() {
      Scanner sc = new Scanner(System.in);
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      while (true) {

         String name = sc.next();
             if (name.equals("그만")) {
            break;
         }
         int point = sc.nextInt();
         if (map.containsKey(name) == true) {
            int lastpoint = map.get(name);
            int changevalue = lastpoint + point;
            map.remove(name);
            map.put(name, changevalue);
         }
         else {
            map.put(name, point);
         }
         Set<String> keys = map.keySet();
         Iterator<String> it = keys.iterator();
         while (it.hasNext()) { //차례대로 출력
            String showname = it.next();
            int showpoint = map.get(showname);
            System.out.print("(" + showname + ", " + showpoint + ")");
         }
         System.out.println();
         
      }
   }
}