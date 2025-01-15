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
        final String FRONT = "front";
        final String BACK = "back";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Object> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.startsWith(PUSH)) {
                queue.offer(Integer.parseInt(input.substring(PUSH.length() + 1)));
            } else if (input.equals(POP)) {
                sb.append(queue.isEmpty() ? -1 : queue.pollFirst()).append('\n');
            } else if (input.equals(SIZE)) {
                sb.append(queue.size()).append('\n');
            } else if (input.equals(EMPTY)) {
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            } else if (input.equals(FRONT)) {
                sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append('\n');
            } else if (input.equals(BACK)) {
                sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}