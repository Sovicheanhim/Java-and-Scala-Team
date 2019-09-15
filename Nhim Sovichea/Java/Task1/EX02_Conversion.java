package Task1;


import java.util.Scanner;

public class EX02_Conversion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your amount of Money in Dollars :");
        double rawMoney = input.nextDouble()*4000;
        int money = (int) rawMoney;
//        System.out.println(money);
        System.out.println("Enter the type of denomination you want to convert :\n1 for 2000r\n2 for 1000r\n3 for 500r\n4 for 100r");
        int numberCode = input.nextInt();
        switch (numberCode){
            case 1:
                System.out.println("Here are "+money/2000+" of 2000r for you");
                break;
            case 2:
                System.out.println("Here are "+money/1000+" of 1000r for you");
                break;
            case 3:
                System.out.println("Here are "+money/500+" of 500r for you");
                break;
            case 4:
                System.out.println("Here are "+money/100+" of 100r for you");
                break;
        }
    }
}
