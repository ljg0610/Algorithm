import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] maxDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i <= t; i++) {
            String input = br.readLine();

            String year = input.substring(0,4);
            int month = Integer.parseInt(input.substring(4,6));
            int day = Integer.parseInt(input.substring(6));

            if (month < 1 || month > 12 || day < 1 || day > maxDays[month]) {
                sb.append("#" + i).append(' ').append(-1).append('\n');
            } else {
                sb.append('#').append(i).append(' ')
                .append(year).append('/')
                .append(String.format("%02d", month)).append('/')
                .append(String.format("%02d", day)).append('\n');
            }
        }

        System.out.println(sb);
    }
}