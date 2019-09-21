package Task_8;
import java.util.*;
public class Exercise_1_AngryProfessor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int testCase,numberOfStudents,cancellationThreshold;
        System.out.println("Enter the number of test case:");
        testCase = input.nextInt();

        for(int i=0;i<testCase;i++){
            int onTime =0;
            System.out.println("Enter the number of students and cancellation threshold respectively :");
            numberOfStudents = input.nextInt();
            cancellationThreshold =input.nextInt();

            System.out.println("Enter the arrival time of students");
            for(int j=0;j<numberOfStudents;j++){
                int arrivalTime = input.nextInt();
                if(arrivalTime<=0) onTime++;
            }
            if(onTime<=numberOfStudents) System.out.println("YES"); else System.out.println("NO");
        }
    }
}
