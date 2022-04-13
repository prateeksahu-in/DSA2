import java.io.*;
import java.util.*;

public class BestTimeToBuyAndSellStocks {
    // Implement your solution Here
    public int maxProfit(int[] prices) {

        int sum = 0;
        //loo to traverse array
        for(int i = 0;i<prices.length-1;i++)
        {
            //System.out.println(" i "+i+" n "+prices[i]+" n+1 "+prices[i+1]);
            if((prices[i+1]-prices[i])>0)
            {
                sum = sum + (prices[i+1]-prices[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[scanner.nextInt()];
        for (int i = 0; i < prices.length; i++)
            prices[i] = scanner.nextInt();
        scanner.close();

        int result = new BestTimeToBuyAndSellStocks().maxProfit(prices);
        System.out.print(Integer.toString(result));
    }
}
