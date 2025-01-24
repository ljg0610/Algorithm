import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        final int NUMS = 20;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            int[] lines = new int[NUMS];
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            for (int j = 0; j < NUMS; j++) {
                lines[j] = Integer.parseInt(st.nextToken());
            }
            sb.append(n).append(' ').append(calculateBack(lines)).append('\n');
        }

        System.out.println(sb.toString());
    }

    private static int calculateBack(int[] lines) {
        LinkedList<Integer> queue = new LinkedList<>();
        int back = 0;

        queue.add(lines[0]);

        for (int i = 1; i < lines.length; i++) {
            int current = lines[i];
            int j = 0;
            
            while (j < queue.size() && queue.get(j) <= current) {
                j++;
            }
            
            back += (queue.size() - j);
            queue.add(j, current);
        }
        return back;
    }
}