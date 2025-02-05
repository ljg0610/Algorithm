import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int n;
    private static int m;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int answer;

    static class Node {
        int row;
        int col;
        int cnt;

        Node(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] miro = new int[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = input.charAt(j) - '0';
            }
        }

        visited = new boolean[n][m];
        bfs(0, 0, miro);
        System.out.println(answer);
    }

    private static void bfs(int row, int col, int[][] miro) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            // 탈출 조건
            if (cur.row == n - 1 && cur.col == m - 1) {
                answer = cur.cnt;
                return;
            }

            // 수행 조건
            for (int i = 0; i < 4; i ++) {
                int nextRow = cur.row + dx[i];
                int nextCol = cur.col + dy[i];

                if (canMove(nextRow, nextCol, miro)) {
                    visited[nextRow][nextCol] = true;
                    queue.add(new Node(nextRow, nextCol, cur.cnt + 1));
                }
            }
        }
    }

    private static boolean canMove(int nextRow, int nextCol, int[][] miro) {
        return nextRow >= 0 && nextCol >= 0 && nextRow < n && nextCol < m && !visited[nextRow][nextCol] && miro[nextRow][nextCol] == 1;
    }
}