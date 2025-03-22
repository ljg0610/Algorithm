import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        sb.append(n).append(' ');

        while (--n >= 0) {
            sb.append(n).append(' ');
        }

        System.out.println(sb);
    }
}