package Task1;

import java.util.Scanner;

public class EX01_BOOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of credit hours for this semester: ");
        double creditsHour = input.nextDouble();
        System.out.println("Enter the amount of money spent on books: ");
        double bookCost = input.nextDouble();
        double totalCost = (creditsHour*85)+bookCost+65;
        System.out.println("Your school fee is "+creditsHour*85+"$\nYour books'cost is "+bookCost+"$\nYour athletic fee is 65$\nYour total cost "+totalCost+"$");

    }
}
