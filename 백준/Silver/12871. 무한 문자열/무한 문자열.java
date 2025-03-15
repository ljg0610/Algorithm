import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        int sLen = s.length();
        int tLen = t.length();

        int lcm = sLen * tLen / gcd(sLen, tLen);

        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();

        while (sbS.length() < lcm) {
            sbS.append(s);
        }
        
        while (sbT.length() < lcm) {
            sbT.append(t);
        }

        System.out.println(sbS.toString().equals(sbT.toString()) ? 1: 0);

    }

    private static int gcd(int sLen, int tLen) {
        if (tLen == 0) {
            return sLen;
        }
        return gcd(tLen, sLen % tLen);
    }
}