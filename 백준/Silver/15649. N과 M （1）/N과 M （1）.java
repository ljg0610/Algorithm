import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n, m;
    private static boolean[] visited;
    private static int[] result;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        result = new int[m];

        dfs(0);
        System.out.println(sb.toString());
    }

    private static void dfs(int depth) {
        //탈출조건 - m개 선택 완료 시 결과 저장
        if (depth == m) {
            for (int answer : result) {
                sb.append(answer).append(' ');
            }
            sb.append('\n');
            return;
        }

        //수행조건 - 1부터 n까지 탐색
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true; // 현재 숫자 방문 체크
                result[depth] = i; // 현재 숫자 저장
                dfs(depth + 1); // 다음 깊이 탐색
                visited[i] = false; // 백트래킹 : 선택 해제
            }
        }
    }
}