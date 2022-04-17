import java.io.*;
import java.util.*;

class ContainerWithMostWater {

    // Complete the function implementation below
    public int maxArea(int[] height) {
        int answer = 0;
        int curr_area = 0;
        int leftPt = 0;
        int rightPt = height.length-1;
        while(leftPt<rightPt)
        {
        
                curr_area = ((rightPt - leftPt)*Math.min(height[rightPt], height[leftPt]));
                answer = Math.max(answer, curr_area);
                if(height[leftPt]<=height[rightPt])
                {
                    leftPt++;
                }
                else
                {
                    rightPt--;
                }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new ContainerWithMostWater().maxArea(height);
        System.out.println(result);
    }
}