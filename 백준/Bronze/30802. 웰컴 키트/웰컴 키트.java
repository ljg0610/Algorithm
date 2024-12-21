import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ts = new int[6];
        for (int i = 0; i < ts.length; i++) {
            ts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int cntT = 0;
        for (int i = 0; i < ts.length; i++) {
            if(ts[i] % t != 0) {
                cntT += (ts[i] / t) + 1;
            } else {
                cntT += ts[i] / t;
            }
            
        }

        System.out.println(cntT);
        System.out.println(n/p + " " + n%p);
    }
}
