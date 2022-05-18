import java.util.Scanner;

public class M {
    public void doTask(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 0;

        switch (i) {
            case 10:
                j+=5;
                break;
            case 20:
                j+=10;
            default:
                j+=100;
        }

        System.out.println(j);
    }
}