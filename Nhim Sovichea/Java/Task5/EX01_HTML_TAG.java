package Task5;

import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX01_HTML_TAG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        int testCases = input.nextInt();
        while(testCases-- > 0){
            String line = input.nextLine();
            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if (!matchFound) System.out.println("None");
        }
    }
}
