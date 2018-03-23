package Algorithms.Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MInMaxSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5;arr_i++){
            arr[arr_i]= in.nextInt();
        }
        Arrays.sort(arr);
        long sum =0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print((sum-arr[4]) + " " + (sum-arr[0]));
    }
}
