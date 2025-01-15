import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> card = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            card.offer(i);
        }

        while (card.size() > 1) {
            card.remove();

            int down = card.peek();
            card.remove();
            card.offer(down);
        }

        System.out.println(card.peek());
    }
}