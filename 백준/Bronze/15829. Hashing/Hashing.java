import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        final int r = 31;
        final int m = 1234567891;
        long result = 0;
        long pow = 1;

        for (int i = 0; i < n; i++) {
            int value = s.charAt(i) - 'a' + 1;
            result = (result + value * pow) % m;
            pow = (pow * r) % m ;
        }

        System.out.println(result);
    }
}
