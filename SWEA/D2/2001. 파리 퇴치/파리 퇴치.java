import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int test_case = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= test_case; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n + 1][n + 1]; // 입력 배열
            int[][] sum = new int[n + 1][n + 1]; // 누적합 배열

            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());

                    // 누적합 계산
                    sum[i][j] = arr[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
                }
            }

            int max = 0;

            for (int i = m; i <= n; i++) {
                for (int j = m; j <= n; j++) {
                    int total = sum[i][j]
                              - sum[i - m][j]
                              - sum[i][j - m]
                              + sum[i - m][j - m];
                    max = Math.max(max, total);
                }
            }

            sb.append("#").append(t).append(" ").append(max).append("\n");
        }

        System.out.print(sb);
    }
}
