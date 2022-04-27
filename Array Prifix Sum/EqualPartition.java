import java.util.*;

class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long arr[]) {

        if(arr.length<3)
        {
            return -1;
        }
        long arr2[] = new long[arr.length];
        arr2[0] = arr[0];
        for(int i = 1; i< arr.length;i++)
        {
            arr2[i] = arr[i]+arr2[i-1];
        }
        if(arr2[0] == arr2[arr.length-1] - arr2[0])
        {
            return 0;
        }
        for(int i = 1; i<arr.length;i++)
        {
            if(arr2[i-1] ==  arr2[arr.length-1] - arr2[i])
            {
                return i;
            }
        }
        return -1;
    }
}
