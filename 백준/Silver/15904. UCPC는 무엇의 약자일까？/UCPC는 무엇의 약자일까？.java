import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        final String UCPC = "UCPC";
        int idx = 0;
        
        for (int i = 0; i < input.length; i++) {
            if (input[i] == UCPC.charAt(idx)) {
                idx++;
            }

            if (idx == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }

        System.out.println("I hate UCPC");
    }
}
