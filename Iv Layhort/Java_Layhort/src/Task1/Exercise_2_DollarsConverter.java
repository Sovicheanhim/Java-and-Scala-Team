package Task1;
import java.util.*;

public class Exercise_2_DollarsConverter {

    public static void main(String[] args) {
        double dollarAmount, rielAmount;
        int num2000,num1000,num500,num100;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dollars amount :");
        dollarAmount = input.nextDouble();
        rielAmount = dollarAmount * 4100;

        num2000 = (int)(rielAmount/2000);
        num1000 = (int) ((rielAmount -(2000*num2000))/1000);
        num500 = (int)((rielAmount -( 1000*num1000 + 2000*num2000))/500);
        num100 = (int)((rielAmount - (1000*num1000 + 2000*num2000 + 500*num500))/100);

        System.out.println(
                "There are "+num2000+" :2000r, "+num1000+" :1000r, "+num500+" :500r, "+num100+" :100r"
        );
    }
}
