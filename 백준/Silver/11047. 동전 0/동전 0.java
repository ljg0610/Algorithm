import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input <= k) {
                coins.add(input);
            }
        }

        System.out.println(chkCoins(coins, k));

    }

    private static int chkCoins(List<Integer> coins, int k) {
        int cnt = 0;

        for (int i = coins.size() - 1; i >= 0; i--) {
            if (k > 0) {
                cnt += k / coins.get(i);
                k %= coins.get(i);
                if (k == 0) {
                    return cnt;
                }
            } 
        }
        return cnt;
    }
}