import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> words = new ArrayList<>();
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            words.add(input);
            maxLen = Math.max(maxLen, input.length());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            for (String word : words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
