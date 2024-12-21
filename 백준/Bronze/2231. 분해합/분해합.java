import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        while (cnt <= n) {
            int sum = cnt;
            int num = cnt;

            while (num / 10 != 0) {
                sum += num % 10;
                num /= 10;
            }
            sum += num;
            
            if(sum == n) {
                System.out.println(cnt);
                return;
            }

            cnt++;
        }

        if(cnt > n) {
            System.out.println(0);
        }
    }
}
