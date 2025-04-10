import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> serial = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            serial.add(br.readLine());
        }

        serial.sort((a,b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            if (a.length() == b.length()) {
                char[] aArr = a.toCharArray();
                char[] bArr = b.toCharArray();

                int len = a.length();

                int sumA = 0;
                int sumB = 0;

                for (int i = 0 ; i < len; i++) {
                    if (Character.isDigit(aArr[i])) {
                        sumA += aArr[i] - '0';
                    }

                    if (Character.isDigit(bArr[i])) {
                        sumB += bArr[i] - '0';
                    }
                }
                if (sumA != sumB) {
                    return sumA - sumB;
                }
            }
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String key : serial) {
            sb.append(key).append('\n');
        }

        System.out.println(sb);
    }
}