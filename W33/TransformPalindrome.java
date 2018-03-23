package W33;

import java.util.*;

/**
 * Created by Juan Castillo on 6/14/2017.
 */
public class TransformPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // size of alphabet
        int k = in.nextInt(); // number of characterSet
        int m = in.nextInt(); // size of the string

        DisjointSet set = new DisjointSet(n);
        for(int a0 = 0; a0 < k; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            set.Union(x-1,y-1);
        }
        int s[] = new int[m];
        for(int ai = 0; ai< m; ai++){
            s[ai] = set.find(in.nextInt()-1);
        }

        //int matches = findMaxPalindrome(s,0,m-1);

        int matches = lps(s);
        System.out.println(matches);
    }

    public static int lps(int[] set){
        int[][] memo = new int[set.length][set.length];
        for(int i = 0; i< set.length; i++){
            memo[i][i]=1;
        }
        for(int sublen = 2;sublen<=set.length;sublen++){
            for(int i=0;i<=memo.length-sublen;i++){
                int j = i+sublen-1;
                if(set[i]==set[j] && sublen==2){
                    memo[i][j] = 2;
                }
                else if(set[i]==set[j]){
                    memo[i][j] = memo[i+1][j-1]+2;
                }
                else{
                    memo[i][j] = Math.max(memo[i+1][j],memo[i][j-1]);
                }
            }
        }
        return memo[0][set.length-1];
    }

    static class DisjointSet {

        int[] parent;
        int[] rank;
        int size;

        DisjointSet(int size){
            this.size = size;
            this.parent = new int[size];
            this.rank = new int[size];
            makeSet();
        }

        void makeSet(){
            for(int i = 0; i < size; i++){
                parent[i] = i;
            }
        }

        int find(int x){
            if (parent[x] == x){
               return x;
            } else {
                return find(parent[x]);
            }
        }

        void Union(int a, int b){
            int parentA = find(a);
            int parentB = find(b);

            if(parentA == parentB){
                return;
            }

            if(rank[parentA] < rank[parentB]){
                parent[parentA] = parentB;
            } else if(rank[parentB] <  rank[parentA]){
                parent[parentB] = parentA;
            }
            else{
                parent[parentB] = parentA;

                rank[parentA] = rank[parentA] + 1;
            }

        }
    }
}
