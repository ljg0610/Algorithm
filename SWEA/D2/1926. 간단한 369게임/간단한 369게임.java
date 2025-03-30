import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("3")|| String.valueOf(i).contains("6") || String.valueOf(i).contains("9")) {
                char[] nums = String.valueOf(i).toCharArray();
                for(int j = 0; j < nums.length; j++) {
                    if (nums[j] == '3' || nums[j] == '6' || nums[j] == '9') {
                        sb.append('-');
                    }
                }
                sb.append(' ');
            } else {
                sb.append(i).append(' ');
            }
        }

        System.out.println(sb);
    }
}