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

            int max = Integer.MIN_VALUE; // 학생수
            int idx = 0; //점수

            for (int j = 0; j < 100; j++) {
                if (max <= students[j] && idx < j) {
                    max = students[j];
                    idx = j;
                }
            }

            sb.append("#" + n).append(' ').append(idx).append('\n');
        }

        System.out.println(sb);
    }
}