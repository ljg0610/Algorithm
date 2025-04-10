import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            sb.append("#" + tc).append('\n');

            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[n];
            
            for (int i = 0; i < n; i++) {
                dp[i] = 1;

                for (int j = i - 1; j > 0; j--) {
                    dp[j] = dp[j] + dp[j-1];
                }

                for (int j = 0; j <= i; j++) {
                    sb.append(dp[j]).append(' ');
                }

                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}