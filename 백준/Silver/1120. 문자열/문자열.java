import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int cnt = 0;

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    cnt++;
                }
            }
        } else if (!b.contains(a)) {
            for (int i = 0; i <= b.length() - a.length(); i++) {
                int max = 0;
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(j) != b.charAt(i+j)) {
                        max++;
                    }
                }

                if (i == 0) {
                    cnt = max;
                } else {
                    if (cnt > max) {
                        cnt = max;
                    }
                }
            }
        } 

        System.out.println(cnt);
        
    }
}