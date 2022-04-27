import java.util.*;

public class MeetingRooms {

    public int findNumRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0)
        {
            return 0;
        }

        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> a-b);
        minHeap.add(intervals[0][1]);

        for(int i =1;i< intervals.length;i++)
        {
            if(intervals[i][0] >= minHeap.peek())
            {
                minHeap.poll();
            }
            minHeap.add(intervals[i][1]);
        }
        return minHeap.size();


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

        int result = new MeetingRooms().findNumRooms(nums);

        System.out.printf("%d", result);
    }

}