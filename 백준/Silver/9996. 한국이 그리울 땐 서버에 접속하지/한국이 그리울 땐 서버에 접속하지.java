import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] pattern = br.readLine().split("\\*");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.length() < pattern[0].length() + pattern[1].length()) {
                sb.append("NE\n");
            } else if (input.startsWith(pattern[0]) && input.endsWith(pattern[1])) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }

        System.out.println(sb);
    }
}