package Task_5;

import java.util.regex.*;
import java.util.*;
public class Exercise_1_TagContentExtractor {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        while (testCases>0){
            String string = input.nextLine();
            Matcher matcher = pattern.matcher(string);
            int hasFound = 0;
            if(matcher.find()){
                ++hasFound;
                System.out.println(matcher.group(2));
            }
            if(hasFound ==0){
                System.out.println("None");
            }
            testCases--;
        }
    }
}
