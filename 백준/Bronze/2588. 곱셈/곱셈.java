import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(first * (second % 10)).append('\n');
        sb.append(first * ((second % 100) / 10)).append('\n');
        sb.append(first * (second / 100)).append('\n');
        sb.append(first * second);

        System.out.println(sb);
    }
}
