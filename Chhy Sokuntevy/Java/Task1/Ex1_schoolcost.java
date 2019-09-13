package taskday1;


import java.util.Scanner;

public class task1j {
    public static void main(String[] args) {
        System.out.println("Enter the number of hours :");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println("Do you play sport? Y/n");
        String inputString = input.next();
        char ans = inputString.charAt(0);
//        String ans = input.next();
        System.out.println("Please enter your book fee");
        int bookfee = input.nextInt();
        if (ans == 'Y')
        {
            int total = i*85 + 65 + bookfee;
            System.out.println("The Total cost =" + total);
        }
        else {
            int total = i*85 + bookfee;
            System.out.println("The total cost =" + total);
        }


    }
}
