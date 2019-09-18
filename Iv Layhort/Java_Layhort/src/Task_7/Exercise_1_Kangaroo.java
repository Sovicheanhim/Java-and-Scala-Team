package Task_7;

import java.util.*;
public class Exercise_1_Kangaroo {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int firstKangarooStartingPoint, secondKangarooStartingPoint,firstKangarooJumpingSteps,secondKangarooJumpingSteps;
        System.out.println("Enter the first kangaroo starting point :");
        firstKangarooStartingPoint = input.nextInt();
        System.out.println("Enter the first kangaroo jumping steps :");
        firstKangarooJumpingSteps = input.nextInt();
        System.out.println("Enter the second kangaroo starting point :");
        secondKangarooStartingPoint = input.nextInt();
        System.out.println("Enter the second kangaroo jumping steps :");
        secondKangarooJumpingSteps = input.nextInt();

        while (firstKangarooStartingPoint<=secondKangarooStartingPoint){
            if(firstKangarooStartingPoint == secondKangarooStartingPoint){
                System.out.println("Yes");
                   System.exit(0);
            }
                firstKangarooStartingPoint+=firstKangarooJumpingSteps;
                secondKangarooStartingPoint+=secondKangarooJumpingSteps;
        }
        System.out.println("No");
    }
}
