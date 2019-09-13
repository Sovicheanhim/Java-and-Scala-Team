package Task1;
import java.util.*;

public class Exercise_1_TotalFees {
    public static void main(String[] args) {
        int totalBookPrize=0,totalCreditHourPrize,creditHour,athleticHour,totalAthleticPrize;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of credit hour :");
        creditHour = input.nextInt();

        totalCreditHourPrize = creditHour*85;

        System.out.println("Enter number of book :");
        int numberOfBook = input.nextInt();
        ArrayList<Integer> bookPrize = new ArrayList<Integer>(numberOfBook);
        if(numberOfBook == 1){
            System.out.println("Enter the book prize");
            bookPrize.add(input.nextInt());
            for(int i:bookPrize)
                totalBookPrize+=i;
        }
        else if(numberOfBook>1){
            for(int i =1 ;i<=numberOfBook;i++){
                System.out.println("Enter the prize for book "+i);
                bookPrize.add(input.nextInt());
            }
            for(int i:bookPrize)
                totalBookPrize+=i;
        }
        else
            System.out.println("We don't accept the negative value :)");

        System.out.println("Did you do athletic? Enter true or false !");
        boolean answer = input.nextBoolean();

        if(answer)
        {
            System.out.println("Enter the number of athletic hours :");
            athleticHour = input.nextInt();
            totalAthleticPrize = athleticHour * 65;

            System.out.println("The total prize is "+calculateTotalPrize(totalCreditHourPrize,totalBookPrize,totalAthleticPrize));
        }
        else{
            System.out.println("The total prize is "+calculateTotalPrize(totalCreditHourPrize,totalBookPrize,0));
        }
    }

    private static int calculateTotalPrize(int tcp,int tbp,int tap){
        return tcp+tap+tbp;
    }
}
