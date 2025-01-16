import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        final int HALF = 10000000;
        final int ALL = 20000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int[] nArr = new int[ALL + 1];

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nArr[Integer.parseInt(st.nextToken()) + HALF]++;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            sb.append(nArr[Integer.parseInt(st.nextToken()) + HALF]).append(' ');
        }

        System.out.println(sb.toString());
    }
}