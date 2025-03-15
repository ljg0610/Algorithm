import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final String PI = "pi";
        final String KA = "ka";
        final String CHU = "chu";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        while(!s.isEmpty()) {
            if (s.startsWith(PI)) {
                s = s.substring(PI.length(), s.length());
            } else if (s.startsWith(KA)) {
                s = s.substring(KA.length(), s.length());
            } else if (s.startsWith(CHU)) {
                s = s.substring(CHU.length(), s.length());
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}