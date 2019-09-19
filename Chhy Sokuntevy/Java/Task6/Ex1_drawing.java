package Task6;

import java.util.Scanner;

public class Ex1_drawing {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of page n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter the page number to be opened p");
        int p = input.nextInt();
        if (n <= 100000 && n >= 1)
        {
            if (p >= 1 && p <= n)
            {
                int pagecountfront = n/2 - p/2 ;
                System.out.println("Total page count from front is" + pagecountfront);
            }
        }


    }
}
