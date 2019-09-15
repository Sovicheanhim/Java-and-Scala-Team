package Task1;

import java.util.*;

public class EX1_TotalFees {
    public static void main(String[] args) {
        int athleticFee = 65, pricePerHour = 85;
        Scanner input = new Scanner(System.in);
        System.out.println("How much you spend buy books?");
        int booksFee = input.nextInt();
        System.out.println("How many hours did you read?");
        int hours = input.nextInt();
        System.out.println("The student's total fee is "+ (booksFee + hours*pricePerHour + athleticFee));
    }
}
