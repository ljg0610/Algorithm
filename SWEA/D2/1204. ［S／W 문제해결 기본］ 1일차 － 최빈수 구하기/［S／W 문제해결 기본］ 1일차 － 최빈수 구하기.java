import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            
            st = new StringTokenizer(br.readLine());
            int[] students = new int[101];

            for (int j = 0; j < 1000; j++) {
                students[Integer.parseInt(st.nextToken())]++;
            }

            int maxScore = 0;
            int maxCount = 0;

            for (int j = 100; j >= 0; j--) {
                if (maxCount < students[j]) {
                    maxCount = students[j];
                    maxScore = j;
                }
            }

            sb.append("#" + n).append(' ').append(maxScore).append('\n');
        }

        System.out.println(sb);
    }
}