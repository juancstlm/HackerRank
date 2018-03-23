import java.io.BufferedReader;
import java.math.BigInteger;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;

/**
 * Created by Juan Castillo on 5/26/2017.
 */
public class NumericString {

    public static void main(String[] args) {
        int[] power = new int[3000000+10];
        int sum = 0;
        int ans = 0;
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        power[0] =1;

        for(int i =1; i<=k; i++){
            power[i] = ((power[i-1]%m)*(b%m))%m;
        }

        int i =0;
        for(; i<k; i++){
            int curr_num = (power[k-i-1]%m) * ((s.charAt(i)-'0')%m);
            ans = ((ans%m) + (curr_num%m))%m;
            sum = ans;
        }

        for(; i < s.length(); i++){
            int old_num = ( ( (s.charAt(i-k) - '0') % m) * (power[k - 1] % m) ) % m;
            sum =  ( ((sum % m) - (old_num % m)) + m) % m;
            sum =  ((sum % m) * (b % m)) % m;
            sum = ((sum % m) + ( (s.charAt(i) - '0') % m)) % m;
            ans += sum;
        }
        System.out.print(ans);
    }

}
