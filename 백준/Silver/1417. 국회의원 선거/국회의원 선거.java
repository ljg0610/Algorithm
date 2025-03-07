import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println(0);
            return;
        }
        int me = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> candidate = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < num; i++) {
            candidate.add(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;

        while(!candidate.isEmpty() && candidate.peek() >= me) {
            int top = candidate.poll();
            candidate.add(top - 1);
            me++;
            cnt++;
        }

        System.out.println(cnt);

    }
}