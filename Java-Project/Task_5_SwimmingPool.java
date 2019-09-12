import java.util.*;
public class Task_5_SwimmingPool {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double length, width, depth, fixedAverageVolume=1000.00,cleaningFee,customerAverageVolume,averagePoolCapacity,averageMinutes,rateOfFlow=50.00,gallonsPerCubicFoot=7.5,fillingFee,feePerMinute =8.00/60.00,totalFee;
        System.out.println("Enter the length :");
        length = input.nextDouble();
        System.out.println("Enter the width :");
        width = input.nextDouble();
        System.out.println("Enter the depth :");
        depth = input.nextDouble();

        customerAverageVolume = length*width*depth;

        cleaningFee = (customerAverageVolume*75)/fixedAverageVolume;

        averagePoolCapacity = customerAverageVolume * gallonsPerCubicFoot;

        averageMinutes = averagePoolCapacity/rateOfFlow;

        fillingFee = averageMinutes * feePerMinute;

        totalFee = cleaningFee + fillingFee;

        System.out.println("The Total Service Fee is $"+totalFee);
    }
}
