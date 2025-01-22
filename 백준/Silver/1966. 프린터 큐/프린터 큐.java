import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    
    static class Document {
        int priority;
        int index;

        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Deque<Document> queue = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.offer(new Document(Integer.parseInt(st.nextToken()), j));
            }

            sb.append(printer(n, m, queue)).append('\n');
        }

        System.out.println(sb.toString());
    }

    private static int printer(int n, int m, Deque<Document> queue) {
        int cnt = 0;

        while (!queue.isEmpty()) {
            Document current = queue.pollFirst();
            boolean isPriority = false;

            for (Document document : queue) {
                if (document.priority > current.priority) {
                    isPriority = true;
                    break;
                }
            }

            if (isPriority) {
                queue.offerLast(current);
            } else {
                cnt++;
                if (current.index == m) {
                    return cnt;
                }
            }
        }

        return cnt;
    }
}