import java.io.*;
public class Main {
    static int cnt;
    static String answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        
        if (n.length() == 1) {
            printResult(n, 0);
        } else {
            division(n);
        }
    }

    private static void division(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        cnt++;

        if (sum > 9) {
            division(String.valueOf(sum));
        } else {
            printResult(String.valueOf(sum), cnt);
        }
    }

    private static void printResult(String result, int count) {
        StringBuilder sb = new StringBuilder();
        sb.append(count).append('\n');
        String answer = (Integer.parseInt(result) % 3 == 0) ? "YES" : "NO";
        sb.append(answer);
        System.out.println(sb.toString());
    }
}