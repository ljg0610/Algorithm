import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int testCase = 1; testCase <= 10; testCase++) {
            int n = Integer.parseInt(br.readLine());
            int[] input = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(st.nextToken());    
            }

            int total = 0;

            for (int i = 2; i < n - 2; i++) {
                int currentHeight = input[i];
                
                int maxHeight = Math.max(Math.max(input[i-1], input[i-2]),
                                        Math.max(input[i+1], input[i+2])
                );

                if(currentHeight > maxHeight) {
                    total += currentHeight - maxHeight;
                }
            }

            sb.append("#").append(testCase).append(" ").append(total).append("\n");
        }

        System.out.println(sb.toString());
    }
}
