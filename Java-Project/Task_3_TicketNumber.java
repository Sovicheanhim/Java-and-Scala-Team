import java.util.*;
public class Task_3_TicketNumber {

    public static void main(String[] args) {
        int ticketNumber,numberOfDigits = 0,removedLastDigit,ticketNumberAfterRemoved,remainderTicketNumber,temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ticket number : Six-Digits Only :)");
        ticketNumber = input.nextInt();
        temp = ticketNumber;
        while (ticketNumber!=0){
            ticketNumber/=10;
            ++numberOfDigits;
        }
        ticketNumber = temp;
        if(numberOfDigits == 6){
            removedLastDigit = ticketNumber%10;
            ticketNumberAfterRemoved = ticketNumber/10;
            remainderTicketNumber = ticketNumberAfterRemoved%7;

            if(removedLastDigit == remainderTicketNumber)
                System.out.println("Valid ticket number ;)");
            else
                System.out.println("Invalid ticket number!");
        }
        else
            System.out.println("Enter six digits please!");
    }
}
