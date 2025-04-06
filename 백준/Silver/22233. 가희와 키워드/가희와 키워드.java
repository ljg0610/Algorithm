import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        Set<String> memo = new HashSet<>();

        for (int i = 0; i < n; i++) {
            memo.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String[] blog = br.readLine().split(",");

            for (String keyword : blog) {
                memo.remove(keyword);
            }
            sb.append(memo.size()).append('\n');
        }

        System.out.println(sb);
    }
}