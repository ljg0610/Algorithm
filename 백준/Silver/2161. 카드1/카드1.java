import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> cardQueue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            cardQueue.add(i);
        }

        for (int i = 1; i < n; i++) {
            sb.append(cardQueue.poll()).append(" ");

            int down = cardQueue.poll();

            cardQueue.add(down);
        }

        sb.append(cardQueue.poll());
        
        System.out.println(sb.toString());
    }
}
