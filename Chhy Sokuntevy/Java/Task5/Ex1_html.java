package task5;

import scala.Int;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_html {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of line you wanna input");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;

        for (int i = 0; i <= num; i++)
        {
            System.out.println("Enter the string");
            String sin = input.nextLine();
            boolean see = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(sin);
            while (matcher.find())
            {
                System.out.println(matcher.group(2));
                see = true;
            }
            if (!see)
            {
                System.out.println("None");
            }
        }

    }
}
