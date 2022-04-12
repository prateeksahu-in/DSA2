import java.io.*;
import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] complements = new int[2];
        // consider each element except the last
        for (int i = 0; i < n - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < n; j++)
            {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == target)
                {
                    //printf("Pair found (%d, %d)\n", nums[i], nums[j]);
                    complements[0] = i;
                    complements[1] = j;
                    return complements;
                }
            }
        }
        return complements;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.close();

        int[] complements = new TwoSum().twoSum(numbers, target);
        System.out.print(complements[0] + " " + complements[1]);
    }
}