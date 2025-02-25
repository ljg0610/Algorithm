import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int num = input;
        int cnt = 0;

        do {
            int sum = (num / 10) + (num % 10);
            num = (num % 10) * 10 + (sum % 10);
            cnt++;
        } while (input != num);

        System.out.println(cnt);
    }
}