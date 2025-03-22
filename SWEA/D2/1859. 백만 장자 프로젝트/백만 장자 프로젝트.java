import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            int[] price = new int[n];

            for (int j = 0; j < n; j++) {
                price[j] = Integer.parseInt(st.nextToken());
            }

            long sell = 0;
            int max = price[n-1];
            for (int j = n - 2; j >= 0; j--) {
                if (price[j] > max) {
                    max = price[j];
                } else {
                    sell += max - price[j];
                }
            }

            sb.append("#" + i).append(' ').append(sell).append('\n');
        }

        System.out.println(sb);
    }
}