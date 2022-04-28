import java.util.*;

class MaximumSubarraySumSizeK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumSubarraySumSizeK(arr, n, k));
        sc.close();
    }

    static int maximumSubarraySumSizeK(int[] arr, int n, int k) {

        int start = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;


        for(int end = 0;end< arr.length;end++)
        {
            sum = sum + arr[end];
            if(end>=k-1)
            {
                maxSum=Math.max(sum,maxSum);
                sum = sum - arr[start];
                start ++;
            }
        }

        return maxSum;

    }
}