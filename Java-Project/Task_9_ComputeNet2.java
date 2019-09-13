import java.util.*;

public class Task_9_ComputeNet2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hourlyPayRate,hoursWorked,grossPay,witholdingTax = 0.00, netPay;
        System.out.println("Enter the hourly pay rate :");
        hourlyPayRate = input.nextDouble();
        System.out.println("Enter the hours worked : ");
        hoursWorked = input.nextDouble();

        grossPay = hourlyPayRate*hoursWorked;

        if(grossPay<=300)
            witholdingTax = grossPay * 0.10;
        else if(grossPay > 300 && grossPay<=400)
            witholdingTax = grossPay * 0.12;
        else if(grossPay >400 && grossPay <=500)
            witholdingTax = grossPay * 0.15;
        else if(grossPay>500)
            witholdingTax = grossPay * 0.20;


        netPay = grossPay - witholdingTax;

        System.out.println("The gross pay is "+grossPay);
        System.out.println("The witholding tax is "+witholdingTax);
        System.out.println("The net pay is "+netPay);
    }
}
