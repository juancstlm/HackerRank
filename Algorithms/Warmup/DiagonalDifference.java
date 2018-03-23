package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Juan Castillo on 5/28/2017.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int diag1 = 0;
        for(int i = 0; i < n ; i++){
            diag1 += arr[i][i];
        }
        int diag2 = 0;
        for(int i = 0; i< n; i++){
            diag2 += arr[i][n-1-i];
        }

        int sol = Math.abs(diag1-diag2);
        System.out.println(sol);
    }
}
