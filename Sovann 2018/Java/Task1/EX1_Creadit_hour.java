package homework;

import java.util.Scanner;

public class Creadit_hour {
    public static void main(String[] args) {

        System.out.println("Are you interest in this sport (yes or no)");
        Scanner x=new Scanner(System.in);
        String In=x.nextLine();
        if(In.equals("yes")) {

            System.out.println("Enter mount hour");
            Integer H = x.nextInt();
            System.out.println("Enter number of book ");
            Integer book = x.nextInt();
            System.out.println("Prices of book");
            Integer Pr = x.nextInt();

            Integer Total = (85 * H) + (book * Pr) + 65;
            System.out.println("Total: " + Total + "$");

        }
        else{
            System.out.println("Student not interest in this study");
        }

    }
}
