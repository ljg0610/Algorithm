import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.print(calcDate(e, s, m));
    }

    static int calcDate(int e, int s, int m){
        int earth = 0;
        int sun = 0;
        int moon = 0;
        int result = 0;
        while (!(earth == e && sun == s && moon == m)) {
            if(earth > 14){
                earth = 0;
            }
            if(sun > 27){
                sun = 0;
            }
            if(moon > 18){
                moon = 0;
            }
            earth++;
            sun++;
            moon++;
            result++;
        }
        return result;
    }
}