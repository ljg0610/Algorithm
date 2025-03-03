import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        StringBuilder sb = new StringBuilder();
        final String YES = "Yes";
        final String NO = "No";
        
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] input = line.split(" ");  
            char[] s = input[0].toCharArray();
            char[] t = input[1].toCharArray();

            int sIdx = 0;
            int tIdx = 0;

            while(sIdx < s.length && tIdx < t.length) {
                if (s[sIdx] == t[tIdx]) {
                    sIdx++;
                } 
                tIdx++;
            }
            
            sb.append((sIdx == s.length) ? YES : NO).append('\n');
        }

        System.out.println(sb);
    }
}
