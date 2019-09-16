package Task_6;

import java.util.*;
public class Exercise_1_DrawingBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPages,destinationPage;
        System.out.println("Enter the number of pages :");
        numberOfPages = input.nextInt();

        System.out.println("Enter the destination page :");
        destinationPage = input.nextInt();

        System.out.println("You have to turn "+pageCount(numberOfPages,destinationPage)+" time/times");
    }

    private static int pageCount(int numberOfPages,int destinationPage){
        int totalPageTurnCountFromFront,targetPageCountFromFront,targetPageCountFromBack;
        totalPageTurnCountFromFront = numberOfPages/2;
        targetPageCountFromFront = destinationPage/2;
        targetPageCountFromBack = totalPageTurnCountFromFront - targetPageCountFromFront;

        return Math.min(targetPageCountFromFront,targetPageCountFromBack);
    }
}
