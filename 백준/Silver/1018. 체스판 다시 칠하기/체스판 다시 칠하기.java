import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int RECT_SIZE = 8;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];

        for (int i = 0; i < board.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        br.close();

        int minRepaintCnt = Integer.MAX_VALUE;

        for (int i = 0; i <= n - RECT_SIZE; i++) {
            for (int j = 0; j <= m - RECT_SIZE; j++) {
                int repaintW = repaint(board, i, j, 'W');
                int repaintB = repaint(board, i, j, 'B');

                int currentCnt = Math.min(repaintW, repaintB);
                minRepaintCnt = Math.min(currentCnt, minRepaintCnt);
            }
        }

        System.out.println(minRepaintCnt);
    }

    private static int repaint(char[][] board, int startRow, int startCol, char startColor) {
        int cnt = 0;
        char expectColor = startColor;

        for (int i = startRow; i < startRow + RECT_SIZE; i++) {
            expectColor = (startColor == 'W') ? (i % 2 == 0 ? 'W' : 'B') :  (i % 2 == 0 ? 'B' : 'W');
            for (int j = startCol; j < startCol + RECT_SIZE; j++) {
                if (board[i][j] != expectColor) {
                    cnt++;
                }
                expectColor = (expectColor == 'W') ? 'B' : 'W'; 
            }
        }

        return cnt;
    }
}