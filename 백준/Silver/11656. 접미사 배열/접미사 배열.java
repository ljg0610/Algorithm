import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] suffix = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            suffix[i] = input.substring(i);
        }

        Arrays.sort(suffix);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < suffix.length; i++) {
            sb.append(suffix[i]).append('\n');
        }

        System.out.println(sb);
    }
}