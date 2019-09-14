package homework;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

public class Change_moneys {
    public static void main(String[] args) {

        System.out.println("Enter your money USD");
        Scanner x =new Scanner(System.in);
        Integer Input=x.nextInt();
        Integer change=Input*4000;
        System.out.println("Your exchange to Real is:"+change+"រ");
        System.out.println("Choose your type of paper 1:2000,2:1000,3:500,4:100");
        int i=x.nextInt();
        switch (i){
            case 1:{
                System.out.println("Total:"+change/2000+"paper");
                break;
            }
            case 2:{
                System.out.println("Total:"+change/1000+"paper");
                break;
            }
            case 3:{
                System.out.println("Total:"+change/500+"paper");
                break;
            }
            case 4:{
                System.out.println("Total:"+change/100+"paper");
                break;
            }
            default:
                System.out.println("choose correct choice");
        }





    }
}
