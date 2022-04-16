import java.util.*;

class SpiralMatrixII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int n) {
        int bottom = n,right= n,left =0,top=0;
        int[][] arr = new int[n][n];
        //System.out.print("Bottom = "+bottom+"\nRight = "+right+"\nLeft = "+left+"\nTop = "+top+"\n");
        int counter =1;
        //loop to traverse all elements til collision
        while(left<right && top<bottom)
        {
            //loop to print first row
            for(int i = left;i< right ;++i)
            {
                arr[top][i] = counter;
                //System.out.println(counter);
                counter++;
            }
            top++;

            //loop to print last col
            for(int i = top; i<bottom;++i)
            {
                arr[i][right-1] = counter;
                //System.out.println(counter);
                counter++;
            }
            right--;

            //checking collision condition
            if(top<bottom)
            {  
                //loop for last row
                for(int i = right-1; i>=left;--i)
                {
                    arr[i][bottom-1] = counter;
                    //System.out.println(counter);
                    counter++;
                }
                bottom--;
            }
            //checking collision condition
            if(left<right)
            {  
                //loop for first col
                for(int i = bottom-1; i>=top;--i)
                {
                    //System.out.println(i+"< i top >"+ top);
                    arr[i][left] = counter;
                    //System.out.println(counter);
                    counter++;  
                    //System.out.println("hello");
                }
                left--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}
