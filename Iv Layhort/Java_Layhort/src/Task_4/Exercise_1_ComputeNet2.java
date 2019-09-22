package Task_4;
import java.util.*;
public class Exercise_1_ComputeNet2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double hourlyPayRate,hoursWorked,grossPay,witholdingTax = 0.00, netPay;
        ystem.out.println("Enter the hourly rate and hours worked respectively :");
        hourlyPayRate = input.nextDouble();
        hoursWorked = input.nextDouble();

        grossPay = hourlyPayRate*hoursWorked;

        if(grossPay<=300) witholdingTax = grossPay * 0.10;
        else if((grossPay > 300) && (grossPay<=400)) witholdingTax = grossPay * 0.12;
        else if((grossPay >400) && (grossPay <=500)) witholdingTax = grossPay * 0.15;
        else if(grossPay>500) witholdingTax = grossPay * 0.20;

        netPay = grossPay - witholdingTax;

        System.out.println("The gross pay is "+grossPay%.2f);
        System.out.println("The witholding tax is "+witholdingTax%.2f);
        System.out.println("The net pay is "+netPay%.2f);
    }
}
