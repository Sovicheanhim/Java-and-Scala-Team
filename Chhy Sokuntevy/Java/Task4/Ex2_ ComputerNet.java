package task5;

import java.util.Scanner;

public class ComputerNet {
    public static void main(String[] args)
    {
        float holdingtax = 0;
        System.out.println("Enter the amount of your hourly pay rate");
        Scanner input = new Scanner(System.in);
        float salary = input.nextFloat();
        System.out.println("Enter the number of work hour");
        int hrs = input.nextInt();

        float grosspay = salary*hrs ;

        if(grosspay <= 300)
        {
            holdingtax = (grosspay*10)/100;
        }
        else if (grosspay > 300)
        {
            holdingtax = (grosspay*12)/100;
        }

        float netpay = grosspay-holdingtax ;

        float totalgrosspay = grosspay + holdingtax + netpay;
        System.out.println("Total gross pay is " + totalgrosspay);
    }
}
