package Task_3;
import java.util.*;

public class Exercise_2_HashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> mySet = new HashSet<String>();

        System.out.println("Enter the size :");
        int size = input.nextInt();

        for(int i=0;i<size;i++){
            System.out.println("Enter the string pairs");
            String left = input.next();
            String right = input.next();

            mySet.add(left.toLowerCase() +" , "+ right.toLowerCase());

            System.out.println(mySet.size());
        }
    }
}
