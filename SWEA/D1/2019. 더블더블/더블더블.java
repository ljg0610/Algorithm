import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(' ');

        int result = 1;
        
        for (int i = 1; i <= n; i++) {
            result *= 2;
            sb.append(result).append(' ');
        }

        System.out.println(sb);
    }
}