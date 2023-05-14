import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

        /*int n = scn.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(i);
        }*/

       /* String name = scn.nextLine();
        System.out.println("Hello " + name);*/

        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();

        System.out.println("Dear " + name + ". Here is the counting");
        for(int i=0;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}