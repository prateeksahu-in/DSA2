import java.util.*;

class MaxSumTriplet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            long result = maxSumTriplet(n, arr);

            System.out.println(result);

        }

    }

    static long maxSumTriplet(int n, long arr[]) {

        long result = 0;

        for(int i = 0; i<n-2;i++)
        {
            for(int j = 1;j<n-1;j++)
            {
                for(int k = 2;k<n;k++)
                {
                    if(i<j && j < k)
                    {
                        if(arr[i]< arr[j] && arr[j] < arr[k])
                        {
                            if(result<(arr[i]+arr[j]+arr[k]))
                            {
                                result = arr[i]+arr[j]+arr[k];
                            }
                        }

                    }
                }
            }
        }
        return result;
    }
}