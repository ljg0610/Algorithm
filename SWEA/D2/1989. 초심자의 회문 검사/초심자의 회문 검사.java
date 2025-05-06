import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= t; tc++) {
            String input = br.readLine();
            StringBuilder inputSb = new StringBuilder(input).reverse();

            int result = input.equals(inputSb.toString()) ? 1 : 0;

            sb.append("#" + tc).append(' ').append(result).append('\n');
        }

        System.out.println(sb);
    }
}