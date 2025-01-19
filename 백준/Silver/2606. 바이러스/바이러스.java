import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int[][] graph;
    static Queue<Integer> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        visited = new boolean[n+1];

        //인접행렬로 담기 -> 이차원 배열로 담기
        graph = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //시작노드
            int e = Integer.parseInt(st.nextToken()); //종료노드

            //방향이 없으므로 인접행렬에 값을 1(s로부터 e로 가는 엣지가 존재함)로 변경 
            graph[s][e] = 1;
            //방향이 없으므로 거꾸로도 저장
            graph[e][s] = 1;
        }

        queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        //BFS -> FIFO -> Queue
        System.out.println(bfs(n));
    }

    private static int bfs(int n) {
        int cnt = 0;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 1; i <= n; i++) {
                //직접 연결되어있고 아직 방문하지 않는 노드이면 큐에 넣어서 탐색
                if (graph[now][i] == 1 && !visited[i]) {
                   queue.add(i); //now 에서 i로 감염됨
                   visited[i] = true;
                   cnt++;
                }
            }
        }

        return cnt;
    }
}