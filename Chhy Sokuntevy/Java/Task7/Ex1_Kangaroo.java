package Task7;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Ex1_Kangaroo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Kangaroo location x1");
        int x1 = input.nextInt();
        System.out.println("Enter Kangaroo move rate v1");
        int v1 = input.nextInt();
        System.out.println("Enter Kangaroo location x2");
        int x2 = input.nextInt();
        System.out.println("Enter Kangaroo move rate v2");
        int v2 = input.nextInt();

        if (0 <= x1 && x1 < x2)
        {
               while (x1 != x2)
               {
                   x1 += v1;
                   x2 += v2;
                   if ( x1 >= 10000)
                   {
                       System.out.println("no");
                       break;
                   }
               }

                 if (x1 == x2)
                  {
                System.out.println("Yes");
                 }
        }

    }
}
