package Task_4;
import java.util.*;
public class Exercise_1_ComputeNet1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hourlyPayRate,hoursWorked,grossPay,witholdingTax, netPay;
        System.out.println("Enter the hourly pay rate :");
        hourlyPayRate = input.nextDouble();
        System.out.println("Enter the hours worked : ");
        hoursWorked = input.nextDouble();

        grossPay = hourlyPayRate*hoursWorked;

        witholdingTax = grossPay<=300.00 ? grossPay* 0.10: grossPay*0.12;

        netPay = grossPay - witholdingTax;

        System.out.println("The gross pay is "+grossPay%.2f);
        System.out.println("The witholding tax is "+witholdingTax%.2f);
        System.out.println("The net pay is "+netPay%.2f);
    }
}
