import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] order = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            order[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(order);

        int sum = 0;

        for (int i = 1; i < n; i++) {
            order[i] += order[i-1];
        }

        for (int i = 0; i < n; i++) {
            sum += order[i];
        }

        System.out.println(sum);
    }
}