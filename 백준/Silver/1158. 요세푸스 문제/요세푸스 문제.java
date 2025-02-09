import java.io.*;
import java.util.*;

public class Main {
    static Queue<Integer> circle;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        circle = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            circle.offer(i);
        }

        josephus(k);
    }

    private static void josephus(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(!circle.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                circle.offer(circle.poll());
            }
            if (circle.size() != 1) {
                sb.append(circle.poll()).append(", ");  
            } else {
                sb.append(circle.poll()).append(">");  
            }
        }

        System.out.println(sb.toString());
    }
}