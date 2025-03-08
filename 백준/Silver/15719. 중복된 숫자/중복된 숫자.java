import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            arr[m]++;
            if (arr[m] != 1) {
                System.out.println(m);
                return;
            }
        }
    }
}
