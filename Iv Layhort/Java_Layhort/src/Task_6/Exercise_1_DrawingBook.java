import java.util.*;
public class Exercise_1_DrawingBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPages,destinationPage;
        System.out.println("Enter the number of pages and destination page respectively :");
        numberOfPages = input.nextInt();
        destinationPage = input.nextInt();

        System.out.println((pageCount(numberOfPages,destinationPage))==0 ? "No need to turn" : "The minimum turn is"+pageCount(numberOfPages,destinationPage));
    }

    private static int pageCount(int numberOfPages,int destinationPage){
        int totalPageTurnCountFromFront,targetPageCountFromFront,targetPageCountFromBack;
        totalPageTurnCountFromFront = numberOfPages/2;
        targetPageCountFromFront = destinationPage/2;
        targetPageCountFromBack = totalPageTurnCountFromFront - targetPageCountFromFront;

        return Math.min(targetPageCountFromFront,targetPageCountFromBack);
    }
}
