package Task_9;

import java.util.*;
public class Exercise_1_ElectronicShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountOfMoney,numberOfKeyboard,numberOfUSB;
        System.out.println("Enter the amount of money, number of keyboards brand and number of USB drives brands respectively :");
        amountOfMoney = input.nextInt();
        numberOfKeyboard = input.nextInt();
        numberOfUSB = input.nextInt();
        int[] arrayOfKeyBoards = new int[numberOfKeyboard];
        int[] arrayOfUSB = new int[numberOfUSB];
        System.out.println("Enter the price of each keyboard :");
        for(int i=0;i<numberOfKeyboard;i++) arrayOfKeyBoards[i] = (input.nextInt());
        System.out.println("Enter the price for each keyboard :");
        for(int i=0;i<numberOfUSB;i++) arrayOfUSB[i] = input.nextInt();

        if(((numberOfKeyboard>=1)&&(numberOfKeyboard<=100))&&(((numberOfUSB>=1)&&(numberOfUSB<=100)))&&((amountOfMoney>=1)&&(amountOfMoney<=1000000))){
            int max=-1;
            for(int i=0,j=0;i<numberOfKeyboard;i++){
                for(;j<numberOfUSB;j++){
                    if(arrayOfKeyBoards[i]+arrayOfUSB[j] > amountOfMoney) break;
                    if(arrayOfKeyBoards[i]+arrayOfUSB[j]<= amountOfMoney) max = arrayOfKeyBoards[i]+arrayOfUSB[j];
                }
            }
            System.out.println(max);
        }

    }
}
