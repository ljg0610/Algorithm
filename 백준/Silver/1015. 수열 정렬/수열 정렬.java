import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sequenceAlignment(br);
    }

    private static void sequenceAlignment(BufferedReader br) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
            bArr[i] = aArr[i];
        }

        Arrays.sort(bArr);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (aArr[i] == bArr[j]) {
                    sb.append(j + " ");
                    bArr[j] = -1;
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}