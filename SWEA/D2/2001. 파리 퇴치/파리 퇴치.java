import java.io.*;
import java.util.*;
 
class Solution {
    public static void main(String[] args) throws IOException {
        // 누적합은 추가 배열 생성, 수식 연산 등 비용 있어 입력 크기가 작은 이 문제에서는 완전탐색이 효율이 더 좋다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int test_case = Integer.parseInt(br.readLine());
 
        StringBuilder sb = new StringBuilder();
 
        for (int t = 1; t <= test_case; t++) {
            st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
 
            int[][] arr = new int[n][n];
 
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
 
            int max = 0;
 
            for (int i = 0; i <= n - m; i++) {
                for (int j = 0; j <= n - m; j++) {
                    int sum = 0;
                    for (int x = i; x < i + m; x++) {
                        for (int y = j; y < j + m; y++) {
                            sum += arr[x][y];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
 
            sb.append("#" + t).append(' ').append(max).append('\n');
        }
 
        System.out.println(sb);
    }
}