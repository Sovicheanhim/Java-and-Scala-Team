package task4;

import java.util.Scanner;

public class ComputerNet2 {
    public static void main(String[] args)
    {

        double holdingtax = 0;
        System.out.println("Enter the amount of your hourly pay rate");
        Scanner input = new Scanner(System.in);
        float salary = input.nextFloat();
        System.out.println("Enter the number of work hour");
        int hrs = input.nextInt();

        float grosspay = salary*hrs ;

        if(grosspay > 500)
        {
            holdingtax = (grosspay*20)/100;
        }
        else if (grosspay <= 500)
        {
            if ( grosspay > 400)
            {
                holdingtax = (grosspay*15)/100;
            }
            else if(grosspay <= 400)
            {
                if(grosspay > 300)
                {
                    holdingtax = (grosspay*12)/100;
                }
                else if (grosspay <= 300){
                    holdingtax = (grosspay*10)/100;
                }
            }
        }
        System.out.println("Holding tax is" +holdingtax);

        double netpay = grosspay - holdingtax ;

        double totalgrosspay = grosspay + holdingtax + netpay;
        System.out.println("Total gross pay is " + totalgrosspay);
    }

}
