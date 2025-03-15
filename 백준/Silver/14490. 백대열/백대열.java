import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int colon = input.indexOf(":");

        int n = Integer.parseInt(input.substring(0, colon));
        int m = Integer.parseInt(input.substring(colon + 1, input.length()));

        int common = gcd(n,m);

        StringBuilder sb = new StringBuilder();
        sb.append(n / common).append(':').append(m / common);
        System.out.println(sb);
    }

    private static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }
}