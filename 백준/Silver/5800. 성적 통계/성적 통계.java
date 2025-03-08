import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());

        for (int i = 1; i <= input; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append("Class ").append(i).append('\n');

            int num = Integer.parseInt(st.nextToken());
            ArrayList<Integer> scores = new ArrayList<>();

            for (int j = 0; j < num; j++) {
                scores.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(scores, Collections.reverseOrder());

            int max = scores.get(0);
            int min = scores.get(scores.size()-1);

            int gap = 0;

            for (int k = 1; k < num; k++) {
                int diff = scores.get(k-1) - scores.get(k);
                if (gap < diff) {
                    gap = diff;
                }
            }

            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap).append('\n');
        }

        System.out.println(sb);
    }
}
