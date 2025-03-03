import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        StringBuilder sb = new StringBuilder();
        final String YES = "Yes";
        final String NO = "No";
        
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] input = line.split(" ");  
            if (input.length < 2) {
                break;
            }
            String s = input[0];
            String t = input[1];
            int idx = 0;

            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == s.charAt(idx)) {
                    idx++;
                }
                
                if (idx == s.length()) {
                    sb.append(YES).append('\n');
                    break;
                }
            }

            if (idx != s.length()) {
                sb.append(NO).append('\n');
            }
        }

        System.out.println(sb);
    }
}
