import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int SMALL = 3;
    static final int LARGE = 5;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(checkMin(n));
    }

    private static int checkMin(int n) {
        int cntLarge = n / LARGE;

        while (cntLarge >= 0) {
            int remain = n - (cntLarge * LARGE);
            if (remain % SMALL == 0) {
                cntLarge += remain / SMALL;
                return cntLarge;
            }
            cntLarge--;
        }

        return -1;
    }
}