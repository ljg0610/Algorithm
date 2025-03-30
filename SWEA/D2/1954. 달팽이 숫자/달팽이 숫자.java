import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        StringBuilder sb = new StringBuilder();

        for (int test = 1; test <= t; test++) {
            int num = Integer.parseInt(br.readLine());

            int x = 0;
            int y = 0;
            int dir = 0;
            int[][] arr = new int[num][num];

            for (int i = 1; i <= num * num; i++) {
                arr[x][y] = i;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= num || ny >= num || arr[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
            }

            sb.append("#" + test).append('\n');
            for(int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    sb.append(arr[j][k]).append(' ');
                }
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}