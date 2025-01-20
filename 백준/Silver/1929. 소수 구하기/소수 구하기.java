import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        searchAllDecimal(m, n);
    }

    private static void searchAllDecimal(int m, int n) {
        StringBuilder sb = new StringBuilder();

        while (m <= n) {

            if (m == 0 || m == 1) {
                m++;
                continue;
            }
            boolean flag = true;

            for (int i = 2; i * i <= m; i++) {
                if (m % i == 0) {
                    flag =false;
                    break;
                }
            }

            if (flag) {
                sb.append(m).append('\n');
            }
            m++;
        }

        System.out.println(sb.toString());
    }
}