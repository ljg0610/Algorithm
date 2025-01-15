import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) throws IOException {
        final String PUSH = "push";
        final String POP = "pop";
        final String SIZE = "size";
        final String EMPTY = "empty";
        final String TOP = "top";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line.startsWith(PUSH)) {
                stack.push(Integer.parseInt(line.substring(PUSH.length() + 1)));
            } else if(line.equals(POP)) {
                if (stack.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(stack.pop()).append('\n');
                }
            } else if (line.equals(SIZE)) {
                sb.append(stack.size()).append('\n');
            } else if (line.equals(EMPTY)) {
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            } else if (line.equals(TOP)) {
                if (stack.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(stack.peek()).append('\n');
                }
            }
        }

        System.out.println(sb.toString());
    }
}