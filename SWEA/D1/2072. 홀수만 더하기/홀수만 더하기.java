import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {     
                int input = Integer.parseInt(st.nextToken());
                if (input % 2 == 1) {
                    sum += input;
                }           
            }

            sb.append("#" + i).append(' ').append(sum).append('\n');
        }

        System.out.println(sb);

    }
}