import java.io.*;
import java.util.*;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix) {
        
        int num = 0;
        int M = matrix.length;
        int N = matrix[0].length;
        boolean firstRow = false,firstCol = false;

        for(int j=0; j<=N-1;j++)
            if(matrix[0][j] == 0)
                firstRow = true;
    
        for(int i=0;i<=M-1;i++)
            if(matrix[i][0] == 0)
                firstCol = true;
        
        for(int i=0;i<=M-1;i++)
        {
            for(int j=0;j<=N-1;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1;i<=M-1;i++)
            {
                for (int j = 1;j<=N-1;j++)
                {
                    if(matrix[0][j] == 0 || matrix[i][0] == 0)
                        matrix[i][j] = 0;
                }
            }

        if(firstRow == true)
            {
                for(int i=0;i<=N-1;i++)
                    matrix[0][i] = 0;
            }
        if(firstCol == true)
            {
                for(int i=0;i<=M-1;i++)
                    matrix[i][0] = 0;
            }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }

        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}