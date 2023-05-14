import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    /*{
       Scanner scn = new Scanner(System.in);
       int t = scn.nextInt();

       for(int i=0; i<t; i++)
       {
          int n = scn.nextInt();

          int count = 0;
          for(int div = 1; div <= n; div++)
          {
              if(n % div == 0)
              {
                  count++;
              }
          }

          if (count == 2)
          {
              System.out.println("Prime");
          }
          else
          {
              System.out.println("not prime");
          }

       }*/


    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i=0; i<t; i++)
        {
            int n = scn.nextInt();

            int count = 0;
            for(int div = 2; div * div <= n; div++)    //change in p> root n or q> root n and start it from 2 ... now the order is root n
            {
                if(n % div == 0)
                {
                    count++;
                    break;                             // because if for 12, it is divisible by 1,2,3... so after 2 it's not nesc to check for 3
                }
            }

            if (count == 0)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("not prime");
            }

        }


    }
}