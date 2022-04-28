import java.io.*;
import java.util.Scanner;
public class  ContigiousSequence {
	public static  long contigiousSequence(int arr[] , int n) {
		long size = n;
        long max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;	

	}
	public static void  main (String args []) {

		Scanner sc =  new  Scanner (System.in);

		int n = sc.nextInt();
		int arr [] = new int[n + 5];
		for ( int i = 0 ; i < n; i++)
			arr[i] = sc.nextInt();

		long max = contigiousSequence(arr, n);
		System.out.println(max);

	}
}