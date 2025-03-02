import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] students = new int[num + 1][5];

        StringTokenizer st;

        for (int i = 1; i <= num; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int captain = 1;

        for (int i = 1; i <= num; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 1; k <= num; k++) {
                    if (students[i][j] == students[k][j] && i != k) {
                        set.add(k);
                    }
                }
            }

            if (set.size() > max) {
                max = set.size();
                captain = i;
            }
        }

        System.out.println(captain);
    }
}
