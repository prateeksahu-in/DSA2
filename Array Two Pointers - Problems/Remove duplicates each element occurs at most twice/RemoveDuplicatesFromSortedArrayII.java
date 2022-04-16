import java.util.*;

class RemoveDuplicatesFromSortedArrayII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = removeDuplicatesFromSortedArrayII(n, arr);

        System.out.println(res);

        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");

    }

    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) {

        int lastIndex = n-1;
        int count = 0;
        int currentCount=0;
        int current = -1;
        boolean flag = false;
        for(int i = 0;i <= lastIndex;i++)
        {
            //System.out.print(arr[i] + " ");
            if(current != arr[i])
            {
                current = arr[i];
                flag = false;
                count++;
                currentCount = 1;
            }
            else if(currentCount <2)
            {
                flag = true;
                count++;
                currentCount++;
            }
            else if(flag == true && currentCount >=2)
            {
                    for(int j = i;j<lastIndex;j++)
                    {
                        arr[j] = arr[j +1];    
                    }
                    lastIndex--;
                    i--;
            }
        }
        return count;
    }
}