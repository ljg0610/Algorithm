import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        Set<String> playSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            playSet.add(br.readLine());
        }

        if (game.equals("Y")) {
            int cnt = playSet.size();
            System.out.println(cnt);
            return;
        } else if (game.equals("F")) {
            int cnt = playSet.size();
            System.out.println(cnt / 2);
            return;
        } else if (game.equals("O")) {
            int cnt = playSet.size();
            System.out.println(cnt / 3);
            return;
        }
    }
}