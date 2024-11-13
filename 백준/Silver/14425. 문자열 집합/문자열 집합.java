import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> baseSet = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            baseSet.add(br.readLine());
        }

        int cnt = 0;

        for(int i = 0; i < m; i++) {
            String comp = br.readLine();
            if(baseSet.contains(comp)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
