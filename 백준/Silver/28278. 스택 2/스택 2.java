import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.startsWith("1")) {
                stack.push(Integer.parseInt(input.substring(2)));
            } else if (Integer.parseInt(input) == 2) {
                sb.append(!stack.isEmpty() ? stack.pop() : -1).append('\n');
            } else if (Integer.parseInt(input) == 3) {
                sb.append(stack.size()).append('\n');
            } else if (Integer.parseInt(input) == 4) {
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            } else if (Integer.parseInt(input) == 5) {
                sb.append(!stack.isEmpty() ? stack.peek() : -1).append('\n');
            }
        }

        System.out.println(sb);
    }
}