import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputs = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputs.length(); i++) {
            sb.append(inputs.charAt(i) - 64).append(' ');
        }

        System.out.println(sb);
    }
}