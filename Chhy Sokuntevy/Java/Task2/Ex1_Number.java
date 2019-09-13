package Task2;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
//        sum(a,b);
//        diff(a,b);

    }
    public void sum ( int num1,int num2)
    {
        System.out.println("ans is = " + (num1+num2));
    }
    public void diff (int num1, int num2)
    {
        System.out.println("ans is = "+ (num1 - num2));
    }

}
