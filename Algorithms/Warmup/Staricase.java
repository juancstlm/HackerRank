package Algorithms.Warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Juan Castillo on 7/10/2017.
 */
public class Staricase {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        printStaircase(n);
    }

    public static void printStaircase(int n){
        char[] step = new char[n];
        Arrays.fill(step,' ');
        for(int i =1; i<=n;i++) {
            step[n - i] = '#';
            System.out.println(step);
        }
    }
}
