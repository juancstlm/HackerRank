package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Juan Castillo on 5/28/2017.
 */
public class PlusMinus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double plus = 0;
        int minus = 0;
        int zero = 0;
        int n = in.nextInt();
        for(int i = 0; i<n; i++){
            int integer = in.nextInt();
            if(integer > 0){
                plus++;
            } else if(integer < 0){
                minus++;
            } else{
                zero++;
            }
        }

        System.out.println((plus/n));
        System.out.println(minus/n);
        System.out.println(zero/n);
    }
}
