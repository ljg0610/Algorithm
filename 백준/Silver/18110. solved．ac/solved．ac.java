import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] opinion = new int[n];

        int k = (int)Math.round((double)n * 0.15);

        for (int i = 0; i < n; i++) {
            opinion[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(opinion);

        int sum = 0;

        for (int i = k; i < n - k; i++) {
            sum += opinion[i];
        }

        int result = (int)Math.round((double)sum / (n - (k * 2)));

        System.out.println(result);
    }
}