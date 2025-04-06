import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());


        int posLeft = 1;
        int posRight = m;

        int cnt = 0;

        for (int i = 0; i < j; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input < posLeft) {
                while (input != posLeft) {
                    posLeft--;
                    posRight--;
                    cnt++;
                }
            } else if (input > posRight){
                while (input != posRight) {
                    posRight++;
                    posLeft++;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}