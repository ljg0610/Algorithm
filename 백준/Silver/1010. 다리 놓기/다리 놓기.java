import java.util.*;
import java.io.*;
public class Main {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
    
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int west = Integer.parseInt(st.nextToken());
            int east = Integer.parseInt(st.nextToken());
            sb.append(combination(east, west)).append("\n");
        }
        System.out.println(sb);
    }

    static int combination(int n, int r){
        if(dp[n][r] > 0){
            return dp[n][r];
        }

        if(n == r || r == 0){
            return dp[n][r] = 1;
        }

        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}