import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] visited = new int[101][101];
    public static void main(String[] args) throws IOException {
        final int INPUT = 4;
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < INPUT; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int xLeft = Integer.parseInt(st.nextToken());
            int yLeft = Integer.parseInt(st.nextToken());
            int xRight = Integer.parseInt(st.nextToken());
            int yRight = Integer.parseInt(st.nextToken());

            calcRect(xLeft, yLeft, xRight, yRight);
        }

        int result = 0;
        for (int i = 1; i < visited.length; i++) {
            for (int j = 1; j < visited[i].length; j++) {
                if(visited[i][j] == 1) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    private static void calcRect(int xLeft, int yLeft, int xRight, int yRight) {
        for (int i = xLeft; i < xRight; i++) {
            for (int j = yLeft; j < yRight; j++) {
                visited[i][j] = 1;
            }
        }
    }
}
