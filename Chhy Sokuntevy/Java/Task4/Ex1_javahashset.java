package task4;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class javahashset {
    public static void main(String[] args){
        Set<String> mySet = new HashSet<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of pair");
        int num = input.nextInt();
        for (int i = 0; i < num ; i++)
        {
            String el1 = input.next().toLowerCase();
            String el2 = input.next().toLowerCase();


            mySet.add(el1 + "," + el2);

            System.out.println(mySet.size());


        }
    }
}
