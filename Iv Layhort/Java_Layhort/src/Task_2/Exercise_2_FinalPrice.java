package Task_2;
import java.util.*;
public class Exercise_2_FinalPrice {
    public static void main(String[] args) {
        double productPrize, commissionRate, discountRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product price, commission rate and discount rate respectively");
        productPrize = input.nextDouble();
        commissionRate = input.nextDouble();
        discountRate=input.nextDouble();

        System.out.println("The final prize is "+finalPrize(productPrize,commissionRate,discountRate));
    }

    private static double finalPrize(double productPrize,double commissionRate,double discountRate){
        double commissionAmount = (productPrize*commissionRate)/100.00;
        double discountAmount = ((commissionAmount + productPrize) * discountRate)/100.00;
        return productPrize + commissionAmount - discountAmount;
    }
}
