package homework;

import java.util.Scanner;

public class Ticket_number {
    public static void main(String[] args) {
        System.out.println("enter you ticket numbers ");
        Scanner x=new Scanner(System.in);
        Integer Input=x.nextInt();
        Integer o=0;
        Integer s=0;
        Integer v=Input;
       while(v!=0){
           v=v/10;
           o++;
       }
       if(o>6){
           System.out.println("Enter only 7 digits");
       }else{
           Input=Input/10;
           System.out.println("remove last digit:"+Input);
           s=Input%7;
           System.out.println("your remainder is:"+s);

       }
    }
}
