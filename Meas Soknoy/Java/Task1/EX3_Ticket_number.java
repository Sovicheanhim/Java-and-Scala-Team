package Task1;

import java.util.*;

public class EX3_Ticket_number {
    public static void main(String[] args) {
        System.out.print("Enter your ticket numbers: ");
        Scanner input = new Scanner(System.in);
        Integer inputTicketNumber = input.nextInt();
        Integer checker = 0, identify, temp = inputTicketNumber;
       while(temp != 0){
           temp /= 10;
           checker += 1;
       }
       if(checker >= 7){
           System.out.println("Invalid-Ticket-Number!!!");
       }else{
           identify = (inputTicketNumber/10) % 7;

           if (identify == inputTicketNumber%10){
               System.out.println("Valid-Ticket_Number!!!");
           }
           else{
               System.out.println("Invalid-Ticket_Number!!!");
           }
       }
    }
}
