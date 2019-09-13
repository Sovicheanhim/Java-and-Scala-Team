package taskday3;
//75$ fee for cleaning
// additional fee based on amount of time to fill water

import java.util.Scanner;

public class swimming {
    public static void main(String[] args)
    {
        int min = 0;
        int hrs = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the length");
        float length = input.nextFloat();
        System.out.println("Please Enter the Width");
        float width = input.nextFloat();
        System.out.println("Please Enter the depth");
        float depth = input.nextFloat();

        float vpool = length*width*depth;
        System.out.println("The volumn of the pool is" + vpool);
        double gpc = 7.5;
        double poolcap = vpool*gpc;
        System.out.println("The capacity in gallon is" + poolcap);
        while (poolcap >= 50)
        {
            min += 1;
            poolcap -= 50;
        }
        while (min >= 60)
        {
            hrs += 1;
            min -= 60;
        }
        if(min>=1)
        {
            hrs += 1;
        }

        int cost = hrs * 8;


//        System.out.println("Did you clean the pool? (Y/n)");
//        String inputChar = input.next();
//        char ch = inputChar.charAt(0);
//        if (ch == 'Y')
//        {
            float ttlfee = cost + 65;
            System.out.println("The total price is" + ttlfee);
//        }
//        else
//        {
//            System.out.println("The Total price is" + cost);
//        }
    }
}

