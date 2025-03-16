import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String finder = br.readLine();
        int n = Integer.parseInt(br.readLine());
        
        String input = "";
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            input = br.readLine();

            if (input.contains(finder)) {
                cnt++;
            } else {
                if (input.repeat(2).contains(finder)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}