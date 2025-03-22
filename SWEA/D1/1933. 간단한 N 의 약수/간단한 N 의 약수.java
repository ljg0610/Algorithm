import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(1).append(' ');

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i).append(' ');
            }
        }

        System.out.println(sb);
    }
}