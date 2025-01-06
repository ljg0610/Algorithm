import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int result = change(n);
        bw.write(result + "\n");

        br.close();
        bw.close();
    }

    static int change(int n) {
        int result = 0;
        
        while (n > 0) {
            if(n % 5 == 0) {
                result += n / 5;
                return result;
            }
            n -= 2;
            result++;
        }

        return n < 0 ? -1 : result;
    }
}
