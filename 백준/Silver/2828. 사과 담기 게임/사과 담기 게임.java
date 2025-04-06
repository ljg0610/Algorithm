import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());

        int posLeft = 1;
        int posRight = m;
        int cnt = 0;

        for (int i = 0; i < j; i++) {
            int drop = Integer.parseInt(br.readLine());

            if (drop < posLeft) {
                int move = posLeft - drop;
                posLeft -= move;
                posRight -= move;
                cnt += move;
            } else if (drop > posRight){
                int move = drop - posRight;
                posLeft += move;
                posRight += move;
                cnt += move;
            }
        }

        System.out.println(cnt);
    }
}