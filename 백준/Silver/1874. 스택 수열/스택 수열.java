import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        while (true) {
            if (!stack.isEmpty() && stack != null && stack.peek() == arr[idx]) {
                idx++;
                stack.pop();
                sb.append('-').append('\n');
            } else if (cnt <= n) {
                stack.push(cnt++);
                sb.append('+').append('\n');
            } else {
                System.out.println("NO");
                return;
            }

            if (idx == n) {
                break;
            }
        }

        System.out.println(sb);
    }
}