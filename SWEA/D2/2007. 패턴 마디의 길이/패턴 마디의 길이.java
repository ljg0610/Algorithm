import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= t; tc++) {
            String input = br.readLine();

            for (int i = 1; i < input.length(); i++) {
                String madi = input.substring(0, i);
                String word = input.substring(i, i+i);
                if (madi.equals(word)) {
                    sb.append("#" + tc).append(' ').append(i).append('\n');
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}