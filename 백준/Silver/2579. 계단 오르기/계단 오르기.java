import java.io.*;

public class Main {
    static int n;
    static int[] steps;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        steps = new int[n+1];

        for (int i = 1; i <= n; i++) {
            steps[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println(gameScore());

    }

    private static int gameScore() { 
        if (n == 1) {
            return steps[1];
        } else if (n == 2) {
            return steps[1] + steps[2];
        }

        int[] dp = new int[n + 1];
        dp[1] = steps[1];
        dp[2] = steps[1] + steps[2];
        
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2] + steps[i], dp[i-3] + steps[i-1] + steps[i]);
        }

        return dp[n];
    }
}