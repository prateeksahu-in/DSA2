import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> merge = new LinkedList();

        for(int[] interval: intervals)
        {
            if(merge.isEmpty() || merge.getLast()[1]<interval[0])
            {
                merge.add(interval);
            }
            else 
            {
                merge.getLast()[1]= Math.max(merge.getLast()[1],interval[1]);
            }
        }


        return merge.toArray(new int[merge.size()][]);

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
    }
}
