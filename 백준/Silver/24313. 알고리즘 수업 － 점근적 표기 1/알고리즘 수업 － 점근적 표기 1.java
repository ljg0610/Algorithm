import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int aZero = Integer.parseInt(st.nextToken());
        int aOne = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int nZero = Integer.parseInt(br.readLine());

        System.out.println(bigO(aZero, aOne, c, nZero));
    }

    public static int bigO(int aZero, int aOne, int c, int nZero) {
        while (nZero <= 100) {
            int first = (aZero * nZero) + aOne;
            int second = c * nZero;
            if(first > second) {
                return 0;
            }
            nZero++;
        }

        return 1;
    }
}
