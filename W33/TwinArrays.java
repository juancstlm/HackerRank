package W33;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Juan Castillo on 6/13/2017.
 */
public class TwinArrays {
    static int twinArrays(int[] ar1, int[] ar2){
        int sum = 0;

        TreeMap<Integer,Integer> array1 = intIndex(ar1);
        TreeMap<Integer,Integer> array2 = intIndex(ar2);

        Iterator<Integer> iter1 = array1.keySet().iterator();
        Iterator<Integer> iter2 = array2.keySet().iterator();



        int smal1 = iter1.next();
        int smal2 = iter2.next();

        sum = smal1 + smal2;

        while(array1.get(smal1) == array2.get(smal2)){
            int t1 = iter1.next();
            int t2 = iter2.next();
            if((smal1 + t2 ) > (smal2 +t1)){
                return smal2 +t1;
            } else{
                return smal1 +t2;
            }
        }

        return sum;
    }

    static TreeMap<Integer, Integer> intIndex(int[] array){
        TreeMap<Integer,Integer> returned = new TreeMap<>();
        for(int i = 0; i < array.length; i++){
            returned.put(array[i],i);
        }
        return returned;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}
