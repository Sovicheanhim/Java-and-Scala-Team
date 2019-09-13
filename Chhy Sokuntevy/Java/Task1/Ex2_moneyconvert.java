package taskday1;

import java.util.Scanner;

public class Ex2_moneyconvert {
    public static void main(String[] args)
    {
        System.out.println("Enter the amount of money in USD");
        Scanner input = new Scanner(System.in);
        int usd = input.nextInt();
        int moneyconvert = usd*4000;
        System.out.println("Enter the type of money 1:2000r 2: 1000r 3:500r 4:100r");
        int type = input.nextInt();
        switch (type)
        {
            case 1: System.out.println(moneyconvert/2000);
            case 2: System.out.println(moneyconvert/1000);
            case 3: System.out.println(moneyconvert/500);
            case 4: System.out.println(moneyconvert/100);
        }

    }
}
