import java.util.*;

class SubarraySumZero{
	public static String subarraySumZero(Vector<Integer> arr)
 	{
        String result;

// Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();
 
        // Initialize sum of elements
        int sum = 0;
 
        // Traverse through the given array
        for (int i = 0; i < arr.size(); i++)
        {
            // Add current element to sum
            sum += arr.get(i);
 
            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr.get(i) == 0
                || sum == 0
                || hs.contains(sum))
                return "Yes";
 
            // Add sum to hash set
            hs.add(sum);
        }
 
        // We reach here only when there is
        // no subarray with 0 sum
        return "No";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			Vector<Integer> arr=new Vector<Integer>();
			for(int i=0;i<n;i++)
			{
				arr.add(sc.nextInt());
			}
			System.out.println(subarraySumZero(arr));
		}

	}
}
