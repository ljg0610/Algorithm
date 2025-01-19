import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> poketmons = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            poketmons.put(Integer.toString(i), input);
            poketmons.put(input, Integer.toString(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(poketmons.get(br.readLine())).append('\n');
        }

        System.out.println(sb.toString());
    }
}