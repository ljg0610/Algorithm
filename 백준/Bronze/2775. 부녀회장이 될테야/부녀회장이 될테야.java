import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int MAX_FLOOR = 14;
    private static final int MAX_ROOM = 14;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] apt = new int[MAX_FLOOR + 1][MAX_ROOM + 1];
        for (int i = 1; i <= MAX_ROOM; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int i = 1; i <= MAX_FLOOR; i++) {
            for (int j = 2; j <= MAX_ROOM; j++) {
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
    }
}
