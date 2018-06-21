import java.util.*;

public class sumOfPositives {
    public static void main(String[] args) {
 /*       You get an array of numbers, return the sum of all of the positives ones.

                Example[1, -4, 7, 12] =>1 + 7 + 12 = 20

        Note:
        if there is nothing to sum, the sum is default to 0.*/

        System.out.println("Top Solution: " + sum1(new int[]{-1,2,3,4,-5}));
        System.out.println("My solution: " + sum(new int[]{-1,2,3,4,-5}));

    }

    public static int sum1(int[] arr){
        return Arrays.stream(arr).filter(value -> value > 0).sum();
    }

    public static int sum(int[] arr){
        int numSum = 0;
        for (int num : arr) {
            if (num >= 0 )
                numSum+= num;
        }
        return numSum;
    }
}
