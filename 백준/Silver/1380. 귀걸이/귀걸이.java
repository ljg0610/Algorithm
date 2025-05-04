import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int idx = 1;
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println(sb);
                return;
            }

            String[] students = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                students[i] = br.readLine();
            }

            int[] nums = new int[n + 1];
            
            for (int j = 0; j < (n * 2) - 1; j++) {
                st = new StringTokenizer(br.readLine());

                int num = Integer.parseInt(st.nextToken());
                String alpha = st.nextToken();

                nums[num]++;
            }
            
            for (int k = 1; k <= n; k++) {
                if (nums[k] != 2) {
                    sb.append(idx++).append(' ').append(students[k]).append('\n');
                }
            }
        }
    }
}