import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        int max = 0;
        int student = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.startsWith("1")) {
                queue.offer(Integer.parseInt(input.substring(2)));
                if (max < queue.size()) {
                    max = queue.size();
                    student = queue.peekLast();
                } else if (max == queue.size() && student > queue.peekLast()) {
                    student = queue.peekLast();
                }
            } else if (Integer.parseInt(input) == 2) {
                queue.poll();
            }
        }

        System.out.println(max + " " + student);
    }
}