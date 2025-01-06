import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> cardQueue = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            cardQueue.add(i);
        }

        while (!cardQueue.isEmpty()) {
            sb.append(cardQueue.poll()).append(" ");
            if (!cardQueue.isEmpty()) {
                cardQueue.add(cardQueue.poll());
            }
        }

        System.out.println(sb.toString());
    }
}
