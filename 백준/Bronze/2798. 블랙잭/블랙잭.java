import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] card = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < card.length - 2; i++) {
            for (int j = i + 1; j < card.length - 1; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if(sum <= m && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
