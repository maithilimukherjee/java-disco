package pyqs.deloitte;

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = diagonalSum(matrix, n);
        System.out.println(result);

        sc.close();
    }

    public static int diagonalSum(int[][] matrix, int n) {
        // TODO: Implement single-loop O(N) diagonal sum logic here

        int sum1=0;
        int sum2=0;

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(i==j)
                sum1 += matrix[i][j];

                if(i+j==n-1)
                sum2 += matrix[i][j];
            }
        }

        if(n%2==1)
                sum1 = sum1 - matrix[(n-1)/2][(n-1)/2];

        return sum1+sum2;
        
    }
}