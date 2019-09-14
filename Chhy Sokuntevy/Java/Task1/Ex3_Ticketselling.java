package taskday1;

import java.util.Scanner;

public class Ex3_Ticketselling {
    public static void main(String[] args)
    {
        int numofdigit = 0;
        System.out.println("Enter the ticket number 6 digits only");
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        int newdigit = digit;
        while (newdigit!=0)
        {
            newdigit = newdigit/10;
            numofdigit++;
        }
        int temp = digit%10;
        int temp2 = temp%7;

        if (numofdigit == 6) {
            if (temp == temp2) {
                System.out.println("the number is valid the last number is" + temp);
            }
            else {
                System.out.println("Invalid num");
            }
        }
        else {
            System.out.println("invalid number");
        }



    }
}
