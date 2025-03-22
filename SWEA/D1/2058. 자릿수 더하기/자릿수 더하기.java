import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        while (n > 9) {
            sum += n % 10;
            n /= 10;
        }

        sum += n;

        System.out.println(sum);
    }
}