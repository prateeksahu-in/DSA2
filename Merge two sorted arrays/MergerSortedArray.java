import java.io.*;
import java.util.*;

public class MergeSortedArray {
    // Implement your solution by completing the below function
    public static int [] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m+n];
        int mIndex=0,nIndex=0;

        for(int i =0;i<m+n;i++)
        {
            if(nIndex<n && mIndex<m)
            {
                if(nums1[mIndex]>=nums2[nIndex])
                {
                    result[i] = nums2[nIndex];
                    nIndex++;
                }
                else
                {
                    result[i] = nums1[mIndex];
                    mIndex++;    
                }
            }
            else
            {
                if(nIndex>n)
                {
                    result[i] = nums1[mIndex];
                    mIndex++;
                }
                else
                {
                    result[i] = nums2[nIndex];
                    nIndex++;
                }
            }
        }
        return result;   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++)
            nums1[i] = scanner.nextInt();
        for (int i = 0; i < n; i++)
            nums2[i] = scanner.nextInt();

        scanner.close();

        int[] nums = mergeSortedArray(nums1, m, nums2, n);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}