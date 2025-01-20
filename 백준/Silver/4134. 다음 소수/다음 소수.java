import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < test; i++) {
            long n = Long.parseLong(br.readLine());
            sb.append(searchDecimal(n)).append('\n');
        }

        System.out.println(sb.toString());
    }

    private static long searchDecimal(long n) {
        if (n == 0 || n == 1) {
            return 2;
        }

        while (true) {
            boolean flag = true;

            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;            
                }
            }   

            if (flag) {
                return n;
            }

            n++;
        }
    }
}