import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> clothMap = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String item = st.nextToken();
                String kind = st.nextToken();

                clothMap.put(kind, clothMap.getOrDefault(kind, 0) + 1);
            }

            int result = 1;
            for (int value : clothMap.values()) {
                result *= (value + 1);
            }
            sb.append(result - 1).append('\n');
        }

        System.out.println(sb);
    }
}