import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            sb.append(totalWay(input)).append('\n');
        }

        System.out.println(sb.toString());
    }

    private static int totalWay(int N) {
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 2;
        }
        if (N == 3) {
            return 4;
        } 
        int[] dp = new int[N+1];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
        
            for (int i = 4; i <= N; i++) {
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }

            return dp[N];
    }
}