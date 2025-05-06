import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= t; tc++) {
            String input = br.readLine();
            StringBuilder inputSb = new StringBuilder();
            inputSb.append(input);
            

            int result = input.equals(inputSb.reverse().toString()) ? 1 : 0;

            sb.append('#').append(tc).append(' ').append(result).append('\n');
        }

        System.out.println(sb);
    }
}