import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println(lcm(a, b));
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b =tmp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
