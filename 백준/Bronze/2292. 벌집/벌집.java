import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(numChecks(n));
    }

    static int numChecks(int n) {
        if(n == 1) {
            return 1;
        }

        int layer = 1;
        int maxNum = 1;

        while (maxNum < n) {
            layer++;
            maxNum += 6 * (layer - 1);
        }

        return layer;
    }
}
