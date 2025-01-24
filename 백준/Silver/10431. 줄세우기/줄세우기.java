import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int NUMS = 20;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;  
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= testCase; i++) {
            int[] lines = new int[NUMS];
            st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            for (int j = 0; j < NUMS; j++) {
                lines[j] = Integer.parseInt(st.nextToken());
            }
            sb.append(i).append(' ').append(calculateBack(lines)).append('\n');
        }

        System.out.println(sb.toString());
    }

    private static int calculateBack(int[] lines) {
        int back = 0;

        for (int i = 0; i < NUMS; i++) {
            for (int j = 0; j < i; j++) {
                if (lines[j] > lines[i]) {
                    back++;
                }
            }
        }

        return back;
    }
}