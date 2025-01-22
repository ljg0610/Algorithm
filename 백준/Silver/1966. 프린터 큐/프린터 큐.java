import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[] {priority, j});
                priorityQueue.offer(priority);
            }

            sb.append(printer(m, queue, priorityQueue)).append('\n');
        }

        System.out.println(sb.toString());
    }

    private static int printer(int m, Queue<int[]> queue, PriorityQueue<Integer> priorityQueue) {
        int cnt = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentPriority = current[0];
            int currentIndex = current[1];

            if (currentPriority == priorityQueue.peek()) {
                cnt++;
                priorityQueue.poll();
                if (currentIndex == m) {
                    return cnt;
                }
            } else {
                queue.offer(current);
            }
        }

        return cnt;
    }
}