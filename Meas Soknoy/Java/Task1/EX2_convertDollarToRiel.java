package Task1;

import java.util.*;
public class EX2_convertDollarToRiel {
    public static void main(String[] args) {

        System.out.print("Enter your money USD: ");
        Scanner input =new Scanner(System.in);
        Integer dollarInput=input.nextInt();
        Integer Exchange=dollarInput*4000;
        System.out.println("Your exchange to Riel is: "+Exchange+" Riel ");
        System.out.print("Choose your type of paper 1:2000, 2:1000, 3:500, 4:100 you want to exchange: ");
        int checker=input.nextInt();
        switch (checker){
            case 1:{
                System.out.println(Exchange/2000+" papers of 2000 Riel");
                break;
            }
            case 2:{
                System.out.println(Exchange/1000+" papers of 1000 Riel");
                break;
            }
            case 3:{
                System.out.println(Exchange/500+" papers of 500 Riel");
                break;
            }
            case 4:{
                System.out.println(Exchange/100+" papers of 100 Riel");
                break;
            }
            default:
                System.out.println("choose correct choice");
        }
    }
}
