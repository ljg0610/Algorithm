import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
        }

        char[] dnaChar = {'A', 'C', 'G', 'T'};
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 0; i < m; i++) {
            int[] dna = new int[4];
            int max = 0;

            for (int j = 0; j < n; j++) {
                char c = input[j].charAt(i);
                if (c == 'A') {
                    dna[0]++;
                } else if (c == 'C') {
                    dna[1]++;
                } else if (c == 'G') {
                    dna[2]++;
                } else if (c == 'T') {
                    dna[3]++;
                }
            }

            int cnt = 0;
            for (int k = 0; k < 4; k++) {
                if (max < dna[k]) {
                    max = dna[k];
                    cnt = k;
                }
            }

            sum += n - max;

            sb.append(dnaChar[cnt]);
        }

        sb.append('\n').append(sum);
        System.out.println(sb);
    }
}