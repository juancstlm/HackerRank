package W33;

import java.util.Scanner;

/**
 * Created by Juan Castillo on 6/13/2017.
 */
public class PatternCount {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0<q ; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }

    }

    static int patternCount(String s){
        int matches = 0;
        char[] c = s.toCharArray();
        for(int i = 0 ; i < c.length ; i++){
            if(c[i]=='1'){
                int lastZeroIndex = countZeroes(c, i+1);
                if(lastZeroIndex >0){
                    // Check the next index to see if it is a one
                    if(i+lastZeroIndex + 1< c.length){
                        if(c[lastZeroIndex+1+i]=='1'){
                            matches++;
                            i = i+lastZeroIndex;
                        }
                    }
                } else{
                    // No zero found after a '1' match continue to next char
                }
            }
        }
        return matches;
    }

    /**
     * Counts the number of consecutive zeroes in a char array
     * @return
     */
    static int countZeroes(char[] c, int index){
        int matches = 0;
        for(int i = index; i< c.length; i++){
            if(c[i]=='0'){
                matches++;
            } else {
                return matches;
            }
        }
        return matches;
    }
}
