import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 0; i--) {
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }
}