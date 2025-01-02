import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static final int numSize = 10000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[numSize + 1];

        for (int i = 0; i < n; i++) {
            nums[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i <= numSize; i++) {
            while (nums[i] > 0) {
                bw.write(i + "\n");
                nums[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
}
