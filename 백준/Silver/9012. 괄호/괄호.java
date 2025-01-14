import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            sb.append(checkPs(line) + "\n");
        }
        br.close();

        System.out.println(sb.toString());
    }

    private static String checkPs(String line) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ps : line.toCharArray()) {
            if (ps == '(') {
                stack.push(ps);
            } else if (ps == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}