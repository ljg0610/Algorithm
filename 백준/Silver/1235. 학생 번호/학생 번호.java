import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
        }

        int len = input[0].length();
        for (int k = 1; k <= len; k++) {
            Set<String> studentSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                studentSet.add(input[i].substring(len - k));
            }
            if (studentSet.size() == n) {
                System.out.println(k);
                return;
            }
        }
    }
}