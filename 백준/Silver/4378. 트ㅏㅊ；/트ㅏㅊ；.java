import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final String KEYS = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    sb.append(' ');
                } else {
                    int index = KEYS.indexOf(input.charAt(i));
                    sb.append(KEYS.charAt(index - 1));
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}